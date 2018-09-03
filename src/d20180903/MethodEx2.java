package d20180903;

import java.util.Scanner;

// 1. 두 개의 정수를 전달받기 -3번 
// 2. 두 수 차의 절대값을 계산하여 출력하세요(메소드)

public class MethodEx2 {
	
	void Abs(int x, int y) {
		if(x > y) {
			System.out.println(x + " , " + y + " 의 절대값 : " + (x - y));
		} 
		else {
			System.out.println(x + " , " + y + " 의 절대값 : " + (y - x));
		} //if end
				
	}//abs() end
	
	public static void main(String[] args) {
		MethodEx2 ex = new MethodEx2();
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		while(i<3) {
			System.out.println("숫자 입력 : " );
			int a = sc.nextInt();
			int b = sc.nextInt();
	
			ex.Abs(a,b);
			i++;
		}
		
		
	}
}
