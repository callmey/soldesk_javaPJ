package d20180906;

public class ���� {
	// ��� ����
	int x, y;
	int hp;
	int ���ݷ�, ����, ��Ÿ�;
	int �̵��ӵ�, ���ݼӵ�, �þ�;
	
	// ������
	����() {
		x=0; y=0;
		hp = 100;
		���ݷ� = 5; ���� = 0; ��Ÿ� =1;
		�̵��ӵ� = 3; ���ݼӵ� = 2; �þ� = 2;
	}
	
	// ������ �����ε�
	����(int hp) {
		this();
		this.hp = hp;
	} //��� ������ ���� �����ϰ� ���� �� ��������� �ǵ��� �ʰ� �����ڸ� �����ε��Ͽ� �� ����޾ƾ� ��.
	
	
	//��� �޼ҵ�
	void �̵��ϱ�(int a, int b) {
		x = a;
		y = b;
		System.out.println("���� ���� (" + x + " : " + y + ")");
	}
	
	//�����ϱ� �߰�
	void �����ϱ�(���� x) {
		System.out.println("x : " + x); //��ü�� �ּ������� ������
		x.hp -= ���ݷ�;
		System.out.println("��!");
	}
	
	void ��Ʈ��() {
		System.out.println("���� �� �̻� ��");
	}
	
	void Ȧ��() {
		System.out.println("�ٹ� �� �̻� ��");
	}
	
	void status() {
		System.out.println("------ ���� ���º��� ------");
		System.out.println("hp : " + hp);
		System.out.println("x , y :" + x + " : " + y);
		System.out.println("���� : " + ���ݼӵ�);
		System.out.println("�̼� : " + �̵��ӵ�);
	}
	
	
} // class end
