package chap08.sec08;

public class SmartTelevision implements RemoteControl, Searchable{
	//turnOn 추상 메서드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("tv켬");
	}
	//turnOff 추상 메서드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("tv끔");
	}
	//search 추상 메서드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색함");
	}
}
