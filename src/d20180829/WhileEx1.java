package d20180829;

// while문 : for문과 같은 반복문
// while문이 for문보다 조건이 더 간편하다.
public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문 역시 중첩이 가능함. 구구단 9단까지 출력해보세요.

		int num = 1;
		int dan = 1;

		while (num <= 9) {
			while (dan <= 9) {
				System.out.println(num + " * " + dan + " = " + (num * dan));
				num++;
				dan++;
			}

		}
	}

}
