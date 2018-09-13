package d20180904;
// SwitchEx3 �� ���� ����� ������ �غ�����

import java.util.Scanner;

public class MethodParam {
	
	//void paramDemo() - call by value ����
	
	void paramDemo(int s1, int s2, int s3) {
		
		String grade;
		int sum = s1 + s2 + s3;
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
		
		System.out.println("����� ��������� " + avg + " �Դϴ�");
		System.out.println("����� ������ " + grade + " �Դϴ�");
		
	}
	
	public static void main(String[] args) {
		
		MethodParam mp = new MethodParam();
		
		System.out.println("����, ����, ���� ������ ���ʴ�� �Է��Ͻÿ�.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : " );
		int score1 = sc.nextInt();
		
		System.out.print("���� ���� �Է� : " );
		int score2 = sc.nextInt();	
		
		System.out.print("���� ���� �Է� : " );
		int score3 = sc.nextInt();
		
		mp.paramDemo(score1, score2, score3);

		
	}
}
