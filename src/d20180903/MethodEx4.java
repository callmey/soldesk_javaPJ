package d20180903;
/*
 * 
 * 
 * ����ȭ��
 * ---------
 * �ڹ�
 * �ڹ� A
 * �ڹ� A 1000
 * �ڹ� A 1000 10.5
 * �ڹ� A 1000 10.5 true
 * 
 */
public class MethodEx4 {
	/*void printString(String str) {
		System.out.println(str);
	}
	
	void printString(String str, char ch) {
		System.out.println(str + " " + ch);
	}
	
	void printStringCharInt(String str, char ch, int x) {
		System.out.println(str+ " " + ch + " " + x);
	}*/
	
	void print(String str) {
		System.out.println(str);
	}
	
	void print(String str, char ch) {
		System.out.println(str + " " + ch);
	}
	
	void print(String str, char ch, int x) {
		System.out.println(str+ " " + ch + " " + x);
	}
	void print(String str, char ch, int x, double d) {
		System.out.println(str+ " " + ch + " " + x + " " + d);
	}
	
	void print(String str, char ch, int x, double d, boolean bol) {
		System.out.println(str+ " " + ch + " " + x + " " + d + "  + bol ");
	}
	
	public static void main(String[] args) {
		MethodEx4 me4 = new MethodEx4();
		me4.print("�ڹ�");
		me4.print("�ڹ�", 'A');
		me4.print("�ڹ�", 'A', 1000);
		me4.print("�ڹ�", 'A', 1000, 10.5);
		me4.print("�ڹ�", 'A', 1000, 10.5, true);
		
		
	}
}
