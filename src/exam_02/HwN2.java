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
		
		System.out.println("3. �ΰ� �ֻ����� �������� ���� 4�� �Ǵ� ��� ����Ǽ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.");
		
		int[] arr1 = {1,2,3,4,5,6}; //ù��° �ֻ���
		int[] arr2 ={1,2,3,4,5,6}; //�ι�° �ֻ���
		
		for(int i = 0; i < arr1.length; i++) { 
			for(int j = 0; j < arr2.length; j++) {
				if((arr1[i] + arr2[j] == 4) || (arr2[i] + arr1[j] == 4)) {
					System.out.println(arr1[i] + " , " +  arr2[j]);
				}
			}
		}
		
		System.out.println("--------------------------------------");
		System.out.println();
		
		System.out.println("4. ������ 3���� ������ ����ϱ�");

		int dan = 3;
		
		for(int i=1; i<=9; i++) {
			System.out.print(dan + " * " + i + " = " + (dan*i) + "  ");
		}
		
		System.out.println("--------------------------------------");
		System.out.println();
		
		System.out.println("5. ������ ������ ����ϱ�");
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(dan + " * " + i + " = " + (dan*i) + "  ");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------------");
		System.out.println();
		
		
		System.out.println("6. ȭ��ȯ�� : ����ڷκ��� ���ڸ� �Է¹޾�  ȭ�� �� ��, ���� �� ���� ��ȯ�������� �޼����� ����Ͻô� �ڵ带 �ۼ��Ͻÿ�");
		System.out.print("���� �Է� : ");
		Scanner sc2 = new Scanner(System.in);
		String money = sc2.nextLine();
		char[] m = new char[money.length()];
		int[] m2 = new int[m.length];
			
		for(int i=0; i < m.length; i++ ) {
			m[i] = money.charAt(i);
			m[i] -= 48;
			m2[i] = (int)m[i];
			System.out.print(m2[i]+ " ");
		}
		
		
		//for(int i=m.length; i < 0; i--) {
			if(m2[1] != 0) {
				System.out.println("�ʿ� : " + m2[1] + "��");
			}
			else if(m2[2] != 0) {
				System.out.println("��� :" + m2[2] + "��");
			}
		//}

	

	}
}
