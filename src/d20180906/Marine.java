package d20180906;
// �θ� Ŭ���� : super class
// �ڽ� Ŭ���� : sub class

public class Marine extends Teran {
	// ��� ����
	int ���ݷ�;
	
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
}
