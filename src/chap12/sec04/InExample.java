package chap12.sec04;



public class InExample {

	public static void main(String[] args) throws Exception {
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			//Enter 키를 읽지 않았을 경우에만 실행
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) { //숫자 1 = 유니코드 49
					speed++;
				} else if (keyCode == 50) {//숫자 2키
					speed--;
				} else if (keyCode == 51) { //숫자 3키
					break;
				}
				System.out.println("-------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-------------------------");
				System.out.println("현재 속도 = " + speed);
				System.out.println("선택: ");
			}
			//키를 하나씩 읽음
			//in 필드를 이용해서 read() 메서드를 호출하면
			//입력받은 키의 코드값을 얻음
			
			//read()메서드는 enter 키를 누르기 전까지는 대기상태
			//enter 키를 누르면 입력했던 키들을 하나씩 읽기 시작
			keyCode = System.in.read();
		}
		System.out.println("프로그램 종료");

	}

}
