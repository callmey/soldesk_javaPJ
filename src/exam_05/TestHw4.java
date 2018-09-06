package exam_05;

public class TestHw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SiegeTank st1 = new SiegeTank();
		SiegeTank st2 = new SiegeTank();
		Marine m = new Marine();
		
		st1.공격하기(st1,st2);
		st2.status();
		st1.공격하기(st1,m);
		m.status();
		
		
	}

}
