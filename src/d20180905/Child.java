package d20180905;

public class Child extends Parent{
	String b = "�ڽ�";
	
	void c_method() {
		System.out.println(b + " �Լ� ȣ��");
	}
	
	@Override //������̼�
	void method() {
		//super.method();
		System.out.println(b + " Ŭ�������� ");
		System.out.println(super.a + " ���� ȣ��");
		//System.out.println("�θ� �޼ҵ� ȣ��");
		//System.out.println("�ڽ��� ģ������ �ܼҸ��ϱ�");
	}
}
