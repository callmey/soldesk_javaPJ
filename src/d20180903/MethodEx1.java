package d20180903;
// ������ �� ������ �޾Ƽ�, ��Ģ������ �ѹ��� ����ϴ� �޼ҵ� ����
// �� �޼ҵ带 ȣ���� �� �ִ� ���� �޼ҵ� ����
// ��, �������� ��� �������� ���� ����ϼ���



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
