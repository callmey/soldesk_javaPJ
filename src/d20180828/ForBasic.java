package d20180828;
// 반복문(제어문)
// for(초기식; 조건식; 증감식) {
	 
//}

public class ForBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		for(int i=1; i<4; i++) {
			System.out.println("for 반목문 : " + i);
		}
			System.out.println("--------------------------");
			//구구단 3단 출력
			
			for(int j=1; j<10; j++) {
				System.out.println("3 * " + j + "=" + (3*j));
			}
			
			System.out.println("--------------------------");
			//구구단 5단 출력
			
			int dan = 5;
			
			for(int a=1; a<10; a++) {
				System.out.println("5 * " + a + " = " + (dan*a));
			}
			
		}
	}

