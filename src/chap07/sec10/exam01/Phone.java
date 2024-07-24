package chap07.sec10.exam01;

public abstract class Phone { //abstract 부모 클래스로만 사용 가능
	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner){
		this.owner = owner;
	}
	
	//메서드 선언
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
