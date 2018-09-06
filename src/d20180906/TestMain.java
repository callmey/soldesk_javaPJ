package d20180906;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		마린 m1 = new 마린();
		m1.이동하기(500, 200);
		m1.status();
		
		System.out.println("-------------------");
		마린 m2 = new 마린();
		m2.이동하기(400, 100);
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
		
		마린 su = new 마린(500);
		su.status();
		
		System.out.println("------------------------");
		
		마린 m3 = m1; // 복사가능. 주소정보를 복사해 호출
		m3.hp = 50; // 주소 정보를 복사했으므로 원본 데이터도 변경됨.
		
		System.out.println("m1.hp :" + m1.hp + " " + m1); //m3의 복사에 의해 원본데이터 변경됨.
		System.out.println("m2 :" + m2);
		System.out.println("m3.hp :" + m3.hp + " " + m3);
		
		System.out.println("--------------------------");
		// 마린이 공격하기를 하고 싶어요
		
		m1.공격하기(m2);
		m2.status();
		
		System.out.println("---------------------------");
		// 메딕이 치료하기를 하고 싶어요
		// m2를 치료한 후 m2 상태를 확인해보세요
		
		메딕 md = new 메딕();
		md.치료하기(m2);
		m2.status();
		md.status();
	}

}
