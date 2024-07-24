package chap19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer extends Thread{
// UDP : 발신자가 일방적으로 수신자에게 데이터를 보내는 방식
	// TCP 보다 데이터 전송 속도가 상대적으로 빠름
// TCP : 연결 요청 및 수락 과정이 있어서 전송 속도가 느림. 데이터의 신뢰성 보장	
	
	private static DatagramSocket datagramSocket = null;
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter 키를 입력하세요.");
		System.out.println("--------------------------------------");
		
		startServer(); //UDP 서버 시작
		
		//키보드 입력
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		stopServer(); //UDP 서버 종료
	}

	
	

	private static void stopServer() {
		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}



	
	public static void startServer(){
		Thread thread = new Thread() {
		@Override
		public void run(){
			try {
				//DatagramSocket 생성 및 Port 바인딩
				datagramSocket = new DatagramSocket(50001);
				System.out.println("[서버] 시작됨");
				while(true) {
					DatagramPacket receivePacket = new DatagramPacket(new byte[1024],1024);
					System.out.println("클라이언트의 희망 뉴스 종류를 얻기 위해 대기함");
					datagramSocket.receive(receivePacket);
					String newsKind = new String(receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
					
					//클라이언트의 IP와 Port 얻기
					SocketAddress socketAddress = receivePacket.getSocketAddress();
					
					//10개의 뉴스를 클라이언트로 전송
					for(int i=1; i<10; i++) {
						String data = newsKind+": 뉴스"+ i;
						byte[] bytes = data.getBytes("utf-8");
						DatagramPacket sendPacket = new DatagramPacket(bytes,0,bytes.length,socketAddress);
						datagramSocket.send(sendPacket);
						Thread.sleep(1000);
					}
				}
			} catch (Exception e) {
				System.out.println("[서버]"+e.getMessage());
			}
		}
	};
	thread.start();
	};
	

}