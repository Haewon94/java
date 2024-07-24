package chap08.sec09;

public interface InterfaceC extends InterfaceA, InterfaceB{
	//추상 메서드
	void methodC();
	//인터페이스는 다른 인터페이스를 다중 상속 할 수 있음
	//자식 인터페이스의 구현 클래스는 자식 인터페이스의 추상 메서드 뿐만 아니라
	//부모 인터페이스의 모든 추상 메서드를 재정의 해야 함
}
