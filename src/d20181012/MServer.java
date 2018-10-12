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
		this.client = client; // MultiServer Ŭ������ ���� ��ü�� ����
	}
	
	@Override
	public void run() {
		// ��� Ŭ���̾�Ʈ���� ����� ����ϴ� �ڵ�
		
		// 4. IP ���
		InetAddress inet = client.getInetAddress();
		String ip = inet.getHostAddress();
		System.out.println(ip + " �� �����ϼ̽��ϴ�.");
		
		// 5. ��Ʈ��ũ ����� ���� I/O ����
		try {
			/*InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();*/
			
			PrintWriter pw =
					new PrintWriter(
							new BufferedWriter(
									new OutputStreamWriter(
											client.getOutputStream()))); // ������ ���̱� ���� �ڵ�
			
			BufferedReader br = // Char�� Reader
					new BufferedReader(
							new InputStreamReader(
									client.getInputStream())); // Byte�� Reader
			
			// 6. �޼��� �ݺ��ؼ� �о�� �� ȭ�鿡 ���
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
