package d20180907;

public class InterfaceMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass ifc = new InterfaceClass();
		ifc.calculate();
		ifc.getStr();
		System.out.println(ifc.STR);
		
		System.out.println("------------------------------");
		// �������̽��� �������� ��� : has - a ����  <-> �������� ��Ӱ��� : is - a ���� 
		// ��������̹Ƿ� �θ�-�ڽ� ����ó�� ����
		
		InterfaceEx1 ife1 = new InterfaceClass(); // InterfaceEx1 > InterfaceClass
		
		//InterfaceEx1 ife0 = new InterfaceEx1(); // �������̽��� new ���Ұ�
		
		ife1.calculate();
		
		InterfaceEx2 ife2 = new InterfaceClass();
		ife2.getStr();
	}

}
