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
		
		// 파일에 접근해서 읽어올 수 있는 클래스
		FileInputStream fis = new FileInputStream(f);
		
		// 접근 속도를 향상시킬 수 있는 입력 계열 클래스
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// 파일에 접근해서 출력할 수 있는 클래스
		FileOutputStream fos = new FileOutputStream(f2);
		
		// 접근 속도를 향상시킬 수 있는 출력 계열 클래스
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int v = 0;
		while((v=bis.read()) != -1) {
			bos.write(v);
			
			System.out.print((char)v);
		}
		
		// buffer는 내용이 가득차지 않아도 내려쓰게 하는 메소드가 필요
		bos.flush();
		
	}
}
