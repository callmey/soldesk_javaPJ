package d20180828;
// �ݺ���(���)
// for(�ʱ��; ���ǽ�; ������) {
	 
//}

public class ForBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		for(int i=1; i<4; i++) {
			System.out.println("for �ݸ� : " + i);
		}
			System.out.println("--------------------------");
			//������ 3�� ���
			
			for(int j=1; j<10; j++) {
				System.out.println("3 * " + j + "=" + (3*j));
			}
			
			System.out.println("--------------------------");
			//������ 5�� ���
			
			int dan = 5;
			
			for(int a=1; a<10; a++) {
				System.out.println("5 * " + a + " = " + (dan*a));
			}
			
		}
	}

