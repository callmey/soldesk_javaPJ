package d20180828;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ��� : ");
		Scanner sc =new Scanner(System.in);
		
		int score = sc.nextInt();
		String grade = "";
		
		// switch���� case�� �� �ϳ��� �����ǹǷ� 
		// key���� �ϳ��� �ǵ��� ���̰��� �̸� ����
		
		// key���� ���ڸ��� ������ ���̰��� ����
		/*
		 *
		 * 100             A
		 * 99 ~ 90         A
		 * 89 ~ 80         B
		 * 79 ~ 70         C
		 * 69 ~ 60         D
		 * ������                            F
		 *
		 *
		 *
		 *
		 *
		 */
		
		int key = score/10;
		
		switch(key) {
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6: grade = "D"; break;
		default : grade = "F"; break;
		}
		
		System.out.println("����� ������" + grade + "�Դϴ�");
		
	}

}
