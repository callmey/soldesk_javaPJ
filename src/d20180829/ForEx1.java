package d20180829;
//사용자로부터 숫자를 하나 입력받아 해당 구구단을 
//출력해보세요

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자 입력: " );
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num+ " * " + i + " = " + (num*i));
		}
		
	}

}
