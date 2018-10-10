package d20181010;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx5_2 {
	public static void main(String[] args) throws IOException {
File f = new File("C:\\Users\\soldesk\\Downloads\\keyboard_2.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8"); // encoding 설정
		
		
		// 콘솔 종료 : ctrl + z
		System.out.println("입력하세요 (종료 ctrl + z) ");
		
		int v = 0;
		
		while((v=isr.read()) != -1 ) {
			bos.write(v);
			System.out.print((char)v);
		}
		
		bos.flush();
		bos.close();
		
		System.out.println(" 종료되었습니다.");
	}
}
