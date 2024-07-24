package chap17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("고말숙", "여", 90));
		totalList.add(new Student("따효니", "남", 89));
		totalList.add(new Student("플러리", "남", 88));
		totalList.add(new Student("짬타", "여", 87));
		
		//남학생만 묶어 List 생성
		//List<Student> maleList = totalList.stream()
		//.filter(s->s.getSex().equals("남"))
		//.collect(Collectors.toList());
		
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.toList();
		maleList.stream()
			.forEach(s->System.out.println(s.getName()));
		
		System.out.println();
		
		//학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(Collectors.toMap(
						s->s.getName(),
						s->s.getScore()
						)
						);
		System.out.println(map);
						

	}

}
