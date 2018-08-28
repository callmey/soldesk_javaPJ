package d20180828;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int dif;
		// 두 값 중 큰 값을 구하기
		
		 
		if(num1 > num2) {
			big = num1;
			System.out.println(big);
		}
		else {
			big = num2;
			System.out.println(big);
		}
		
		System.out.println("-----------------------");
		
		
		// 두 수 차의 절대값을 구해보세요
		if(num1-num2 < 0) {
			dif = -(num1-num2);
			System.out.println(dif);
		}
		else {
			dif = num1-num2;
			System.out.println(dif);
		}
		
		System.out.println("-----------------------");
		
		if(num1 > num2) {
			dif = num1 - num2;
			System.out.println(dif);
		}
		else {
			dif = num2 - num1;
			System.out.println(dif);
		}
		
		
	} 

}
