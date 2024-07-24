package chap17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("고말숙", 95));
		studentList.add(new Student("고말숙", 94));
		studentList.add(new Student("고말숙", 93));
		
		
		//Student를 score 스트림으로 변환
		studentList.stream()
		.mapToInt(s->s.getScore())
		.forEach(score->System.out.println(score));
	}

}
