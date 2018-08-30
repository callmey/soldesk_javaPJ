package exam_01;

import java.util.Scanner;

public class HwN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(">>5번");
		System.out.println();
		for (int i = 1; i <= 5; i++) { // 5번
			for (int j = 1; j <= 1 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>6번");
		System.out.println();
		for (int i = 1; i <= 6; i++) { // 6번
			for (int j = 1; j <= 1 * i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>7번");
		System.out.println();
		int i;
		for (i = 1; i <= 3; i++) { // 7번
			for (int j = 1; j <= 1 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("몇 줄 출력? " + (i - 1));

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>8번");
		System.out.println();
		for (i = 5; i >= 1; i--) { // 8번
			for (int j = 1 * i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>9번");
		System.out.println();
		for (i = 2; i <= 9; i++) { // 9번
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>10번");
		System.out.println();
		System.out.println("구구단 2단 부터 9단까지 출력하는 코드를 작성하시오.");
		System.out.println("출력할 단(숫자)입력: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (i = 1; i <= 9; i++) { // 10번
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println(">>11번");
		System.out.println();
		System.out.println("1부터 입력한 숫자까지의 누적합을 출력하시오.");
		System.out.println("숫자 입력: ");
		int num2 = sc.nextInt();
		int sum = 0;

		for (i = 1; i < num2; i++) { // 11번
			sum += i;
		}

		System.out.println("1부터" + num2 + "까지 합은 " + sum + "입니다.");

		System.out.println("--------------------------------------");
		System.out.println();

	}
}
