package d20181010;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Char Stream - File 

public class IOEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\soldesk\\Downloads\\confidence.txt");
		File f2 = new File("C:\\Users\\soldesk\\Downloads\\copyConf.txt");
		
		// ���� ��ü�� �����ؼ� char�� ���� �� �ִ� Ŭ����
		FileReader fr = new FileReader(f);
		
		FileWriter fw = new FileWriter(f2);
		
		int v = 0;
		while((v=fr.read()) != -1) {
			fw.write(v);
			System.out.print((char)v);
		}
		
		// char stream�� ���������� buffer�� ����ϰ� ����
		fw.flush();
		fw.close(); // �޸𸮸� ���� ���� ���� �ݾ���� ��.
		
	}
}
