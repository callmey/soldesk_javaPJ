package d20180907;

public class 말 extends 포유류 implements Flyable { //다중상속하고 싶을 때 인터페이스사용. 
	//인터페이스는 모두 추상메소드이므로 오버라이드해서 사용해야함.

	@Override
	public void 먹기() {
		System.out.println("말은 당근을 먹는다");
	}

	@Override
	public void 자기() {
		System.out.println("말은 농장에서 자요");
	}
	
	public void 달리기() {
		System.out.println("달그닥 달그닥");
	}
	
	@Override
	public void 비행() {
		System.out.println("현질 최고! 잘 난다");
		
	}

}
