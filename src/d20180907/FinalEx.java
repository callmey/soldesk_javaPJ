package d20180907;
// final : ���
// static : �������� // new Ű���� ���� �޸𸮿� �̸� �Ҵ��.
class Fruit {
	// ���, ������, �ٳ��� ����� ����
	final static int APPLE = 1; // final ��� -> (�� ����X) �������� ���� �������� �� ���� ����������  								// ���� ���ÿ� �ʱ�ȭ�� �������� �Ұ���
	final static int PEACH = 2;
	final static int BANANA = 3;
}

class Company {
	//����, ����Ŭ, ���� ��� ����
	final static int GOOGLE = 1;
	final static int ORACLE = 2;
	final static int APPLE = 3;
}


public class FinalEx {
	public static void main(String[] args) {
		
		// ���� �з� switch �� �ۼ�
		int type;
		
		//Fruit fruit = new Fruit();
		type = Fruit.APPLE; //new Ű������� �ٷ� ��밡��
		
		// ���� �Ǽ��� ���۴��� APPLE�� �θ��ٸ�?
		type = Company.APPLE;
		
		switch(type) {
		case Fruit.APPLE : System.out.println("���"); break;
		case Fruit.PEACH : System.out.println("������"); break;
		case Fruit.BANANA : System.out.println("�ٳ���");break;
		}
	}
}
