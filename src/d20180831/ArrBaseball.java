package d20180831;

import java.util.Scanner;

public class ArrBaseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ��ǻ�Ͱ� 3�ڸ� ���� - �����ϰ� ������

		// 2. ���� �ڸ��� ���� �ְ� �� �ڸ����� ��ġ ���� �˻�

		// 3. ����ڰ� �Է°� �ޱ� - 3�ڸ� ����

		// 4. ��ǻ�Ͱ� ������ ���ڿ� ����ڰ� �Է��� ���ڸ� ��
		// �� ��Ҹ� ���Ͽ� �ڸ����� ���ڰ� ��ġ�ϴ��� �Ǵ�
		// �ڸ����� ���ڰ� ���ÿ� ��ġ�ϸ� ��Ʈ����ũ ���� ���� ����
		// �ٸ� �ڸ����� ��ġ�ϸ� �� ���� ���� ����

		// 5. ���� ����� ȭ�鿡 ���
		// ? strike, ? ball

		// 6. 3S �̸� ��⸦ ����, �ƴϸ� �ݺ�

		for(int i =0; i< 3; i++) {
			System.out.print((int) (Math.random() * 10));
			//if
		}
		//String str = String.valueOf(num); // string ��ȯ
		
		char[] ch = new char[3];
		char[] ch2 = new char[3];
		int s = 0;
		int b = 0;
		
		System.out.print("��ǻ�Ͱ� ������ ���� �� : ");
		for (int i = 0; i < 3; i++) {
			//ch[i] = str.charAt(i);
			System.out.print(ch[i]);
		}

		System.out.println();

		System.out.println("3�ڸ� ���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		for (int i = 0; i < 3; i++) {
			ch2[i] = a.charAt(i);
			System.out.print(ch2[i]);
		}
		
		System.out.println();

		for (int i = 0; i < 3; i++) {
			if (ch[i] == ch2[i]) {
				s++;
			}
			for (int j = 0; j < 3; j++) {
				if ((ch[i] == ch2[j]) && (i != j)) {
					b++;
				}

			}
		}

		System.out.print(s + " strike" + " ");
		System.out.print(b + " ball");

	}
}
