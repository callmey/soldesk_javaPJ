package d20180910;
//StringBuffer, StringBuilder
//     1.0         1.5
//	       안정                    불안정(thread 사용 시)

public class StringBuilderEx {
	public static void main(String[] args) {
		String str = "Soldesk";
		
		StringBuilder sb =new StringBuilder();
		
		sb.append("AA");
		System.out.println(sb);
		
		sb.insert(1, 4); // 첫번째 자리에 4를 넣는다.
		System.out.println(sb);
		
		sb.delete(0, 1); //0번째부터 1번째자리전까지 지움
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
		
		// 문자열 비교 : compareTo
		if(str1.compareTo(str2) < 0) {
			System.out.println("str1이 앞선다");
		}else {
			System.out.println("str2가 앞선다");
		}
		
	}
}
