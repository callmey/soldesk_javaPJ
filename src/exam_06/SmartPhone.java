package exam_06;

public class SmartPhone extends Phone{
	
	String kakaoId;
	
	SmartPhone(String name, int number, int serialNum, int size) {
		super(name, number, serialNum, size);
		// TODO Auto-generated constructor stub
	}
	
	void application() {
		System.out.println("���û���ϱ�");
	}
	
	void wifi(int wifi) {
		System.out.println(" �������� ��ȣ : " +  wifi+ " �����Ͽ����ϴ�.");
	}
	
	void kakao() {
		System.out.println("īī���� Id : " + kakaoId +  " �α����Ͽ����ϴ�.");
	}

}
