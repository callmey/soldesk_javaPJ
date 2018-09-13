package d20180910;

public class ClassEx1 {
	public static void main(String[] args) {
		String s = new String("Java Oracle");
		
		char ch =s.charAt(2);
		System.out.println("charAt(2) : " + ch);
		
		//r 나오게 출력해보세요
		
		char ch1 = s.charAt(6);
		System.out.println("charAt(6) : " + ch1);
		
		System.out.println("-------------------------");
		//문자열 연결
		String str1 = "월요일";
		System.out.println(s+str1);
		System.out.println(s.concat(str1));
		
		//오늘은 월요일 내일은 화요일
		String s1 = "오늘은";
		String s2 = "월요일";
		String s3 = "내일은";
		String s4 = "화요일";
		
		System.out.println(s1+s2+s3+s4);
		System.out.println(s1+" ".concat(s2)+ " ".concat(s3)+" ".concat(s4));
		
		
		// 내용 비교
		boolean result = s.contains("Java");
		System.out.println("result : " + result);
		
		// equals : 글자 대소문자를 구분함에 유의!
		System.out.println(s.equals("JAVA ORACLE"));
		
		// 대소문자 무시
		System.out.println(s.equalsIgnoreCase("JAVA ORACLE"));
		
		// 위치 반환 메소드
		int position = s.indexOf('r');
		System.out.println("r은 " + position + " 번째 글자이다");
		
		// 문자 길이 (공백도 포함)
		System.out.println(s.length());
		
		// 특정 위치의 문자를 추출 (2번째 부터 6번째 까지의 글자를 추출)
		System.out.println(s.substring(2, 6));
		
		// 문자열을 char[] 리턴하는 메소드
		char[] ch2 = s.toCharArray();
		for(int i=0; i<ch2.length; i++) {
			System.out.print(ch2[i]+ " ");
		}
		System.out.println();
		
		System.out.println("-------------------------");
		
		// 향상된 for문, 개선된 for문
		for(char c:ch2) {
			System.out.print(c);
		}
		System.out.println();
		
		System.out.println("-------------------------");
		
		String[] data = {"사과", "배", "딸기", "오렌지"};
		
		//for(자료형 변수 : 원데이터) {}
		
		for(String d: data) {
			System.out.print(d+ " ");
		}
		
		System.out.println();
		
		System.out.println("-------------------------");
		String email = "sideno@naver.com";
		System.out.println("아이디만 출력해보세요 : ");
		
		int index = email.indexOf('@');
		String ss = email.substring(0, index);
		System.out.println(ss);
		
		
	}
}
