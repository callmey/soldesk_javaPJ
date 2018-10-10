package d20181010;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 자료형 단위로 데이터를 I/O 할 수 있음

public class IOEx7 {
	public static void main(String[] args) throws IOException {
		// primitive.dat
		
		File f = new File("C:\\Users\\soldesk\\Downloads\\primitive.txt");
		
		FileOutputStream fos = new FileOutputStream(f); // 파일 내보내기
		
		FileInputStream fis = new FileInputStream(f); // 파일 읽어오기
		
		// 각 자료형으로 데이터를 저장  
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 각 자료형별로 데이터를 생성 (ex. 게임 캐릭터)
		dos.writeUTF("홍길동"); // 한글로 쓸 시
		dos.writeInt(20);
		dos.writeDouble(185.3);
		dos.writeBoolean(false);
		
		// 각 자료형으로 data를 읽어들이기
		DataInputStream dis = new DataInputStream(fis);
		
		// 읽어오기 - 유의!! 생성한 자료 순서대로 읽어오기
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		Boolean isChange = dis.readBoolean();
		
		System.out.println("캐릭터명 : " + name );
		System.out.println("나   이  : " + age);
		System.out.println("키       : " + height);
		System.out.println("전직여부 : " + isChange);
		
	}
}
