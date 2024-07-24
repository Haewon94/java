package chap15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//Set 컬렉션은 저장 순서가 유지되지 않음
		//Set 컬렉션은 중복 저장할 수 없음
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
				
		//객체 저장 : add()
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");			//<-- 중복 객체이므로 저장하지 않음
		set.add("iBATIS");
				
		//저장된 객체수 출력
		int size = set.size();
		System.out.println("총 객체수: " + size);

	}

}
