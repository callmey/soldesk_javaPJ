package d20180905;
import d20180905.Human;
public class Society {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.먹기();
//		System.out.println(" h1 : " + h1);
		System.out.println(h1.이름);
		System.out.println(h1.성별);
		
		System.out.println("------------------------------");
		
		/*Human h2 = new Human();
//		System.out.println(" h2 : " + h2);
		h2.먹기();
		
		h2.이름 = "갑순이";
		h2.성별 = "여성";  
		
		System.out.println(h2.이름);*/
		
		Human h2 = new Human("갑순이");
		System.out.println("h2 이름 : " + h2.이름);
		System.out.println("h2 성별 : " + h2.성별);
		
		System.out.println("------------------------------");
		
		Human h3 = new Human("유관순", "여성");
		System.out.println("h3 이름 : " + h3.이름);
		System.out.println("h3 성별 : " + h3.성별);
		
		System.out.println("------------------------------");
		
		Human h4 = new Human("홍길동", "남성", 180.5); 
		System.out.println("h4 이름 : " + h4.이름);
		System.out.println("h4 IQ : " + h4.iq);
		
		System.out.println("------------------------------");
		
		Human h5 = new Human("신사임당", "여성", 160.1, 60, 40); 		
		System.out.println("h5 이름 : " + h5.이름);
		System.out.println("h5 눈 : " + h5.눈);
		System.out.println("h5 키 : " + h5.키);
		System.out.println("h5 몸무게 :" + h5.몸무게);
		System.out.println("h5 나이 :" + h5.나이);
		
	
	}
}
