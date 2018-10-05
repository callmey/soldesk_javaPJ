package d20181004;

import java.util.StringTokenizer;

///���ڿ��� ���ǿ� ���� ���� �� �ְ� ���ִ� Ŭ����
//ex) "10:33" �̷� �ð� ������ ���� �� 
//10, 33 �� ������ ":" �� ������
//�������� ���ڿ� ������ ��ū�̶�� �θ���.

//String Tokenizer

public class UtilEx4 {
	public static void main(String[] args) {
		String str = "11:22:33:44:55:66";
		
		StringTokenizer stk = new StringTokenizer(str, ":");
		
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		
		}
		
		System.out.println("-----------------------");
		
		
		//default(�����ڸ� �������� ������) ������ �����ڷ� ���
		String phoneNumber = "Tel 010-1111-2222";
		StringTokenizer stk1 = new StringTokenizer(phoneNumber);
		
		while(stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}
		
		
		System.out.println("-----------------------");
		
		
		//������ �� �̻� ����
		StringTokenizer stk2 = new StringTokenizer(phoneNumber, " -");
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}
		
		System.out.println("-----------------------");
		
		String code = "num+=1";
		
		//�����ڸ� ��ū���� �������� ������ ���� - true/false
		StringTokenizer stk3 = new StringTokenizer(code,"+=",true);
		while(stk3.hasMoreTokens()) {
			System.out.println(stk3.nextToken());
		}
	}
}
