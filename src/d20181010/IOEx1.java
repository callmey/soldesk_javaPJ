package d20181010;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// byte stream
// File~~Stream
public class IOEx1 {
	public static void main(String[] args) throws IOException{ // FileNotFoundException -> IOException(�� ��������ó��)
		File f = new File("C:\\good.txt");
		File f2 = new File("C:\\Users\\soldesk\\Downloads\\good2.txt");
		
		
		// ���Ͽ� �����ؼ� �о����
		FileInputStream fis = new FileInputStream(f);
		
		// ���Ͽ� �����ؼ� ����
		FileOutputStream fos = new FileOutputStream(f2);
		
		
		/*for(int i =0; i<10; i++) {
			int value = fis.read(); // �ƽ�Ű �ڵ� ������ ��ȯ
			System.out.print((char)value);
		}*/
		
		
		System.out.println("------------------------------------");
		
		int v = 0;
		
		// EOF(End of File) : -1 
		
		while((v=fis.read()) != -1) {
			System.out.print((char)v);
			fos.write(v);
		}
	}
}
