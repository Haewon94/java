package chap20.sec06;

import java.io.FileInputStream;
import java.sql.*;

public class BoardInsertExample {
	public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );

            // SQL 문 작성
            String sql = "" + "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
                    "VALUES (?, ?, ?, now(), ?, ?)";
            // bno -> Primary Key auto Increment 값을 가져오기 위해 Return 시킴
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, "눈내리는 날");
            pstmt.setString(2, "폭설");
            pstmt.setString(3, "winter");
            pstmt.setString(4, "image1.jpg");
            pstmt.setBlob(5, new FileInputStream("src/chap20/sec06/image1.jpg"));

            // SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수 : " + rows);

            // bno (Auto Increment 된 Primary Key)
            if (rows == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    // 해당하는 ResultSet 인스턴스에 값이 있다면 int 로 받아서 출력해보기
                    int bno = rs.getInt(1); // 1 -> 저장된 튜플의 첫번째 필드인 bno
                    System.out.println("저장된 bno : " + bno);
                }
                // ResultSet 사용이 종료되면 닫기
                rs.close();
            }
            // SQL 문 처리 완료하면 닫기
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
