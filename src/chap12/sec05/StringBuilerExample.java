package chap12.sec05;

public class StringBuilerExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")//문자열의 끝에 추가
				.insert(0, "ABC") // 문자열을 지정위치에 추가
				.delete(3, 4) //3번 인덱스부터 (4-1)인덱스 삭제(D)
								//인덱스는 0번부터
				.replace(0, 1, "12")//0번 인덱스를 12로 교체
				.toString();
		System.out.println(data);
		//메서드 체이닝 패턴 사용
		//StringBuilder가 제공하는 조작 메서드는 StringBuilder를 
		//다시 리턴하기 때문에 연이어서 다른 메서드를 호출할 수 있는
		//메서드 체이닝 패턴을 사용할 수 있음
	}

}
