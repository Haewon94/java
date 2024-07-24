package chap08.sec01;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		//rc 변수에 Television 객체를 대입
		rc = new Television();
		//인터페이스를 통해 구현 객체를 사용하려면 인터페이스 변수에 구현 객체의 번지 대입
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
		

	}

}
