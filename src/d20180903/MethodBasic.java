package d20180903;
/*
 * 
 * �޼ҵ�(�Լ�) �� ��� ����(�ʵ�, ������)�� �����ϰ� ó���ϴ� ������ �մϴ�
 * 
 * 2�� �̻� ȣ��Ǵ� �����̳� ���� ȣ��� ���ɼ��� �ִ� ������ �޼ҵ��� ����� �˴ϴ�
 * 
 */
public class MethodBasic {
	
	// void (������, ����ִ�) - ���ϰ��� ����
	void helloMethod(int x) {
		System.out.println("�޼ҵ� �ڵ�� ù��° ��");
		System.out.println("�޼ҵ� �ڵ�� " + x + " ��° ��");
		System.out.println("�޼ҵ� ����");
		
	}
	
	public static void main(String[] args) {
		System.out.println("�޼ҵ带 �����غ��ô�");
		MethodBasic mb = new MethodBasic();
		mb.helloMethod(2);
		System.out.println("���� �޼ҵ� ����");
	}

}
