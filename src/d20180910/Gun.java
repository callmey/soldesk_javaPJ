package d20180910;

public class Gun implements Weapon{

	int �Ѿ�;
	
	Gun() {
		this.�Ѿ� = 6;
	}
	
	Gun(int �Ѿ�) {
		this.�Ѿ� = �Ѿ�;
	}
	
	public void ������() {
		�Ѿ� = 6;
	}
	
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("��!");
		�Ѿ� --;
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("�ҵ� �ҵ�");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("�ݵ��� ������");
	}
	
}
