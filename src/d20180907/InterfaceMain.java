package d20180907;

public class InterfaceMain {
	public static void main(String[] args) {
		
		�� h1 = new ��();
		h1.�Ա�();
		h1.����();
		
		System.out.println("------------------------");
		// ���� �ϳ� �����ؼ� �̵�(100, 200) �̵� ��Ų ��
		// ������� ������
		
		Marine m = new Marine();
		m.�̵��ϱ�(100, 200);
		m.����();
		
		System.out.println("------------------------");
		// �������̽��� ���� �迭 ��밡��
		
		Flyable[] fList = new Flyable[2];
		
		Flyable f = h1; // ���� flyable�� ��ӹް� �����Ƿ�  Flyable >(����) h1  => �Ҵ� ����
		fList[0] = f;
		System.out.println(f);
		System.out.println("d20180907.��@7852e922");
		f = m;
		fList[1] = f;
		System.out.println(f);
		System.out.println("d20180907.Marine@4e25154f");
		
		for(int i=0; i<fList.length; i++) {
			fList[i].����();
		}
		
		
	
	}
}
