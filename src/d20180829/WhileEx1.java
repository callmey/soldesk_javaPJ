package d20180829;

// while문 : for문과 같은 반복문
// while문이 for문보다 조건이 더 간편하다.
public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문 역시 중첩이 가능함. 구구단 9단까지 출력해보세요.

	
		int num = 2;
		while (num <= 9) {
			int dan = 1;
			while (dan <= 9) {
				System.out.println(num + " * " + dan + " = " + (num * dan));
				dan++;
			}
			num++;
		} // 외부 while문 end
		
		System.out.println("-------------------------");

		
		//1부터 10까지의 합(while)
		int sum = 0;
		int n = 1;
		while(n<=10) {
			sum += n;
			n++;
		}
		
		System.out.println(sum);
		
		System.out.println("-------------------------");
		//1부터 100까지 출력(while)
		//100부터 1까지 출력(do~while)
		
		int n1 = 1;
		while(n1<=100) {
			System.out.println(n1); // n1이 100이 되면 출력 후 n1은 101이 됨.
			n1++; //101
		}
		
		System.out.println("--------------");
		
	do {	
			System.out.println(--n1);
		} while (n1 > 1); // n1이 1이 되면 n1 출력 후 중단.

	}
}
