package exam_02;

import java.util.Scanner;

public class HwN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("> 1. ����ڷκ��� �Է¹��� ���� 3�� ������� �ƴ��� ���");
		System.out.println("�Է�: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println(num + "�� 3�� ����Դϴ�.");

		} else {
			System.out.println(num + "�� 3�� ����� �ƴմϴ�.");
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println("> 2. 1���� 100������ ���� �� 2 �Ǵ� 3�� ����� �ƴ� ���� �հ踦 ���Ͻÿ�.");

		int sum = 0;
		
		for(int i=1; i<=100; i++) { 	 
			if(i % 2 != 0 || i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println("--------------------------------------");
		System.out.println();
		
		

	}
}
