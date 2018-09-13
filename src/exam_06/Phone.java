package exam_06;

public class Phone {
	
	int number;
	String name;
	int serialNum;
	int size;
	
	Phone(String name, int number, int serialNum, int size) {
		this.name = name;
		this.number = number;
		this.serialNum = serialNum;
		this.size = size;
	}
	
	
	void call() {
		System.out.println("전화걸기");
	}
	
	void message() {
		System.out.println("sms보내기");
	}
	
	void record() {
		System.out.println("음성녹음하기");
	}
	
	void camera() {
		System.out.println("사진찍기");
	}
	
}
