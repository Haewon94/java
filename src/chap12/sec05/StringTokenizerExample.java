package chap12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");
		//기호가 여러개일때 .split
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		//기호가 한개일때
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreTokens()) {//남아잇는 문자열 검사
			String token = st.nextToken(); //문자열을 하나씩 가져옴
			System.out.println(token);
		}

	}

}
