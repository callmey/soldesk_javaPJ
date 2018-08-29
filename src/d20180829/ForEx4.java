package d20180829;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 구구단 출력
		// 2. 구구단 짝수단 출력
		// 3. 2단은 2*2 까지 ...... 8단 8*8까지 출력
		
		
		
		
		for(int i = 1; i <= 9; i++) { // 1. 구구단 출력
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		System.out.println();
	
		for(int i = 2; i < 9; i++) { // 2. 구구단 짝수단 출력
			for(int j = 1; j <= 9; j++) {
				if(i % 2 == 0) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
			
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		System.out.println();

		
		for(int i = 2; i <= 8; i++) { // 3. 2단은 2*2 까지 ...... 8단 8*8까지 출력
			for(int j = 1; j <= i; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.println();
			}
		}
}
