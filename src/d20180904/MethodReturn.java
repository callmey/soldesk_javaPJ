package d20180904;
/*
 * 
 * 실행화면
 * --------------
 * 1. 자바
 * 2. A
 * 3. 1000
 * 4. 3.14
 * 5. true
 * 
 */
public class MethodReturn {
	String returnStr() {

		return "자바";
	}
	
	char returnChar() {
		return 'A';
	}
	
	int returnInt() {
		return 1000;
	}
	double returnDouble() {
		return 3.14;
	}
	
	boolean returnBoolean() {
		return true;
	}
	
	public static void main(String[] args) {
		MethodReturn mr = new MethodReturn();
		String name = mr.returnStr();
		System.out.println("1. " + name);
		
		char ch = mr.returnChar();
		System.out.println("2. " + ch);
		
		/*ch = 'B';
		System.out.println(ch);*/
		
		System.out.println("3. " + mr.returnInt());
		System.out.println("4. " + mr.returnDouble());
		System.out.println("5. " + mr.returnBoolean());
		
		
	}
}
