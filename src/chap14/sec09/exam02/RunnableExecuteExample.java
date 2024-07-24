package chap14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		//1000개의 Runnable 을 생성한 다음 execute() 메서드로 작업큐에 넣음
		// ExecutorService 는 최대 5개 스레드로 작업 큐에서 Runnable을
		//하나씩 꺼내어 run() 메서드를 실행하면서 작업을 처리함
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고";
		}
				
		//ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
				
		//메일을 보내는 작업 생성 및 처리 요청
		for(int i=0; i<1000; i++) {
			final int idx = i;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "] " + 
							from + " ==> " + to + ": " + content);
							//어떤 스레드가 어떤 이메일을 처리했는지 알 수 있도록 출력
				}
			});
		}
				
		//ExecutorService 종료
		executorService.shutdown();
		//Shutdown()
		//현재 처리 중인 작업뿐만 아니라 작업 큐에 대기하고 있는 모든 작업을 처리한 뒤에
		// 스레드 풀을 종료 시킴

	}

}
