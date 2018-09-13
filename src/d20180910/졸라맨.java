package d20180910;


// is - a 관계 : 상속 관계
// has - a 관계 : 객체를 멤버 변수로 사용             


// public class 졸라맨 extends Gun{}
// 논리적으로 사람객체의 부모가 Gun이 되는 이상한 관계가 됨

public class 졸라맨 {
	int 팔;
	int 다리;
	int 머리;
	
	//클래스 (객체) 도 멤버 변수로 선언 가능
	Gun g = new Gun();
	레이저총 r = new 레이저총();
	광선검 b = new 광선검();
	
	// 인터페이스를 참조변수로 선언
	Weapon w;
	
	// Weapon 모든 객체를 주소에 담을 수 있음
	졸라맨(Weapon w) {
		this.w = w;
	}
	
	/*졸라맨(레이저총 r) {
		this.r = r;
	}*/ // Weapon에 담지 않으면 모든 객체를 선언해주어야 함
	
	public void 공격하기() {
		if(w != null) {
			w.attack();
		}else {
			System.out.println("원투 원투");
		}
	}
	
	public void walk() {
		System.out.println("walk walk");
	}
	
	public void talk() {
		System.out.println("talk talk");
	}
	
	public void 변신하기() {
		System.out.println("사랑과 정의를 지키는 졸라맨~~");
	}
	
}
