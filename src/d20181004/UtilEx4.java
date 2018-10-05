package d20181004;

import java.util.StringTokenizer;

///문자열을 조건에 따라 나눌 수 있게 해주는 클래스
//ex) "10:33" 이런 시간 정보가 있을 때 
//10, 33 을 나누는 ":" 을 구분자
//나눠지는 문자열 정보를 토큰이라고 부른다.

//String Tokenizer

public class UtilEx4 {
	public static void main(String[] args) {
		String str = "11:22:33:44:55:66";
		
		StringTokenizer stk = new StringTokenizer(str, ":");
		
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		
		}
		
		System.out.println("-----------------------");
		
		
		//default(구분자를 지정하지 않으면) 공백을 구분자로 사용
		String phoneNumber = "Tel 010-1111-2222";
		StringTokenizer stk1 = new StringTokenizer(phoneNumber);
		
		while(stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}
		
		
		System.out.println("-----------------------");
		
		
		//구분자 둘 이상도 가능
		StringTokenizer stk2 = new StringTokenizer(phoneNumber, " -");
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}
		
		System.out.println("-----------------------");
		
		String code = "num+=1";
		
		//구분자를 토큰으로 간주할지 말지를 결정 - true/false
		StringTokenizer stk3 = new StringTokenizer(code,"+=",true);
		while(stk3.hasMoreTokens()) {
			System.out.println(stk3.nextToken());
		}
	}
}
