package chap08.sec13;

public class ImplClass implements InterfaceC{
	//상속 받은 InterfaceB에 있는 추상 메서드를 오버라이드 해줌
	@Override
	public void methodA() {
		System.out.println("methodA() 실행");
	}
	@Override
	public void methodB() {
		System.out.println("methodB() 실행");
	}
	
	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}
}
