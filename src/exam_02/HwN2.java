package exam_02;

import java.util.Scanner;

public class HwN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("> 1. 사용자로부터 입력받은 값이 3의 배수인지 아닌지 출력");
		System.out.println("입력: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println(num + "는 3의 배수입니다.");

		} else {
			System.out.println(num + "는 3의 배수가 아닙니다.");
		}

		System.out.println("--------------------------------------");
		System.out.println();

		System.out.println("> 2. 1부터 100사이의 정수 중 2 또는 3의 배수가 아닌 수의 합계를 구하시오.");

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
