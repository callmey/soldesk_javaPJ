package exam_06;

public class Phone {
	
	int number;
	String name;
	int serialNum;
	int size;
	
	Phone(String name, int number, int serialNum, int size) {
		this.name = name;
		this.number = number;
		this.serialNum = serialNum;
		this.size = size;
	}
	
	
	void call() {
		System.out.println("��ȭ�ɱ�");
	}
	
	void message() {
		System.out.println("sms������");
	}
	
	void record() {
		System.out.println("���������ϱ�");
	}
	
	void camera() {
		System.out.println("�������");
	}
	
}
