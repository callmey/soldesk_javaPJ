package d20180905;

public class Human {
	//��� ���� ����
	int ��;
	int ��;
	int ��;
	int iq;
	String ����;
	int ����;
	double Ű;
	double ������;
	String �̸�;
	
	// ������
	Human() {
		�� = 2;
		�� = 1;
		�� = 1;
		iq = 100;
		���� = "����";
		���� = 18;
		Ű = 174.7;
		������ = 65.8;
		�̸� = "������"; //this.�̸��� ����.
		System.out.println("������ ȣ��" );
	}
	
	// �� ��ü�� ����� �ٸ� �����(������)�� ���ؼ�
	// �پ��� �����ڸ� ���� Ŭ������ ����
	// ������ �����ε�
	
	Human(String �̸�) { // 
		this.�̸� = �̸�; // �������, ���������� ����(�Ķ���). this.�̸��� ��������.�Ķ���(�ϴû�)
	}
	
	// �̸�, ���� ������ �����ε�
	Human(String str1, String str2) {
		this.�� = 2;
		this.�� = 1;
		this.�� = 1;
		this.iq = 100;
		this.���� = 18;
		this.������ = 65.8;
		this.Ű = 174.7;
		this.�̸� = str1;
		this.���� = str2;
	}
	
	// �̸�, ����, Ű ������ �����ε�
	Human(String str1, String str2, double d) {
	/*	this.�� = 2;
		this.�� = 1;
		this.�� = 1;
		this.iq = 100;
		this.���� = 18;
		this.������ = 65.8;*/
		
		//�⺻ �����ڸ� �����ϰ� �����(or������)�� �䱸�ϴ� ������ �����ְ� ���� �� 
		// => ������ ���ڰ� ���Ƽ� ���� �ٿ��ֱⰡ ������ �� 
		this(); // �⺻ �����ڸ� ����
		
		this.�̸� = str1;
		this.���� = str2;
		this.Ű = d;
	}
	
	// �̸�, ����, Ű, ������, ���� ������ �����ε�
	Human(String str1, String str2, double d1, double d2, int x) {
		// ��� ���� �ʱ�ȭ
		// ��� ���� �̸� = �Ű� ���� �̸� �Ҵ�
		// this.��� ���� �̸� = �Ű� ���� �̸� �Ҵ� (����)
		this(str1, str2, d1); // �⺻������ ���� + ������ ������ ���ڱ��� ��� �ҷ��� �� ����(���� �������� �Ű� ���� ����)
		/*this.�̸� = str1;
		this.���� = str2;
		this.Ű = d1;*/
		this.������ = d2;
		this.���� = x;
	}
	// ����޼ҵ�
	void �ȱ�() {
		System.out.println("�ϳ� �� �ϳ� ��");
	}
	void �Ա�() {
		System.out.println("�ȳ�");
	}
	void �ڱ�() {
		System.out.println("����");
	}
	void �����ϱ�() {
		System.out.println("��");
	}
	void �ڵ��ϱ�() {
		System.out.println("�� ��մ�: ctrl+c ctrl+v");
	}
	
}
	