package d20180910;

/*
 * 
 * 
 * 자바에서 생략이 가능한 것들
 * 1. import java.lang.*
 * 2. 기본생성자
 * 3. extends Object
 * 4. this <- 확연히 구분되면 생략 가능
 * 5. super()
 * 
 */
//Object : 자바 최고 클래스

public class ObjectBasic extends Object {
	
	// 어디에서든 - new 하지 않고 - 리턴값이 필요 X
	// - main 이름을 가진 - 매개변수를 String 배열을 가진 - 이름은 args
	public static void main(String[] args) {
		//System.out.println();
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 " + obj2);
		
		// obj1 == obj 관계? 
		if(obj1==obj2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println("-------------------");
		if(obj1.equals(obj2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println("-------------------");
		System.out.println("obj1 : " + obj1);
		System.out.println("obj1.toString() : " + obj1.toString());
		//toString() : 오브젝트 값을 문자열로 표시
	}
}
