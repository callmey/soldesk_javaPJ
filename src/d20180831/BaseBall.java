package d20180831;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ��ǻ�Ͱ� 3�ڸ� ���� - �����ϰ� ������
		
		int[] com = new int[3];
		
		
		// 2. ���� �ڸ��� ���� �ְ� �� �ڸ����� ��ġ ���� �˻�
		
		boolean flag = true;
		
		while(flag) {
			com[0] = (int)(Math.random()*10);
			com[1] = (int)(Math.random()*10);
			com[2] = (int)(Math.random()*10);
			
			if(com[0]!=com[1] && com[0]!= com[2] && com[1] != com[2]) {
				flag = false;
			}//if end
		}//while end
		
		System.out.println("��ǻ�� ������ : " + com[0] + com[1] + com[2]);
		
		
		// 3. ����ڰ� �Է°� �ޱ� - 3�ڸ� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		
		int value = sc.nextInt();
		
		System.out.println("����ڰ� �Է��� ��: " + value);
		//376
		//userInput[0] --> 3 
		//userInput[1] --> 7
		//userInput[2] --> 6
		
		int[] userInput = new int[3];
		userInput[0] = value/100;	//
		userInput[1] = (value%100)/10; //
		userInput[2] = value%10; //exam_02�� 8�� ȭ�䱳ȯ�� ������ Ȱ�� ����
		
		//System.out.println("����ڰ� �Է��� ��: " + userInput[0] + userInput[1] + userInput[2]);
		
		
		// 4. ��ǻ�Ͱ� ������ ���ڿ� ����ڰ� �Է��� ���ڸ� ��
		
		int strike = 0;
		int ball = 0;
		
		
	
		// �� ��Ҹ� ���Ͽ� �ڸ����� ���ڰ� ��ġ�ϴ��� �Ǵ�
		// �ڸ����� ���ڰ� ���ÿ� ��ġ�ϸ� ��Ʈ����ũ ���� ���� ����
		// �ٸ� �ڸ����� ��ġ�ϸ� �� ���� ���� ����
		//if(com[0]==userInput[0]) strike++; 
		
		for(int i = 0; i<3; i++) {
			if(com[i] == userInput[i]) {
				strike++;
			}else {
				for(int j=0; j<3; j++) {
					if(com[j] == userInput[i]) {
						ball++;
					}
				}
			}
		} // �ٽ� �ѹ� �����ϱ�! 
		
		
		// 5. ���� ����� ȭ�鿡 ���
		// ? strike, ? ball

		// 6. 3S �̸� ��⸦ ����, �ƴϸ� �ݺ�
	}

}
