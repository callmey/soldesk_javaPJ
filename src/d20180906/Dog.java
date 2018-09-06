package d20180906;

public class Dog extends Animal{
	//String food; // 부모 클래스에 있는 것은 적지 않음.
	
	Dog(String name, String food) {
		super(name, food); // 상속받은 상위 클래스 생성자 호출
	}// 부모가 생성자 오버로딩 했을 시 자식도 생성자 오버로딩 한 것을 사용하여야함!!!!!!
	
	/*void walking() {
		System.out.println("터벅터벅 걷는다.");
	}
	
	void eat() {
		System.out.println(food + "를 먹는다.");
	}
	
	void breath() {
		breath();
	}
	*/   // 부모 클래스에 있는 것은 자식 클래스에 적을 필요없음. 추가 정보가 있을 시 변수와 함수를 만듬!!!!!!!!
}
