package d20180903;

/*
 * 
 * 실행 화면
 * ----------
 * 1.A
 * 2.1000
 * 3.10.5
 * 4.false
 * 
 * 
 * 
 * 
 */

public class MethodEx3 {
	void printChar(char ch) {
		System.out.println("1." + ch);
		
	}
	
	void printInt(int x) {
		System.out.println("2." + x);
	}
	
	void printDouble(double d) {
		System.out.println("3. " + d);
	}
	
	void printBoolean(boolean bol) {
		System.out.println("4. " + bol);
	}
	
	public static void main(String[] args) {
		MethodEx3 me3 = new MethodEx3();
		me3.printChar('A');
		me3.printInt(1000);
		me3.printDouble(10.5);
		me3.printBoolean(false);
	}
}
