package d20180906;

public class Animal {
	String name;
	String food;
	
	Animal(String name, String food) {
		this.name = name;
		this.food = food;
	}
	
	
	void eat() {
		// �̸��� ���� ������ � ������ �Դ´�
		System.out.println(this.name + " �� " + this.food + "��/�� �Դ´�.");
	}
	
	void walking(String str) { // �Ű������� �����Ͽ� ���� Ŭ�������� �ٸ� ������ �� �� �ֵ��� ��
		System.out.println(this.name + str + " �ȴ´�.");
	}
	
	void breath() {
		System.out.println("ȣ���Ѵ�.");
	} 
	
	// ���� Ŭ�������� ��ӹ��� ���� ��Ҹ� �θ� Ŭ������ ��� �����ְ� ���!!!!!!!!!!!!
	
}
