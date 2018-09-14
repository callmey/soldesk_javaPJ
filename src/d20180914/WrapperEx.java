package d20180914;

import java.util.ArrayList;

public class WrapperEx {
	// WrapperClass
	// 완전한 객체지향을 꿈꾸는 자바 프로그램의 바람
	// primitive type 조차도 객체로 만들 수 있다
	
	public static void main(String[] args) {
		
	ArrayList list = new ArrayList(); // 제너릭은 원하는 자료형으로 맞추고 비정상 접근을 막기 위해 선언
	list.add("딸기");
	list.add("참외");
	
	int a = 300;
	
	//Integer it = new Integer(a); // Boxing
	
	Integer it = a; // AutoBoxing
	
	// int b = it.intValue(); // Unboxing
	
	int b = it; // AutoUnboxing
	
	Object obj = it;
	list.add(obj);
	
	System.out.println(it.intValue());
	System.out.println(it.MAX_VALUE);
	
	// 2진수 출력
	System.out.println(Integer.toBinaryString(a));
	
	String s = "01011112222";
	
	int v = Integer.parseInt(s); // AutoBoxing. 문자를 숫자로 변환 
	
	System.out.println(v);
	System.out.println(v+1);
	
	System.out.println("--------------------------");
	
	list.add(a);
	list.add(a);
	
	System.out.println(list); 
	}
}
