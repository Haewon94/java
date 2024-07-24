package chap12.sec07;

import java.util.Arrays;
import java.util.Random;

public class Randomexample {

	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];//선택번호 6개 저장
		Random random = new Random(3);//Random 객체 생성
		System.out.println("선택 번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1; 
			//nextInt(int n): int 타입의 난수를 리턴(0~n-1)
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(3);
		System.out.println("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber); //데이터 값 정렬
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨 여부: ");
		if(result) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		/*random 메서드 : 0.0~1.0 사이의 double 타입 난수를 리턴함
		 * int num = (int)(Math.random()*n) + start;
		 * start 부터 시작하는 n개의 정수를 얻는 공식(start<=~<(start+n)
		 */
		//java.util.Random 클래스를 이용->boolean, int, double 난수를 발생시킴
		//Random() 현재 시간을 이용해서 종자값을 자동 설정함
		//Random(long seed): 주어진 종자값을 사용함, 종자값이 같으면 같은 난수 얻음
		
		
	}

}
