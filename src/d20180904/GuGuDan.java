package d20180904;
// ������ 3�ܸ� ����غ����� - OOP����
// g.print()
public class GuGuDan {
	int dan; //��� ����
	
	public GuGuDan() { //������
		dan = 3;
	}
	
	public void print() { //��� �޼ҵ�
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i)); 
		}
	}
	
	public static void main(String[] args) {
		GuGuDan g = new GuGuDan();
		g.print();
	}
}
