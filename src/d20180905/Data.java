package d20180905;
//ĸ��ȭ - CRUD �۾��� �⺻ (Create Read Update Delete) => ���� ��ü�� ����.

public class Data {
	// ��� ���� - private
	private String name = "";
	private int annual = 0;
	
	//setter : ��� ������ ���� ����
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAnnual(int annual) {
		this.annual = annual;
	}	
	
	// getter : ��� ������ ���� �������� �޼ҵ�
	public String getName() {
		return "* " + this.name + " *";
	}
	
	public int getAnnual() {
		return this.annual + (int)(this.annual*0.05);
	}
	

}
