package d20180910;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("java");
		String str2 = new String("java");
		// ���� ���������� String Ŭ������ new�� �����Ͽ�
		// primitive typeó�� ������ ���

		/*String str3 = new String("java");
		
		String str4 = "java";*/
		
		
		System.out.println("str1 : " + str1);
		
		System.out.println("-------------------------------");
		
		// hashcode : �ش� ��ü�� ������ ���� return
		// �Ϲ������� ��ü ���� �ּҸ� ���������� ��ȯ - 16����
		System.out.println("str1 : " + 
				str1.getClass().getName()+'@'+
				Integer.toHexString(str1.hashCode())
				);
		
		System.out.println("str1.toString() : " + str1.toString());
		System.out.println("---------------------------------");
		
		// str1 - str2 ����?
		if(str1 == str2) { // �ּ� ��
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		System.out.println("---------------------------------");
		
		if(str1.equals(str2) ) {  //���� ��
			System.out.println("���� ����");
			System.out.println("str1 : " + 
				str1.getClass().getName()+'@'+
				Integer.toHexString(str1.hashCode()));
			System.out.println("str2 : " + 
				str2.getClass().getName()+'@'+
				Integer.toHexString(str2.hashCode()));
		}else {
			System.out.println("���� �ٸ�");
			System.out.println(str1);
			System.out.println(str2);
		}
		
		/*
		 * 
		 * 
		 * 						Object				String
		 * 	toString			 ������				�ڱ� �ڽ��� ���ڿ�
		 *  equals()			 �ּҵ��Ͽ���			���뵿�Ͽ���
		 */
		
		
		System.out.println("-------------------------------");
		// ������ ������ ���� �ּҸ� ����(���� ������ ����)
		String str3 = "java";
		String str4 = "java";
		
		if(str3==str4) System.out.println("����"); // == �� �ּҰ� ������ ���� ��
	}

}
