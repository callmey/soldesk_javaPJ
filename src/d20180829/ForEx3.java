package d20180829;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * for(�ʱ��; ���ǽ�; ������) {
		 * 
		 * 
		 * }
		 * 
		 */
		
		//1���� 16���� ¦���� ����غ�����.
		
		int sum = 0;
		
		for(int i =2; i <= 16; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		
		for(int i =1; i <= 16; i++) {
			if(i % 2 == 0)
			System.out.println(i+" ");
		}
		
		System.out.println("------------------------------");
		
		for(int i=1; i <=9; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		
		// 1���� 10������ ���� ���
		
		for(int i=0; i<10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}

