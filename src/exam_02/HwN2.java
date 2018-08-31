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
		
		System.out.println("3. 두개 주사위를 던졌을때 합이 4가 되는 모든 경우의수를 출력하는 프로그램을 작성하시오.");
		
		int[] arr1 = {1,2,3,4,5,6}; //첫번째 주사위
		int[] arr2 ={1,2,3,4,5,6}; //두번째 주사위
		
		for(int i = 0; i < arr1.length; i++) { 
			for(int j = 0; j < arr2.length; j++) {
				if((arr1[i] + arr2[j] == 4) || (arr2[i] + arr1[j] == 4)) {
					System.out.println(arr1[i] + " , " +  arr2[j]);
				}
			}
		}
		
		System.out.println("--------------------------------------");
		System.out.println();
		
		System.out.println("4. 구구단 3단을 옆으로 출력하기");

		int dan = 3;
		
		for(int i=1; i<=9; i++) {
			System.out.print(dan + " * " + i + " = " + (dan*i) + "  ");
		}
		
		System.out.println("--------------------------------------");
		System.out.println();
		
		System.out.println("5. 구구단 옆으로 출력하기");
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(dan + " * " + i + " = " + (dan*i) + "  ");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------------");
		System.out.println();
		
		
		System.out.println("6. 화폐교환기 : 사용자로부터 숫자를 입력받아  화폐 몇 장, 동전 몇 개로 교환가능한지 메세지를 출력하시는 코드를 작성하시오");
		System.out.print("숫자 입력 : ");
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
				System.out.println("십원 : " + m2[1] + "개");
			}
			else if(m2[2] != 0) {
				System.out.println("백원 :" + m2[2] + "개");
			}
		//}

	

	}
}
