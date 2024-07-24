package chap20.sec09.exam01;

import java.sql.*;
// Lombok 임포트 문제 해결할 것 -> 끄고 다시 설치

public class UserSelectExample {
    public static void main(String[] args) {

        Connection conn = null;
        try {
            // JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );

            // SQL 문
            String sql = "" + "SELECT userid, username, userpassword, usermail, userage " + "FROM users " + "WHERE userid=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            // SQL 문 실행 후, ResultSet 을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                // 데이터 행을 읽고 User 객체 생성
                User user = new User(); // 책에서는 Board 클래스 생성
                user.setUserId(rs.getString("userid"));
                user.setUserName(rs.getString("username"));
                user.setUserPassword(rs.getString(3)); // 순서에 맞게 나열된 컬럼 인덱스를 넣어도 무방
                user.setUserEmail(rs.getString(4));
                user.setUserAge(rs.getInt(5));

                // 콘솔에 출력
                System.out.println(user);
            } else {
                System.out.println("사용자 아이디가 존재하지 않음");
            }
            // ResultSet 닫기
            rs.close();
            // PreparedStatement 닫기
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
