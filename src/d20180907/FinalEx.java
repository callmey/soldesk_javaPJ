package d20180907;
// final : 상수
// static : 정적변수 // new 키워드 없이 메모리에 미리 할당됨.
class Fruit {
	// 사과, 복숭아, 바나나 상수를 생성
	final static int APPLE = 1; // final 상수 -> (값 변경X) 가져가는 쓰는 곳에서는 값 변경 가능하지만  								// 선언 동시에 초기화된 값은변경 불가능
	final static int PEACH = 2;
	final static int BANANA = 3;
}

class Company {
	//구글, 오라클, 애플 상수 생성
	final static int GOOGLE = 1;
	final static int ORACLE = 2;
	final static int APPLE = 3;
}


public class FinalEx {
	public static void main(String[] args) {
		
		// 과일 분류 switch 문 작성
		int type;
		
		//Fruit fruit = new Fruit();
		type = Fruit.APPLE; //new 키워드없이 바로 사용가능
		
		// 누가 실수로 컴퍼니의 APPLE을 부른다면?
		type = Company.APPLE;
		
		switch(type) {
		case Fruit.APPLE : System.out.println("사과"); break;
		case Fruit.PEACH : System.out.println("복숭아"); break;
		case Fruit.BANANA : System.out.println("바나나");break;
		}
	}
}
