package d20180910;

public class �������� implements Weapon{
	int energy;
	
	��������() {
		this.energy = 200;
	}
	
	public void ����() {
		this.energy =200;
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("������");
		energy -= 20;
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("�ҵ� �ҵ�");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}
