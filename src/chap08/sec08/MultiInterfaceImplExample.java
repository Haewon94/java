package chap08.sec08;

import java.net.URL;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		//RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		//RemoteControl 인터페이스에 선언된 추상 메서드만 호출 가능
		rc.turnOn();
		rc.turnOff();
		
		//Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable searchable = new SmartTelevision();
		//Searchable 인터페이스에 선언된 추상 메서드만 호출 가능
		searchable.search("https://www.youtube.com");

	}

}
