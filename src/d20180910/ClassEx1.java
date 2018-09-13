package d20180910;

public class ClassEx1 {
	public static void main(String[] args) {
		String s = new String("Java Oracle");
		
		char ch =s.charAt(2);
		System.out.println("charAt(2) : " + ch);
		
		//r ������ ����غ�����
		
		char ch1 = s.charAt(6);
		System.out.println("charAt(6) : " + ch1);
		
		System.out.println("-------------------------");
		//���ڿ� ����
		String str1 = "������";
		System.out.println(s+str1);
		System.out.println(s.concat(str1));
		
		//������ ������ ������ ȭ����
		String s1 = "������";
		String s2 = "������";
		String s3 = "������";
		String s4 = "ȭ����";
		
		System.out.println(s1+s2+s3+s4);
		System.out.println(s1+" ".concat(s2)+ " ".concat(s3)+" ".concat(s4));
		
		
		// ���� ��
		boolean result = s.contains("Java");
		System.out.println("result : " + result);
		
		// equals : ���� ��ҹ��ڸ� �����Կ� ����!
		System.out.println(s.equals("JAVA ORACLE"));
		
		// ��ҹ��� ����
		System.out.println(s.equalsIgnoreCase("JAVA ORACLE"));
		
		// ��ġ ��ȯ �޼ҵ�
		int position = s.indexOf('r');
		System.out.println("r�� " + position + " ��° �����̴�");
		
		// ���� ���� (���鵵 ����)
		System.out.println(s.length());
		
		// Ư�� ��ġ�� ���ڸ� ���� (2��° ���� 6��° ������ ���ڸ� ����)
		System.out.println(s.substring(2, 6));
		
		// ���ڿ��� char[] �����ϴ� �޼ҵ�
		char[] ch2 = s.toCharArray();
		for(int i=0; i<ch2.length; i++) {
			System.out.print(ch2[i]+ " ");
		}
		System.out.println();
		
		System.out.println("-------------------------");
		
		// ���� for��, ������ for��
		for(char c:ch2) {
			System.out.print(c);
		}
		System.out.println();
		
		System.out.println("-------------------------");
		
		String[] data = {"���", "��", "����", "������"};
		
		//for(�ڷ��� ���� : ��������) {}
		
		for(String d: data) {
			System.out.print(d+ " ");
		}
		
		System.out.println();
		
		System.out.println("-------------------------");
		String email = "sideno@naver.com";
		System.out.println("���̵� ����غ����� : ");
		
		int index = email.indexOf('@');
		String ss = email.substring(0, index);
		System.out.println(ss);
		
		
	}
}
