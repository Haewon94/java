package chap12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "고말숙");
		hashSet.add(s1); // HashSet 에 Student 객체를 추가후 저장
		System.out.println("저장된 객체 수: "+hashSet.size());
		
		Student s2 = new Student(1, "고말숙");
		hashSet.add(s2); // 동등 객체는 중복 저장하지 않음
		System.out.println("저장된 객체 수: "+hashSet.size());
		
		
		Student s3 = new Student(2, "고말숙");
		hashSet.add(s3);
		System.out.println("저장된 객체 수: "+hashSet.size());
		
		
	}

}
