package d20180906;

public class 메딕 {
	//멤버 변수
	int x,y;
	int hp;
	int 시야, 이동속도;
	int 치료력, mp, 방어력;
	
	// 생성자
	메딕() {
		this.x = 0; this.y= 0;
		치료력 = 2;
		방어력 = 1;
		시야 = 1;
		이동속도 = 2;
		mp = 50;
	}
	
	void 이동하기(int a, int b) {
		x = a;
		y = b;
		System.out.println("Go (" + x + " : " + y + ")");
	}
	
	void 패트롤() {
		System.out.println("순찰 중 이상 무");
	}
	
	
	void 홀드() {
		System.out.println("근무 중 이상 무");
	}
	
	
	// 치료하기 기능 추가
	void 치료하기(마린 x) {
		System.out.println("x: " + x);
		x.hp += this.치료력;
		this.mp -= this.치료력;
		if(x.hp > 100) x.hp = 100;
		System.out.println("치료!");
	}
	void status() {
		System.out.println("------ 메딕 상태보기 ------");
		System.out.println("mp : " + mp);
		System.out.println("x : y :" + x + " : " + y);
		System.out.println("시야 : " + 시야);
		System.out.println("이속 : " + 이동속도);
		System.out.println("치료력 : " + 치료력);
	}
}
