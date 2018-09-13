package exam_06;

public class SmartPhone extends Phone{
	
	String kakaoId;
	
	SmartPhone(String name, int number, int serialNum, int size) {
		super(name, number, serialNum, size);
		// TODO Auto-generated constructor stub
	}
	
	void application() {
		System.out.println("어플사용하기");
	}
	
	void wifi(int wifi) {
		System.out.println(" 와이파이 번호 : " +  wifi+ " 연결하였습니다.");
	}
	
	void kakao() {
		System.out.println("카카오톡 Id : " + kakaoId +  " 로그인하였습니다.");
	}

}
