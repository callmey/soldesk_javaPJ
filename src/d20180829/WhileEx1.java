package d20180829;

// while�� : for���� ���� �ݺ���
// while���� for������ ������ �� �����ϴ�.
public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while�� ���� ��ø�� ������. ������ 9�ܱ��� ����غ�����.

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
