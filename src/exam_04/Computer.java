package exam_04;

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
	
	//������ �����ε�
	Computer(double m, double body, double mouth) {
		this();
		this.monitor = m;
		this.��ü = body;
		this.���콺 = mouth;
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
		System.out.println("com1");
		System.out.println(com.���콺);
		com.�����ѱ�();
		
		System.out.println("---------------------");
		System.out.println("com2");
		Computer com2 = new Computer(10,10.5,8.5);
		System.out.println(com2.monitor);
		System.out.println(com2.��ü);
		System.out.println(com2.���콺);
		com2.�ڵ��ϱ�();
		
	}
}

