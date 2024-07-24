package practice_wrapper;

public class WrapperVsPrimitive {

	public static void main(String[] args) {
		int iterations = 1_000_000_000; //반복 횟수 설정, 10억
		long startTime, endTime;
		
		//기본형 long 사용
		long sumPrimitive = 0;
		startTime = System.currentTimeMillis();
		for(int i = 0; i<iterations; i++) {
			sumPrimitive += i;
		}
		endTime = System.currentTimeMillis();
		System.out.println(sumPrimitive);
		System.out.println("기본 자료형 long 실행 시간: "+(endTime-startTime)+"ms");
	
		
		//래퍼 클래스 Long 사용
		int iterations2 = 1_000_000_000; //반복 횟수 설정, 10억
		long startTime2, endTime2;
		
		//기본형 long 사용
		Long sumPrimitive2 = 0L;
		startTime2 = System.currentTimeMillis();
		for(int i = 0; i<iterations2; i++) {
			sumPrimitive2 += i; //오토 박싱 발생
		}
		endTime2 = System.currentTimeMillis();
		System.out.println(sumPrimitive2);
		System.out.println(" Long 실행 시간: "+(endTime2-startTime2)+"ms");
	
		
	}

}
