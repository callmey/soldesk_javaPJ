package d20180907;
// �θ� Ŭ���� : super class
// �ڽ� Ŭ���� : sub class

public class Marine extends Teran implements Flyable {
	// ��� ����
	int ���ݷ�;
	int x, y; //�̵�
	
	Marine() {
		super(); // �θ� Ŭ���� ������ ��� => ���� ����
		this.���ݷ� = 5;
	}
	
	// ��� �޼ҵ�
	void �����ϱ�(Teran t) {
		// �Ű������� �׶�(�θ�Ŭ����)�� �����ϸ�
		// �׶��� �θ�Ŭ������ ���� ��� �ڽ�Ŭ�������� ������ ��ħ
		t.hp -= ���ݷ�;
		System.out.println("��!");
	}
	
	void �̵��ϱ�(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x : "+ x + " y : " + y);
	}
	
	@Override
	public void ����() {
		System.out.println("���� �� ����");
		
	}
}
