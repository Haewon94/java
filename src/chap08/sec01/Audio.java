package chap08.sec01;

public class Audio implements RemoteControl{
	//implements 키워드는 해당 클래스가 인터페이스를 통해서 사용할수 있다는 표시
	//인터페이스의 추상 메서드를 재정의한 메서드가 존재한다는 뜻
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

}
