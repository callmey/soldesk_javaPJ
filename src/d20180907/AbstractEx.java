package d20180907;

abstract class AA { //추상 메소드가 하나라도 있으면 추상 클래스가 되어야 함
	 //추상클래스는 new 할 수 없으므로 구현 실체화 X. 실체화하려면 상속받아가는 쪽(구현클래스)에서 반드시
	//오버라이드해서 사용해야함.
	
	void aaa() { //추상 메소드였다면 상속받는 클래스에서 오버라이드해서 사용해야 함.
		System.out.println("추상클래스 aaa method"); 
	}
}// abstract AA class end

class BB extends AA{
	void bbb() {
		System.out.println("BB 클래스 bbb method");
	}
}// BB class end

class CC extends AA {
	void ccc() {
		System.out.println("CC 클래스 ccc method");
	}
}// CC class end







public class AbstractEx {
	public static void main(String[] args) {
		
		//AA a = new AA(); 추상클래스는 인스턴스화할 수 없음.미구현 클래스.
		
		BB b = new BB();
		b.aaa();
		b.bbb();
		
		System.out.println("---------------------------");
		
		CC c = new CC();
		c.aaa();
		c.ccc();
	}
}
