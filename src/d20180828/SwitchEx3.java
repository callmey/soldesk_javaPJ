package d20180828;

import java.util.Scanner;

// ����, ����, ���� ������ ���ʴ�� �Է¹��� ��
// ��������� ������ ���ϼ���. switch��
public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade = "";
		
		System.out.println("����, ����, ���� ������ ���ʴ�� �Է��Ͻÿ�.");
	
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� ���� �Է� : " );
			int score1 = sc.nextInt();
			
			System.out.print("���� ���� �Է� : " );
			int score2 = sc.nextInt();	
			
			System.out.print("���� ���� �Է� : " );
			int score3 = sc.nextInt();
			
			int sum = score1 + score2 + score3;
			double avg = (sum / 3);
			
			int key = (int)avg / 10;
			
		
		switch(key) {
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6: grade = "D"; break;
		default : grade = "F"; break;
		}
		
		System.out.println("����� ���������" + avg + " �Դϴ�");
		System.out.println("����� ������" + grade + " �Դϴ�");
		
	}

}
