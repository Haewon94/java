package chap07.sec11;

public sealed class Person permits Employee, Manager {
	//sealed 키워드를 사용하면 permits 키워드 뒤에 상속 가능한 클래스 이름 적음
	
	//필드
	public String nameString;
	
	//메서드
	public void work() {
		System.out.println("뭐할지 모름");
	}
}
