package d20180828;

import java.util.Scanner;

//switch ��
//��������� if�� ���� ������
//switch���� ���ǽ��� ������������ if������ ������ �ľ��ϱ� ����
//switch������ key ���� �ʿ��ϴ�

// 1���� 5���� ���ڸ� �Է��ϸ� �ش��ϴ� ������ �������� ����غ�����.
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5 ������ ���ڸ� �Է��ϼ���: ");
		int day = sc.nextInt();
		
		System.out.println(day);
		
		String d ="";
		
		switch(day) {
		case 1: 
			d= "Monday"; break;
		case 2: 
			d= "Tuesday"; break;
		case 3: 
			d = "Wednesday"; break;
		case 4: 
			d="Thursday"; break;
		case 5: 
			d = "Friday";break;
		default: 
			System.out.println("�ָ��� ����");
		}
		
		System.out.println("Today is " + d);
	}

}
