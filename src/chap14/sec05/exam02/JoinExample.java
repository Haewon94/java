package chap14.sec05.exam02;

import java.security.PublicKey;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
			//sumThread가 종료할 때까지 main 스레드는 일시 정지함
		}catch (InterruptedException e) {}
		System.out.println("1~100합: "+sumThread.getSum());

	}

}
