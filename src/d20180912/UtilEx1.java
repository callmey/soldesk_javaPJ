package d20180912;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		// ���� : Math.random() --> double type ����
		
		Random rnd = new Random();
		
		// 0���� 44���� ������ �����ϰ� �����ϰ� ������?
		int value = rnd.nextInt(45); // ���ϴ� �������� ������ ��� () �ȿ� ���ڳֱ�
		System.out.println(value);
		
		System.out.println("----------------------------------");
		// 1000 ���̿��� �����ϰ� ���� 100���� �����Ͽ� ����غ�����
		
		for(int i = 0; i< 10; i ++) {
			for(int j =0; j<10; j++) {
				int v =rnd.nextInt(1000);
				System.out.print(v + " ");
			}
			System.out.println();
		}
	}
	
	
}
