package exam_05;

public class Exchange {

	
	void change(int m) {
		System.out.println("500�� : " + (m/500)); //1370
		System.out.println("100�� : " + (m%500)/100); //370  -> 3
		System.out.println("50�� : " + (m%500)%100/50); //70/50 -> 1
		System.out.println("10�� : " + (m%500)%100%50/10);// 20 /10 ->2
		
	}
}
