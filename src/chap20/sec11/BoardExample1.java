package chap20.sec11;

public class BoardExample1 {

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("==================================================");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        /*
        * %-6s%-12s%-16s%-40s
        * % => 포맷 지정자
        * - => 왼쪽 정렬
        * 숫자 => 필드의 너비
        * s => 문자열
        * %-6s: 6자리 너비를 가진 문자열을 왼쪽 정렬하여 출력
        * %-12s: 12자리 너비를 가진 문자열을 왼쪽 정렬하여 출력
        * %-16s: 16자리 너비를 가진 문자열을 왼쪽 정렬하여 출력
        * &-40s: 여기서 &는 정규 표현식이 아니라 문자 그대로 &를 나타내며, -40s는 40자리 너비를 가진 문자열을 왼쪽 정렬하여 출력
        */
        System.out.println("==================================================");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter", "2024.06.17", "게시판에 오신 것을 환영합니다.");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "winter", "2024.01.31", "올 겨울은 많이 춥습니다");

        mainMenu();
    }

    private void mainMenu() {
        System.out.println();
        System.out.println("==================================================");
        System.out.println("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메뉴 선택 : ");
        System.out.println();
    }

    public static void main(String[] args) {
    	BoardExample1 boardMain = new BoardExample1();
        boardMain.list();
    }
}