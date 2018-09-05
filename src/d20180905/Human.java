package d20180905;

public class Human {
	//멤버 변수 생성
	int 눈;
	int 코;
	int 입;
	int iq;
	String 성별;
	int 나이;
	double 키;
	double 몸무게;
	String 이름;
	
	// 생성자
	Human() {
		눈 = 2;
		코 = 1;
		입 = 1;
		iq = 100;
		성별 = "남자";
		나이 = 18;
		키 = 174.7;
		몸무게 = 65.8;
		이름 = "갑돌이"; //this.이름과 같음.
		System.out.println("생성자 호출" );
	}
	
	// 내 객체를 사용할 다른 사용자(개발자)를 위해서
	// 다양한 생성자를 갖는 클래스로 생성
	// 생성자 오버로딩
	
	Human(String 이름) { // 
		this.이름 = 이름; // 멤버변수, 지역변수는 갈색(파란색). this.이름은 전역변수.파란색(하늘색)
	}
	
	// 이름, 성별 생성자 오버로딩
	Human(String str1, String str2) {
		this.눈 = 2;
		this.코 = 1;
		this.입 = 1;
		this.iq = 100;
		this.나이 = 18;
		this.몸무게 = 65.8;
		this.키 = 174.7;
		this.이름 = str1;
		this.성별 = str2;
	}
	
	// 이름, 성별, 키 생성자 오버로딩
	Human(String str1, String str2, double d) {
	/*	this.눈 = 2;
		this.코 = 1;
		this.입 = 1;
		this.iq = 100;
		this.나이 = 18;
		this.몸무게 = 65.8;*/
		
		//기본 생성자를 실행하고 사용자(or개발자)가 요구하는 변수만 열어주고 싶을 때 
		// => 생성자 인자가 많아서 복사 붙여넣기가 복잡할 때 
		this(); // 기본 생성자를 실행
		
		this.이름 = str1;
		this.성별 = str2;
		this.키 = d;
	}
	
	// 이름, 성별, 키, 몸무게, 나이 생성자 오버로딩
	Human(String str1, String str2, double d1, double d2, int x) {
		// 멤버 변수 초기화
		// 멤버 변수 이름 = 매개 변수 이름 할당
		// this.멤버 변수 이름 = 매개 변수 이름 할당 (권장)
		this(str1, str2, d1); // 기본생성자 실행 + 이전에 실행한 인자까지 모두 불러올 수 있음(현재 생성자의 매개 변수 대입)
		/*this.이름 = str1;
		this.성별 = str2;
		this.키 = d1;*/
		this.몸무게 = d2;
		this.나이 = x;
	}
	// 멤버메소드
	void 걷기() {
		System.out.println("하나 둘 하나 둘");
	}
	void 먹기() {
		System.out.println("냠냠");
	}
	void 자기() {
		System.out.println("쿨쿨");
	}
	void 생각하기() {
		System.out.println("멍");
	}
	void 코딩하기() {
		System.out.println("와 재밌다: ctrl+c ctrl+v");
	}
	
}
	