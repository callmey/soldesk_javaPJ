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
		
		// 파일 객체에 접근해서 char를 읽을 수 있는 클래스
		FileReader fr = new FileReader(f);
		
		FileWriter fw = new FileWriter(f2);
		
		int v = 0;
		while((v=fr.read()) != -1) {
			fw.write(v);
			System.out.print((char)v);
		}
		
		// char stream은 내부적으로 buffer를 사용하고 있음
		fw.flush();
		fw.close(); // 메모리를 많이 쓰는 것은 닫아줘야 함.
		
	}
}
