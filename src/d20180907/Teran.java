package d20180907;

public class Teran {
	//��� ����
	int x, y, hp, ����, �þ�, �̵��ӵ�, ���ݼӵ�, ��Ÿ�;
	
	//������
	Teran() {
		x = 0;
		y = 0;
		hp = 100;
		���� = 0;
		�þ� = 1;
		�̵��ӵ� = 2;
		���ݼӵ� =2;
		��Ÿ� = 1;
		
	}
	
	// ��� �޼ҵ�
	void �̵��ϱ�(int a, int b) {
		x = a;
		y = b;
		System.out.println(" x : y => " + x + " : " + y);
	}
	
	void ��Ʈ��() {
		System.out.println("���� �� �̻� ��");
	}
	
	void Ȧ��() {
		System.out.println("�ٹ� �� �̻� ��");
	}
	
	
	
}
