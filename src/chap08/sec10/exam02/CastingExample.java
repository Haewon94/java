package chap08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare(); xxxxx
		
		//강제 타입 변환후 호출 checkFare()
		Bus bus = (Bus) vehicle;
		bus.run();
		//인터페이스 타입을 구현 클래스 타입으로 변환
		bus.checkFare();

	}

}
