package d20180829;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ������ ���
		// 2. ������ ¦���� ���
		// 3. 2���� 2*2 ���� ...... 8�� 8*8���� ���
		
		
		
		
		for(int i = 1; i <= 9; i++) { // 1. ������ ���
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		System.out.println();
	
		for(int i = 2; i < 9; i++) { // 2. ������ ¦���� ���
			for(int j = 1; j <= 9; j++) {
				if(i % 2 == 0) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
			
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		System.out.println();

		
		for(int i = 2; i <= 8; i++) { // 3. 2���� 2*2 ���� ...... 8�� 8*8���� ���
			for(int j = 1; j <= i; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.println();
			}
		}
}
