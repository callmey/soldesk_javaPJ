package d20181012;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		// 1. 서버 쪽 소켓 생성 + 포트 열어주기
		try {
			ServerSocket ss = new ServerSocket(5000);
			
			// 2. 소켓 연결을 반복 - 다중 사용자 받기
			while(true) {
				// 사용자 접속 대기
				System.out.println("사용자 접속 대기 중.....");
				
				// 3. 클라이언트의 소켓 얻어오기
				Socket c = ss.accept(); // 이 정보를 MServer 클래스에 보냄.
				
				/*
				// 4. IP 얻기
				
				// 5. 네트워크 통신을 위한 I/O 연결
				
				// 6. 메세지 반복해서 읽어온 후 화면에 출력
			
				  while(true)는 다중 사용자를 읽어오는 것뿐 다중 설정을 한 것이 아니므로 멀티스레드가 필요함. */
				
				// 멀티스레드로 동작 - 클라이언트 정보를 전달
				MServer ms =new MServer(c);
				ms.start();
			}
		} 
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
