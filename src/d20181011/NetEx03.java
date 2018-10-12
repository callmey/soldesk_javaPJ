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
			System.out.println("������ ��ٸ��� ��");
			
			//����(Client) ���� ���� �ޱ�.
			Socket client = ss.accept();
			InetAddress inet = client.getInetAddress();
			
			System.out.println("���� ������ pc�� IP:" +
			              inet.getHostAddress());
			
			//I/O
			
			//���ź�(���� �� ����)
			InputStream is = client.getInputStream();
			//�߽ź�(���� �� ����)
			OutputStream os = client.getOutputStream();
			
			//���� - bridge
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br =new BufferedReader(isr);
			
			
			
			//�۽� - bridge
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			PrintWriter pw = new PrintWriter(bw);
			
			String m = null;
			while((m=br.readLine())!=null) {
				System.out.println(inet.getHostAddress()+":"+m);
				pw.println("������ ������ �޼��� :" + m);
				pw.flush();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
