package d20181010;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\soldesk\\Downloads\\Hello.java");
		File f2 = new File("C:\\Users\\soldesk\\Downloads\\CopyHello.java");
		
		// ���Ͽ� �����ؼ� �о�� �� �ִ� Ŭ����
		FileInputStream fis = new FileInputStream(f);
		
		// ���� �ӵ��� ����ų �� �ִ� �Է� �迭 Ŭ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// ���Ͽ� �����ؼ� ����� �� �ִ� Ŭ����
		FileOutputStream fos = new FileOutputStream(f2);
		
		// ���� �ӵ��� ����ų �� �ִ� ��� �迭 Ŭ����
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int v = 0;
		while((v=bis.read()) != -1) {
			bos.write(v);
			
			System.out.print((char)v);
		}
		
		// buffer�� ������ �������� �ʾƵ� �������� �ϴ� �޼ҵ尡 �ʿ�
		bos.flush();
		
	}
}
