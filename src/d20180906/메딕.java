package d20180906;

public class �޵� {
	//��� ����
	int x,y;
	int hp;
	int �þ�, �̵��ӵ�;
	int ġ���, mp, ����;
	
	// ������
	�޵�() {
		this.x = 0; this.y= 0;
		ġ��� = 2;
		���� = 1;
		�þ� = 1;
		�̵��ӵ� = 2;
		mp = 50;
	}
	
	void �̵��ϱ�(int a, int b) {
		x = a;
		y = b;
		System.out.println("Go (" + x + " : " + y + ")");
	}
	
	void ��Ʈ��() {
		System.out.println("���� �� �̻� ��");
	}
	
	
	void Ȧ��() {
		System.out.println("�ٹ� �� �̻� ��");
	}
	
	
	// ġ���ϱ� ��� �߰�
	void ġ���ϱ�(���� x) {
		System.out.println("x: " + x);
		x.hp += this.ġ���;
		this.mp -= this.ġ���;
		if(x.hp > 100) x.hp = 100;
		System.out.println("ġ��!");
	}
	void status() {
		System.out.println("------ �޵� ���º��� ------");
		System.out.println("mp : " + mp);
		System.out.println("x : y :" + x + " : " + y);
		System.out.println("�þ� : " + �þ�);
		System.out.println("�̼� : " + �̵��ӵ�);
		System.out.println("ġ��� : " + ġ���);
	}
}
