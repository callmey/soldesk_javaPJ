package d20181005;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File f = new File("C:\\Hello.java"); 
		// \는 제어문자 -> \\(2개)를 써야 \(한개)로 인식 
		
		if(f.exists()) {
			System.out.println("존재함");
		}else {
			System.out.println("없네요");
			//f.createNewFile();
		}
		
		// 객체가 파일인지 디렉토리인지 여부를 판단
		if(f.isFile()) {
			System.out.println("파일입니다");
		} else if(f.isDirectory()) {
			System.out.println("디렉토리입니다");
		} else {
			System.out.println("??");
		}
		
		// 파일의 경로를 얻어오기
		String path = f.getAbsolutePath();
		System.out.println("파일 경로 :" + path);
		
		// 이클립스 설치경로를 객체로 만들어서 이 객체가
		// 파일인지 디렉토리인지 여부를 판단해서 출력해보세요
		
		File f2 = new File("C:\\eclipse");
		
		// 객체가 파일인지 디렉토리인지 여부를 판단
			if(f2.isFile()) {
				System.out.println("파일입니다");
			} else if(f2.isDirectory()) {
				System.out.println("디렉토리입니다");
				// 디렉토리 내부 정보가 궁금하다면
				String[] list = f2.list();
				
				for(String str : list) {
					System.out.println(str); 
				}
				
			} else {
				System.out.println("몰라요");
			}
;		
	}
}
