package d20181005;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File f = new File("C:\\Hello.java"); 
		// \�� ����� -> \\(2��)�� ��� \(�Ѱ�)�� �ν� 
		
		if(f.exists()) {
			System.out.println("������");
		}else {
			System.out.println("���׿�");
			//f.createNewFile();
		}
		
		// ��ü�� �������� ���丮���� ���θ� �Ǵ�
		if(f.isFile()) {
			System.out.println("�����Դϴ�");
		} else if(f.isDirectory()) {
			System.out.println("���丮�Դϴ�");
		} else {
			System.out.println("??");
		}
		
		// ������ ��θ� ������
		String path = f.getAbsolutePath();
		System.out.println("���� ��� :" + path);
		
		// ��Ŭ���� ��ġ��θ� ��ü�� ���� �� ��ü��
		// �������� ���丮���� ���θ� �Ǵ��ؼ� ����غ�����
		
		File f2 = new File("C:\\eclipse");
		
		// ��ü�� �������� ���丮���� ���θ� �Ǵ�
			if(f2.isFile()) {
				System.out.println("�����Դϴ�");
			} else if(f2.isDirectory()) {
				System.out.println("���丮�Դϴ�");
				// ���丮 ���� ������ �ñ��ϴٸ�
				String[] list = f2.list();
				
				for(String str : list) {
					System.out.println(str); 
				}
				
			} else {
				System.out.println("�����");
			}
;		
	}
}
