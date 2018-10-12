package d20181011;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOEx8 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Member m = new Member("hong", "1234", "gildong", "yuldong", "hong@gmail.com");
		//java.lang.~~ import되 있었어요.
		File f = new File("C:\\Users\\soldesk\\Downloads\\member.dat");

		FileOutputStream fos = new FileOutputStream(f);

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// java.io.NotSerializableException -- 객체를 그냥 전달하면 exception이 발생한다.
		// 불러올 클래스를 객체 직렬화 해줘야한다.
		oos.writeObject(m);

		// 데이터를 꺼내오기.
		FileInputStream fis = new FileInputStream(f);

		ObjectInputStream ois = new ObjectInputStream(fis);

		// 읽어오는 메소드
		Object obj = ois.readObject();

		Member m2 = (Member) obj;

		System.out.println("id:" + m2.getId());
		System.out.println("pw:" + m2.getPw());
		System.out.println("name:" + m2.getName());
		System.out.println("addrs:" + m2.getAddrs());
		System.out.println("email:" + m2.getEmail());
	}
}
