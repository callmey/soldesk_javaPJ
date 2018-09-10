package d20180910;
//StringBuffer, StringBuilder
//     1.0         1.5
//	       ����                    �Ҿ���(thread ��� ��)

public class StringBuilderEx {
	public static void main(String[] args) {
		String str = "Soldesk";
		
		StringBuilder sb =new StringBuilder();
		
		sb.append("AA");
		System.out.println(sb);
		
		sb.insert(1, 4); // ù��° �ڸ��� 4�� �ִ´�.
		System.out.println(sb);
		
		sb.delete(0, 1); //0��°���� 1��°�ڸ������� ����
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder(str);
		sb2.append("AA");
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
		System.out.println("----------------------");
		
		String str0 = "Hello";
		String str1 = "Java";
		String str2 = "World";
		
		// ���ڿ� �� : compareTo
		if(str1.compareTo(str2) < 0) {
			System.out.println("str1�� �ռ���");
		}else {
			System.out.println("str2�� �ռ���");
		}
		
	}
}
