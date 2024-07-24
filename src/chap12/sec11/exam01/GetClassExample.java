package chap12.sec11.exam01;

class GetClassExample {
	public static void main(String[] args) throws Exception {
		//how1 //
		Class clazz = Car.class;
		
		//how2 //클래스 이름만 가지고 Class 객체를 얻는 방법
		//Class clazz = Class.forName("ch12.sec11.exam01.Car");
		
		//how3 //객체로부터 Class 객체를 얻는 방법
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체이름: " + clazz.getName());
		
	}
}	