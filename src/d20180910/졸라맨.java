package d20180910;


// is - a ���� : ��� ����
// has - a ���� : ��ü�� ��� ������ ���             


// public class ����� extends Gun{}
// �������� �����ü�� �θ� Gun�� �Ǵ� �̻��� ���谡 ��

public class ����� {
	int ��;
	int �ٸ�;
	int �Ӹ�;
	
	//Ŭ���� (��ü) �� ��� ������ ���� ����
	Gun g = new Gun();
	�������� r = new ��������();
	������ b = new ������();
	
	// �������̽��� ���������� ����
	Weapon w;
	
	// Weapon ��� ��ü�� �ּҿ� ���� �� ����
	�����(Weapon w) {
		this.w = w;
	}
	
	/*�����(�������� r) {
		this.r = r;
	}*/ // Weapon�� ���� ������ ��� ��ü�� �������־�� ��
	
	public void �����ϱ�() {
		if(w != null) {
			w.attack();
		}else {
			System.out.println("���� ����");
		}
	}
	
	public void walk() {
		System.out.println("walk walk");
	}
	
	public void talk() {
		System.out.println("talk talk");
	}
	
	public void �����ϱ�() {
		System.out.println("����� ���Ǹ� ��Ű�� �����~~");
	}
	
}
