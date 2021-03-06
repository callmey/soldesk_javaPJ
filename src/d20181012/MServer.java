package d20181012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MServer extends Thread{
	
	Socket client;
	
	public MServer(Socket client) {
		this.client = client; // MultiServer 클래스의 소켓 객체를 받음
	}
	
	@Override
	public void run() {
		// 모든 클라이언트와의 통신을 담당하는 코드
		
		// 4. IP 얻기
		InetAddress inet = client.getInetAddress();
		String ip = inet.getHostAddress();
		System.out.println(ip + " 님 입장하셨습니다.");
		
		// 5. 네트워크 통신을 위한 I/O 연결
		try {
			/*InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();*/
			
			PrintWriter pw =
					new PrintWriter(
							new BufferedWriter(
									new OutputStreamWriter(
											client.getOutputStream()))); // 변수를 줄이기 위한 코드
			
			BufferedReader br = // Char형 Reader
					new BufferedReader(
							new InputStreamReader(
									client.getInputStream())); // Byte형 Reader
			
			// 6. 메세지 반복해서 읽어온 후 화면에 출력
			String msg = null;
			while((msg=br.readLine())!= null) {
				System.out.println(ip + " : "+ msg);
				pw.println(msg);
				pw.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
