package d20180907;

abstract class AA { //�߻� �޼ҵ尡 �ϳ��� ������ �߻� Ŭ������ �Ǿ�� ��
	 //�߻�Ŭ������ new �� �� �����Ƿ� ���� ��üȭ X. ��üȭ�Ϸ��� ��ӹ޾ư��� ��(����Ŭ����)���� �ݵ��
	//�������̵��ؼ� ����ؾ���.
	
	void aaa() { //�߻� �޼ҵ忴�ٸ� ��ӹ޴� Ŭ�������� �������̵��ؼ� ����ؾ� ��.
		System.out.println("�߻�Ŭ���� aaa method"); 
	}
}// abstract AA class end

class BB extends AA{
	void bbb() {
		System.out.println("BB Ŭ���� bbb method");
	}
}// BB class end

class CC extends AA {
	void ccc() {
		System.out.println("CC Ŭ���� ccc method");
	}
}// CC class end







public class AbstractEx {
	public static void main(String[] args) {
		
		//AA a = new AA(); �߻�Ŭ������ �ν��Ͻ�ȭ�� �� ����.�̱��� Ŭ����.
		
		BB b = new BB();
		b.aaa();
		b.bbb();
		
		System.out.println("---------------------------");
		
		CC c = new CC();
		c.aaa();
		c.ccc();
	}
}
