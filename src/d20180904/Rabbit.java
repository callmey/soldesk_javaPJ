package d20180904;

public class Rabbit {
	String eye;
	String hair;
	int ear;
	int leg;
	
	// ������
	Rabbit(){
		eye = "red";
		hair = "white";
		ear = 2;
		leg = 4;
		
	}
	
	void �����ϱ�() {
		System.out.println("���ѱ���");
	}
	
	void �Ա�() {
		System.out.println("���۾���");
	}
	
	public static void main(String[] args) {
		Rabbit rb = new Rabbit();
		rb.�Ա�();
		System.out.println(rb.ear);
	}
}
