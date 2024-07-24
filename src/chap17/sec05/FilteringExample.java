package chap17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("고말숙"); list.add("따효니");
		list.add("플러리"); list.add("따효니"); list.add("따순이");
		
		//중복 요소 제거
		list.stream()
		.distinct()
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		//따로 시작하는 요소만 필터링
		list.stream()
		.filter(n->n.startsWith("따"))
		.forEach(n->System.out.println(n));
		System.out.println();
		
		//중복 요소를 먼저 제거하고, 따로 시작하는 요소만 필터링
		list.stream()
		.distinct()
		.filter(n->n.startsWith("따"))
		.forEach(n->System.out.println(n));

	}

}
