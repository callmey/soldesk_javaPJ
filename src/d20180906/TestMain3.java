package d20180906;

public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		Medic me = new Medic();
		
		m1.�����ϱ�(m2);
		System.out.println(m2.hp);
		
		me.ġ���ϱ�(m2);
		
		System.out.println(m2.hp);
	}

}
