package d20180903;

import java.util.Scanner;

// 1. �� ���� ������ ���޹ޱ� -3�� 
// 2. �� �� ���� ���밪�� ����Ͽ� ����ϼ���(�޼ҵ�)

public class MethodEx2 {
	
	void Abs(int x, int y) {
		if(x > y) {
			System.out.println(x + " , " + y + " �� ���밪 : " + (x - y));
		} 
		else {
			System.out.println(x + " , " + y + " �� ���밪 : " + (y - x));
		} //if end
				
	}//abs() end
	
	public static void main(String[] args) {
		MethodEx2 ex = new MethodEx2();
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		while(i<3) {
			System.out.println("���� �Է� : " );
			int a = sc.nextInt();
			int b = sc.nextInt();
	
			ex.Abs(a,b);
			i++;
		}
		
		
	}
}
