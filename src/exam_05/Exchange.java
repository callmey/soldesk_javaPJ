package exam_05;

public class Exchange {

	
	void change(int money) {
		System.out.println(money/50000);
		System.out.println(money% 50000/10000);
		System.out.println(money % 10000 / 5000);
		System.out.println(money % 5000/ 1000);
		System.out.println("500원 : " +money % 1000/ 500);
		System.out.println(money % 500/ 100);
		System.out.println(money % 100/ 50);
		System.out.println(money % 50/ 10);
	}
		/*System.out.println("500원 : " + (m/500)); //1370
		System.out.println("100원 : " + (m%500)/100); //370  -> 3
		System.out.println("50원 : " + (m%500)%100/50); //70/50 -> 1
		System.out.println("10원 : " + (m%500)%100%50/10);// 20 /10 ->2
*/		
	
}
