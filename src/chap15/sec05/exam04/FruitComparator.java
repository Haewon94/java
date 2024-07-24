package chap15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price) return -1; //o1이 o2보다 앞에 오면 음수 리턴
		else if(o1.price == o2.price) return 0;
		else return 1; //o1이 o2 보다 뒤에오면(크면) 양수 리턴
	}

}
