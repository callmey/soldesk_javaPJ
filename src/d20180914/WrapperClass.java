package d20180914;

public class WrapperClass {
	public static void showData(Object obj) { // 정적 static 메소드. new 할 필요없음. 메모리에 미리 올려둠
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		//showData(3);
		
		Integer num = new Integer(3);
		showData(num);
		showData(new Integer(7));
		
		System.out.println("-----------------");
		//Wrapper 클래스 기본 기능
		
		// 1. Boxing // 객체로 만드는 것
		Integer ival = new Integer(10); 
		Double dval = new Double(10.0);
		
		System.out.println(ival);
		System.out.println(dval);
		
		//2. Unboxing
		ival = new Integer(ival.intValue()+10);
		dval = new Double(dval.doubleValue()+10.11);
		
		System.out.println(ival);
		System.out.println(dval);
		
		System.out.println("-------------------");
		// 1. AutoBoxing  - new 선언 안해도 자동 할당됨
		Integer ivalue = 100;
		Double dvalue = 3.14;
		
		System.out.println(ivalue);
		System.out.println(dvalue);
		
		// 2. AutoUnboxing
		int result = ivalue + 10;
		double result2 = dvalue + 2.14;
		
		System.out.println(result);
		System.out.println(result2);
		
		
	}
}
