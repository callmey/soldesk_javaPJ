package d20180829;

// while�� : for���� ���� �ݺ���
// while���� for������ ������ �� �����ϴ�.
public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while�� ���� ��ø�� ������. ������ 9�ܱ��� ����غ�����.

	
		int num = 2;
		while (num <= 9) {
			int dan = 1;
			while (dan <= 9) {
				System.out.println(num + " * " + dan + " = " + (num * dan));
				dan++;
			}
			num++;
		} // �ܺ� while�� end
		
		System.out.println("-------------------------");

		
		//1���� 10������ ��(while)
		int sum = 0;
		int n = 1;
		while(n<=10) {
			sum += n;
			n++;
		}
		
		System.out.println(sum);
		
		System.out.println("-------------------------");
		//1���� 100���� ���(while)
		//100���� 1���� ���(do~while)
		
		int n1 = 1;
		while(n1<=100) {
			System.out.println(n1); // n1�� 100�� �Ǹ� ��� �� n1�� 101�� ��.
			n1++; //101
		}
		
		System.out.println("--------------");
		
	do {	
			System.out.println(--n1);
		} while (n1 > 1); // n1�� 1�� �Ǹ� n1 ��� �� �ߴ�.

	}
}
