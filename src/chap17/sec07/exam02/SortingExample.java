package chap17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("고말숙", 10));
		studentList.add(new Student("따효니", 30));
		studentList.add(new Student("플러리", 20));
		
		//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
		.sorted((s1,s2)->Integer.compare(s1.getScore(),s2.getScore()))
		.forEach(s->System.out.println(s.getName()+": " + s.getScore()));
		System.out.println();
		
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
		.sorted((s1,s2)->Integer.compare(s2.getScore(),s1.getScore()))
		.forEach(s->System.out.println(s.getName()+": "+s.getScore()));
	} //student 클래스가 Comparable을 구현하고 있지 않기 때문에 비교자를 람다식으로 제공

}
