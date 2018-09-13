package d20180907;
// 부모 클래스 : super class
// 자식 클래스 : sub class

public class Marine extends Teran implements Flyable {
	// 멤버 변수
	int 공격력;
	int x, y; //이동
	
	Marine() {
		super(); // 부모 클래스 생성자 사용 => 생략 가능
		this.공격력 = 5;
	}
	
	// 멤버 메소드
	void 공격하기(Teran t) {
		// 매개변수를 테란(부모클래스)로 지정하면
		// 테란을 부모클래스로 갖는 모든 자식클래스에게 영향을 미침
		t.hp -= 공격력;
		System.out.println("탕!");
	}
	
	void 이동하기(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x : "+ x + " y : " + y);
	}
	
	@Override
	public void 비행() {
		System.out.println("마린 잘 난다");
		
	}
}
