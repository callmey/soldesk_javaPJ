package d20181010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// char stream - buffer

public class IOEx4 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\soldesk\\Downloads\\confidence.txt");
		File f2 = new File("C:\\Users\\soldesk\\Downloads\\copyConf.txt");
		
		// ���� ��ü�� �����ؼ� char�� ���� �� �ִ� Ŭ����
		FileReader fr = new FileReader(f);
		
		FileWriter fw = new FileWriter(f2);
		
		BufferedReader br = new BufferedReader(fr); 
		
		BufferedWriter bw = new BufferedWriter(fw); // ���۷� ���θ� ������ ����������.
		
		String s = null;
		
		while((s=br.readLine()) != null) {
			bw.write(s);
			System.out.print(s);
		}
		
		bw.flush();
		bw.close();
		
	}
}
