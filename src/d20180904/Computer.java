package d20180904;

public class Computer {
	// ��� ����
	double monitor;
	String keyboard;
	double ��ü;
	double ���콺;
	
	// ������
	Computer() {
		monitor = 24;
		keyboard = "querty";
		��ü = 20.3;
		���콺 = 3.5;
		
	}
	
	// ��� �޼ҵ� = ����
	void �����ϱ�() {
		System.out.println("�ϳ� �� �ϳ� ��");
	}
	
	void �����ѱ�() {
		System.out.println("�������");
	}
	
	void ��������() {
		 System.out.println("�����մϴ�");
	}
	
	void �ڵ��ϱ�() {
		System.out.println("�� ���õ� �߱��ΰ�");
	}
	
	
	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println(com.���콺);
		com.�����ѱ�();
	}
}

