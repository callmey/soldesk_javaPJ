package d20180905;

public class Child extends Parent{
	String b = "자식";
	
	void c_method() {
		System.out.println(b + " 함수 호출");
	}
	
	@Override //어노테이션
	void method() {
		//super.method();
		System.out.println(b + " 클래스에서 ");
		System.out.println(super.a + " 변수 호출");
		//System.out.println("부모 메소드 호출");
		//System.out.println("자식은 친구에게 잔소리하기");
	}
}
