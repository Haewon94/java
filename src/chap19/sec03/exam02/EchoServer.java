package chap19.sec03.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	
	private static ServerSocket serverSocket = null;
	
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter 키를 입력하세요.");
		System.out.println("--------------------------------------");
		
		startServer(); // TCP 서버 시작
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		
		stopServer();
	}


	private static void stopServer() {
		try {
			serverSocket.close(); // ServerSocket을 닫고 Port 언바인딩
			System.out.println("[서버] 종료됨");
		} catch(IOException e) {}
	}


	private static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//ServerSocket 생성 및 Port 바인딩
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						//연결 수락
						Socket socket = serverSocket.accept();
						//연결된 클라이언트 정보 얻기
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버] " + isa.getHostString() + "의 연결 요청을 수락");
						//-------------------------
						//데이터 받기
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						String message = dis.readUTF();
						//데이터 보내기
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message);
						dos.flush();
						System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);
						//--------------------------
						//연결 끊기
						socket.close();
						System.out.println("[서버] " + isa.getHostName() + "의 연결 끊기");
						
					}
				} catch(IOException e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
	
		//스레드 시작
		thread.start();
	}

}
