package d20180830;

import java.util.Scanner;

//1���� 1000������ ���ڸ� ���(��, ����ڰ� �Է��� ���ڱ���)
public class BreakEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		
		for(int i = 1; i<=1000; i++) {
			if(i>value) {
				break;
			}
			System.out.println(i);
			
		}
	}

}
