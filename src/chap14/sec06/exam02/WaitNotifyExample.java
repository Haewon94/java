package chap14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);//작업 스레드A생성
		ThreadB threadB = new ThreadB(workObject);//작업 스레드 B 생성
		
		threadA.start();
		threadB.start();

	}

}
