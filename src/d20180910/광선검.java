package d20180910;
// 
public class ������ implements Weapon{
	int ������;
	String ��������;
		
	������() {
		������ = 100;
		�������� = "orange";
	}
	
	������(String color) {
		this.�������� = color;
	}

	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("�ֿ�");
		������ -= 5;
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("�ҵ� �ҵ�");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("���ݷ�+50");
		System.out.println("������ ���� �����");
	}
	
}
