package exam_01;

import java.util.Scanner;

public class HwN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(">>5��");
		System.out.println();
		for (int i = 1; i <= 5; i++) { // 5��
			for (int j = 1; j <= 1 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>6��");
		System.out.println();
		for (int i = 1; i <= 6; i++) { // 6��
			for (int j = 1; j <= 1 * i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>7��");
		System.out.println();
		int i;
		for (i = 1; i <= 3; i++) { // 7��
			for (int j = 1; j <= 1 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("�� �� ���? " + (i - 1));

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>8��");
		System.out.println();
		for (i = 5; i >= 1; i--) { // 8��
			for (int j = 1 * i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>9��");
		System.out.println();
		for (i = 2; i <= 9; i++) { // 9��
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>10��");
		System.out.println();
		System.out.println("������ 2�� ���� 9�ܱ��� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.");
		System.out.println("����� ��(����)�Է�: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (i = 1; i <= 9; i++) { // 10��
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>11��");
		System.out.println();
		System.out.println("1���� �Է��� ���ڱ����� �������� ����Ͻÿ�.");
		System.out.println("���� �Է�: ");
		int num2 = sc.nextInt();
		int sum = 0;

		for (i = 1; i < num2; i++) { // 11��
			sum += i;
		}

		System.out.println("1����" + num2 + "���� ���� " + sum + "�Դϴ�.");

		System.out.println("--------------------------------------");
		System.out.println();

	}
}
