package d20180828;

import java.io.IOException;

public class IfChangeWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ����ڷκ��� ���� �� �ڸ� �Է¹��� ��
		// �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� ��ȯ���� ������
		
		//��Ʈ : �빮�� �� 65 - z: 90
		// �ҹ��� a: 97 - z : 122
		
		System.out.println("���� �Է� : ");
		int value = System.in.read();
		
		System.out.println(value);
		
		if(value >= 65 && value <= 90) {
			value += 32;
	
			
		}
		else if(value >= 97 && value <= 122) {
			value -= 32;
		}
		
		//System.out.println("��ȯ�� �� : " + value);
		char v = (char) value;
		
		System.out.println("���� ��ȯ�� ���� : " + v);
	}

}
