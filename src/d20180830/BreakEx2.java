package d20180830;

/*
 * 
 * 
 * break: ���� ����� �ݺ����� Ż��
break �� : ���� �پ��ִ� �ݺ����� Ż��
continue : �̹��� ����
continue �� : ���� �پ��ִ� �ݺ������� ������ true�̸� �̹��� ����

 * 
 * 
 * 
 */
public class BreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer: 
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					if(i==j) {
						//break;
						//break outer; // outer �� Ż��
						//continue; 
						continue outer;
					}
					System.out.println("i : " + i + "," + " j: " + j);
				} // ���� for�� end
				System.out.println("----------------------------");
			}// �ܺ� for�� end
	}
}
