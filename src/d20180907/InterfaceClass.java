package d20180907;

public class InterfaceClass implements InterfaceEx1, InterfaceEx2{

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		
		System.out.println("������ �����Ǵ� �κ�");
		System.out.println("���ڿ��� ������ �κ�");
		return null;
	}

	@Override
	public void calculate() {
		System.out.println("������ �����Ǵ� �κ�");
		System.out.println("������ �� �ϴ� ������ �� �κ�");
		
	}

}
