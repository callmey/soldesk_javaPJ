package d20180906;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� m1 = new ����();
		m1.�̵��ϱ�(500, 200);
		m1.status();
		
		System.out.println("-------------------");
		���� m2 = new ����();
		m2.�̵��ϱ�(400, 100);
		m2.status();
		
		//supermarine -> hp=500
		/*
		 * 
		 * SuperMarine sm = new SuperMarine();
		 * sm.hp = 500; 
		 * 
		 * 
		 * 
		 * 
		 */
		
		���� su = new ����(500);
		su.status();
		
		System.out.println("------------------------");
		
		���� m3 = m1; // ���簡��. �ּ������� ������ ȣ��
		m3.hp = 50; // �ּ� ������ ���������Ƿ� ���� �����͵� �����.
		
		System.out.println("m1.hp :" + m1.hp + " " + m1); //m3�� ���翡 ���� ���������� �����.
		System.out.println("m2 :" + m2);
		System.out.println("m3.hp :" + m3.hp + " " + m3);
		
		System.out.println("--------------------------");
		// ������ �����ϱ⸦ �ϰ� �;��
		
		m1.�����ϱ�(m2);
		m2.status();
		
		System.out.println("---------------------------");
		// �޵��� ġ���ϱ⸦ �ϰ� �;��
		// m2�� ġ���� �� m2 ���¸� Ȯ���غ�����
		
		�޵� md = new �޵�();
		md.ġ���ϱ�(m2);
		m2.status();
		md.status();
	}

}
