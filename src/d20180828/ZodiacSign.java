package d20180828;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�¾ �⵵ 4�ڸ� �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		// �����ι� ������� ��������
		// ���ȣ�� ��츻�� ���߰���
		// 4 5 6 7 8 9 0 1 2 3 4 5
		
		System.out.println(year);
		
		// �ֿܼ� ����� ~~�� �Դϴ� ����غ�����
		/*
		if((year >= 1984 && year < 1996) || (year >= 1996 && year < 2018) || year >= 2018) {
			for(int i = 0; i < 11; i++) {
				if((year == (1984 + i)) || (year == (1996 + i)) || (year == (2018 + i)))  {
					switch(i) {
						case 0: System.out.println("����� ��� �Դϴ�."); break;
						case 1: System.out.println("����� �Ҷ� �Դϴ�"); break;
						case 2: System.out.println("����� ȣ���̶� �Դϴ�"); break;
						case 3: System.out.println("����� �䳢�� �Դϴ�"); break;
						case 4: System.out.println("����� ��� �Դϴ�"); break;
						case 5: System.out.println("����� ��� �Դϴ�"); break;
						case 6: System.out.println("����� ���� �Դϴ�"); break;
						case 7: System.out.println("����� ��� �Դϴ�"); break;
						case 8: System.out.println("����� �����̶� �Դϴ�"); break;
						case 9: System.out.println("����� �߶� �Դϴ�"); break;
						case 10: System.out.println(i);System.out.println("����� ���� �Դϴ�"); break;
						case 11: System.out.println("����� ������ �Դϴ�"); break;
						}
				}
			}
		}	*/
		
		year %= 12;
		
		if (year==4) {
			System.out.println("����� ��� �Դϴ�.");
		}
		if (year==5) {
			System.out.println("����� �Ҷ� �Դϴ�.");
		}
		if (year==6) {
			System.out.println("����� ȣ���̶� �Դϴ�.");
		}
		if (year==7) {
			System.out.println("����� �䳢��  �Դϴ�.");
		}
		if (year==8) {
			System.out.println("����� ��� �Դϴ�.");
		}
		if (year==9) {
			System.out.println("�����  ��� �Դϴ�.");
		}
		if (year==10) {
			System.out.println("����� ���� �Դϴ�.");
		}
		if (year==11) {
			System.out.println("����� ��� �Դϴ�.");
		}
		if (year==0) {
			System.out.println("����� �����̶� �Դϴ�.");
		}
		if (year==1) {
			System.out.println("����� �߶� �Դϴ�.");
		}
		if (year==2) {
			System.out.println("����� ���� �Դϴ�.");
		}
		if (year==3) {
			System.out.println("����� ������ �Դϴ�.");
		}
		
	}
}


