package d20181010;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// Ű���� �Է��� ���� 
public class IOEx5 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\soldesk\\Downloads\\keyboard.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		InputStreamReader isr = new InputStreamReader(System.in); // Scanner ��ɰ� ����
		
		
		// �ܼ� ���� : ctrl + z
		System.out.println("�Է��ϼ��� (���� ctrl + z) ");
		
		int v = 0;
		
		while((v=isr.read()) != -1 ) {
			bos.write(v);
			System.out.print((char)v);
		}
		
		bos.flush();
		bos.close();
		
		System.out.println(" ����Ǿ����ϴ�.");
	}
}
