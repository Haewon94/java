package chap20.sec11;

//게시판 목록 기능

import java.sql.*;
import java.util.Scanner;

public class BoardExample3 {

	// 필드
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;

	// 생성자
	public BoardExample3() {

		try {
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 연결하기
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}

	// 메서드
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("==================================================");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("==================================================");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter", "2024.06.17", "게시판에 오신 것을 환영합니다.");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "winter", "2024.01.31", "올 겨울은 많이 춥습니다");

		// boards 테이블에서 게시물 정보를 가져와서 출력하기
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards ORDER BY bno DESC";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s&-40s\n", board.getBno(), board.getBwriter(), board.getBdate(),
						board.getBtitle());
			}
			// 데이터 트랜잭션 작업 종료
			rs.close();
			// SQL 문 실행 종료
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		mainMenu();
	}

	private void mainMenu() {
		System.out.println();
		System.out.println("==================================================");
		System.out.println("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.nextLine();
		System.out.println();

		switch (menuNo) {
		case "1" -> {
			create();
		}
		case "2" -> {
			read();
		}
		case "3" -> {
			clear();
		}
		case "4" -> {
			exit();
		}
		}
	}

	private void create() {
		System.out.println("*** create() 메서드 실행됨");
		list();
	}

	private void read() {
		System.out.println("*** read() 메서드 실행됨");
		list();
	}

	private void clear() {
		System.out.println("*** clear() 메서드 실행됨");
		list();
	}

	private void exit() {
		System.exit(0);
	}

	public static void main(String[] args) {
		BoardExample3 boardMain = new BoardExample3();
		boardMain.list();
	}
}
