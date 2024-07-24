package chap20.sec07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardUpdateExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "root", "1234");

			// 매개변수화 된 SQL 문 작성
			String sql = new StringBuilder().append("UPDATE boards SET ").append("btitle=?, ").append("bcontent=?, ")
					.append("bfilename=?, ").append("bfiledata=? ").append("where bno=?").toString();
			// Append 사이 공간을 만들어야 하므로 띄어쓰기 조심

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "우주");
			pstmt.setString(2, "천체망원경 사진");
			pstmt.setString(3, "space.jpg");
			pstmt.setBlob(4, new FileInputStream("src/chap20/sec06/image1.jpg"));
			pstmt.setInt(5, 2); // 5번 ?인 컬럼(bno) 에 2번째 튜플을 넣겠다

			// SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수 : " + rows);

			// SQL 문 사용 완료 후 닫기
			pstmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
