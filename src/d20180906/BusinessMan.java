package d20180906;

// �� ����� ������ ��å�� �ƴµ� �̸��� �˰� �ʹ�.
public class BusinessMan extends Man {
	String job;
	String position;

	BusinessMan(String name, String job, String position) {
		super(name); // ��ӹ��� ���� Ŭ���� ������ ȣ��
		this.job = job;
		this.position = position;
	}

	void tellInfo() {
		System.out.println("job is" + job);
		System.out.println("position is :" + position);
		tellName();
	}
}
