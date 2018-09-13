package d20180903;
// 임의의 두 정수를 받아서, 사칙연산을 한번에 출력하는 메소드 생성
// 위 메소드를 호출할 수 있는 메인 메소드 생성
// 단, 나눗셈의 몫과 나머지는 따로 출력하세요



public class MethodEx1 {
	
	void Acc(int x, int y) {
		System.out.println(x + " + "+ y + " = " + (x+y));
		System.out.println(x + " - "+ y + " = " +  (x-y));
		System.out.println(x + " / "+ y + " = " +  (x/y));
		System.out.println(x + " % "+ y + " = " +  (x%y));
		System.out.println(x + " * "+ y + " = " +  (x*y));
	}
	
	public static void main(String[] args) {
		MethodEx1 ex = new MethodEx1();
		ex.Acc(50,30);
	}
}
