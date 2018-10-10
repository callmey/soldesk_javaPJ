package d20181010;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// �ڷ��� ������ �����͸� I/O �� �� ����

public class IOEx7 {
	public static void main(String[] args) throws IOException {
		// primitive.dat
		
		File f = new File("C:\\Users\\soldesk\\Downloads\\primitive.txt");
		
		FileOutputStream fos = new FileOutputStream(f); // ���� ��������
		
		FileInputStream fis = new FileInputStream(f); // ���� �о����
		
		// �� �ڷ������� �����͸� ����  
		DataOutputStream dos = new DataOutputStream(fos);
		
		// �� �ڷ������� �����͸� ���� (ex. ���� ĳ����)
		dos.writeUTF("ȫ�浿"); // �ѱ۷� �� ��
		dos.writeInt(20);
		dos.writeDouble(185.3);
		dos.writeBoolean(false);
		
		// �� �ڷ������� data�� �о���̱�
		DataInputStream dis = new DataInputStream(fis);
		
		// �о���� - ����!! ������ �ڷ� ������� �о����
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		Boolean isChange = dis.readBoolean();
		
		System.out.println("ĳ���͸� : " + name );
		System.out.println("��   ��  : " + age);
		System.out.println("Ű       : " + height);
		System.out.println("�������� : " + isChange);
		
	}
}
