package d20180904;

import java.util.Scanner;

public class MultiParam {
	void loginDemo(String id, int pw) {
		//id�� java�̰� pw�� 1234�̸� �α��� ���� �޼��� ���
		if(id.equals("java") && pw == 1234) {
			System.out.println("�α��� ���� �ϼ̽��ϴ�");
		}else {
			System.out.println("ȸ�������ϼ���");
		}
	}//loginDemo() end
	
	public static void main(String[] args) {
		String id = "";
		int pw = 0;
		
		System.out.println("�α��� �Ͻðڽ��ϱ�?");
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ��� : ");
		id = sc.nextLine();
		System.out.println("�н����带 �Է��ϼ��� : ");
		pw = sc.nextInt();
		
		MultiParam mp = new MultiParam();
		mp.loginDemo(id, pw);
	}
}
