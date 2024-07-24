package chap07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		//객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		//Parent 타입으로 필드와 메서드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		//자동 타입변환으로 Child 의 필드와 메서드 사용 불가
		/*
		 * parent.field2 = "data2";  불가능
		 * parent.method3();   불가능
		 */
		
		//강제 타입 변환
		Child child = (Child) parent;
		
		//강제 타입 변환을 해준 뒤에
		//Child 필드와 메서드 사용 가능
		child.field2 = "date2";
		child.method3();

	}

}
