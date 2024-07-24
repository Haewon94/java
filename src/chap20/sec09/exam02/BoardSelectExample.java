package chap20.sec09.exam02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;

public class BoardSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava2", "root", "1234");

			// SLQ 문 만들기
			String sql = ""
					+ "SELECT bno, btitle, bcontent, bwriter, bfilename, bfiledata, bdate FROM boards WHERE bwriter=?";
			// prepareStatement() 로부터 PreparedStatement 를 얻고 ? 에 값을 지정함
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");

			// SQL 문 실행 후에 ResultSet 을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			// 해당하는 데이터가 하나가 아닐 경우 반복을 수행해야 함
			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt(1));
				board.setBtitle(rs.getString(2));
				board.setBcontent(rs.getString(3));
				board.setBwriter(rs.getString(4));
				board.setBfilename(rs.getString(5));
				board.setBfiledata(rs.getBlob(6));
				board.setBdate(rs.getDate(7));

				// 콘솔에 출력
				System.out.println(board);

				// 파일로 저장
				Blob blob = board.getBfiledata();
				if (blob != null) {
					InputStream is = blob.getBinaryStream();
					FileOutputStream os = new FileOutputStream("C:/temp/" + board.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
			}
			// ResultSet 종료
			rs.close();

			// PreparedStatement 종료
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
