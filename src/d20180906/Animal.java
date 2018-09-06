package d20180906;

public class Animal {
	String name;
	String food;
	
	Animal(String name, String food) {
		this.name = name;
		this.food = food;
	}
	
	
	void eat() {
		// 이름을 가진 동물이 어떤 음식을 먹는다
		System.out.println(this.name + " 가 " + this.food + "를/을 먹는다.");
	}
	
	void walking(String str) { // 매개변수를 선언하여 하위 클래스들이 다른 행위를 할 수 있도록 함
		System.out.println(this.name + str + " 걷는다.");
	}
	
	void breath() {
		System.out.println("호흡한다.");
	} 
	
	// 하위 클래스들이 상속받을 공통 요소를 부모 클래스에 모두 적어주고 사용!!!!!!!!!!!!
	
}
