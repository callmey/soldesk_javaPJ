package d20180829;
//����ڷκ��� ���ڸ� �ϳ� �Է¹޾� �ش� �������� 
//����غ�����

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� �Է�: " );
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num+ " * " + i + " = " + (num*i));
		}
		
	}

}
