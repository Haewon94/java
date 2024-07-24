package chap15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		//TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<>();
		                                    //<Person> 생략
		//객체 저장
		treeSet.add(new Person("따효니", 34));
		treeSet.add(new Person("고말숙", 30));
		treeSet.add(new Person("플러리", 36));
		
		//객체를 하나씩 가져오기
		for(Person person : treeSet) {
			System.out.println(person.name + ":"+person.age);
		}
	}

}
