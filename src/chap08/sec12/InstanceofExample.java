package chap08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		//구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//ride 메서드 호출시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	//인터페이스 매개변수를 갖는 메서드
	public static void ride(Vehicle vehicle) {
		//instanceof 연산자
		//인터페이스에서도 객체 타입을 확인하기 위해 사용함
		//방법1
		/*if(vehicle instanceof Bus){
		  Bus bus = (Bus) vehicle;
		  bus.checkFare();
		  }
		*/
		
		//방법2
		if(vehicle instanceof Bus bus) {
			//매개값으로 받은 Vehicle에 대입된 객체가 Bus 객체인지 확인함
			bus.checkFare();
		}
		
		vehicle.run();
	}
	
	
}
