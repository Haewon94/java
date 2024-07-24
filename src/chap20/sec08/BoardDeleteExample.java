package chap20.sec08;

import java.sql.*;

public class BoardDeleteExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "root", "1234");

			// SQL 문 작성
			String sql = "DELETE FROM boards WHERE bwriter=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter"); // 1번째 ? 인 bwriter 에 "winter" 값을 할당

			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수 : " + rows);
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
