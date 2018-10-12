package d20181012;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		// 1. ���� �� ���� ���� + ��Ʈ �����ֱ�
		try {
			ServerSocket ss = new ServerSocket(5000);
			
			// 2. ���� ������ �ݺ� - ���� ����� �ޱ�
			while(true) {
				// ����� ���� ���
				System.out.println("����� ���� ��� ��.....");
				
				// 3. Ŭ���̾�Ʈ�� ���� ������
				Socket c = ss.accept(); // �� ������ MServer Ŭ������ ����.
				
				/*
				// 4. IP ���
				
				// 5. ��Ʈ��ũ ����� ���� I/O ����
				
				// 6. �޼��� �ݺ��ؼ� �о�� �� ȭ�鿡 ���
			
				  while(true)�� ���� ����ڸ� �о���� �ͻ� ���� ������ �� ���� �ƴϹǷ� ��Ƽ�����尡 �ʿ���. */
				
				// ��Ƽ������� ���� - Ŭ���̾�Ʈ ������ ����
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
