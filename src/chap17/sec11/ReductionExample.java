package chap17.sec11;

import java.util.Arrays;
import java.util.List;


public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("고말숙", 90),
				new Student("따효니", 95),
				new Student("플러리", 98)
				);
		
		int sum1 = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		System.out.println("sum1: "+sum1);
		
		int sum2 = studentList.stream()
				.map(Student::getScore)
				.reduce(0,(a,b)->a+b);
		//reduce():다양한 집계 결과물을 만들수 있음
		System.out.println("sum2: "+sum2);

	}

}
