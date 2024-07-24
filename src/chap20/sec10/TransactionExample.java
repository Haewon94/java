package chap20.sec10;

import java.sql.*;

public class TransactionExample {
public static void main(String[] args) {
	{
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );

            // Transaction 트랜잭션 시작 -> Database 작업의 최소 단위
            // 임의로 데이터베이스를 변경하지 못하도록 설정
            conn.setAutoCommit(false);

            // 출금 작업
            String sql1 = "UPDATE accounts SET balance=balance-? WHERE ano=?";
            // ano 가 ?2 인 account 테이블의 balance 를 (balance - ?1) 로 업데이트 하라
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setInt(1, 10000);
            pstmt1.setString(2, "111-111-1111");
            int rows1 = pstmt1.executeUpdate(); // SQL 실행 후 반영된 튜플의 개수 반환. CREATE, DROP 은 -1 반환
            // if 문 뒤는 단일 문장이므로 {} 없이도 작성 가능.
            // {} 내부에 Exception 을 발생시키고 close() 가 후순위인 경우 작동하지 않음
            if (rows1 == 0) throw new Exception("출금되지 않았음");
            pstmt1.close();
            /*
            if (rows1 == 0){
                pstmt1.close();
                throw new Exception("출금되지 않았음");
            }
            */

            // 입금 작업
            String sql2 = "UPDATE accounts SET balance=balance+? WHERE ano=?";
            // ano 가 ?2 인 account 테이블의 balance 를 (balance + ?1) 로 업데이트 하라
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setInt(1, 10000);
            pstmt2.setString(2, "222-222-2222");
            int rows2 = pstmt2.executeUpdate();
            if (rows2 == 0) throw new Exception("입금되지 않았음");
            pstmt2.close();

            // 수동으로 Commit 커밋 작업
            conn.commit();
            System.out.println("계좌 이체 성공");
            // 트랜잭션 종료!!!

        } catch (Exception e) {
            try {
                // 수동 롤백 -> 모두 실패처리
                conn.rollback();
            } catch (SQLException ex) {
            }
            System.out.println("계좌 이체 실패");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    System.out.println("계좌이체 작업 종료");
                    conn.setAutoCommit(true); // 원래대로 자동 커밋 상태 켜기
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
}
