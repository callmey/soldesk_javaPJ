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
		
		
		System.out.println("6. ȭ��ȯ�� : ����ڷκ��� ���ڸ� �Է¹޾�  ȭ�� �� ��, ���� �� ���� ��ȯ�������� �޼����� ����Ͻô� �ڵ带 �ۼ��Ͻÿ�.");
		System.out.print("���� �Է� : ");
		Scanner sc2 = new Scanner(System.in);
		int money = sc2.nextInt();
		

		int[] m2 = new int[7];
		
		m2[0] = money/50000; // 85310 / 50000 = 1 
		m2[1] = (money%50000)/10000; // 15310 / 10000 = 1
		m2[2] = ((money%50000)%10000)/5000; // 15310 % 10000 = 5310 / 5000 = 1
		m2[3] = (((money%50000)%10000)%5000)/1000; // 15310 % 10000 = 5310 % 5000 = 310 / 1000. (���� 4000���̶�� ������ ���� �״�� 4000) 4000/1000 = 4 
		m2[4] = ((((money%50000)%10000)%5000)%1000)/500; 
		m2[5] = (((((money%50000)%10000)%5000)%1000)%500)/100;
		m2[6] = (((((money%50000)%10000)%5000)%1000)%500%100)/10;
		
		
		
		System.out.println("������ �� : " + m2[0] + " ��");
		System.out.println("���� �� : " + m2[1] + " ��");
		System.out.println("��õ�� �� : " + m2[2] + " ��");
		System.out.println("õ�� �� : " + m2[3] + " ��");
		System.out.println("����� �� : " + m2[4] + " ��");
		System.out.println("��� �� : " + m2[5] + " ��");
		System.out.println("�ʿ� �� : " + m2[6] + " ��");

	

	}
}
