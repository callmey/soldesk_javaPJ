package d20180830;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 ���� - int ũ�� ���� 5���� �����ϰ� �� ������ ������ ���� ����
		//�ֿܼ� ���
		
		//�迭 ����: �ڷ���[] ������;
		
		int[] num = new int[5]; // ����Ÿ���� stack ������ ���� �Ҵ�ް�, ����Ÿ���� heap ������ �ּҸ� �Ҵ����.
		
		
		
		//System.out.println("num : " + num);
		num[0] = 0;
		num[1] = 10;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		/*System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);*/
		
		// �迭 ����� �ݺ������� �� �� ����
		System.out.println("�迭�� ũ�� : " + num.length);
		for(int i = 0; i<5; i++) {
			System.out.println(num[i]);
		}
	}

}
