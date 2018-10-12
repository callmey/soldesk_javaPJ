package d20181011;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//server
public class NetEx03 {
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(5000);
			System.out.println("접속을 기다리는 중");
			
			//소켓(Client) 접속 정보 받기.
			Socket client = ss.accept();
			InetAddress inet = client.getInetAddress();
			
			System.out.println("현재 접속한 pc의 IP:" +
			              inet.getHostAddress());
			
			//I/O
			
			//수신부(지금 나 기준)
			InputStream is = client.getInputStream();
			//발신부(지금 나 기준)
			OutputStream os = client.getOutputStream();
			
			//수신 - bridge
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br =new BufferedReader(isr);
			
			
			
			//송신 - bridge
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			PrintWriter pw = new PrintWriter(bw);
			
			String m = null;
			while((m=br.readLine())!=null) {
				System.out.println(inet.getHostAddress()+":"+m);
				pw.println("서버가 리턴한 메세지 :" + m);
				pw.flush();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
