package d20180830;

import java.util.Scanner;

//1부터 1000이하의 숫자를 출력(단, 사용자가 입력한 숫자까지)
public class BreakEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		
		for(int i = 1; i<=1000; i++) {
			if(i>value) {
				break;
			}
			System.out.println(i);
			
		}
	}

}
