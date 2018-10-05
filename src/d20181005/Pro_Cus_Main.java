package d20181005;
import d20181005.Car;
public class Pro_Cus_Main {
	public static void main(String[] args) {
		Car car = new Car();
		
		// 제조 회사
		Productor p = new Productor(car);
		
		// 고객
		Customer c = new Customer(car);
		
		// Runnable
		Thread th1 = new Thread(p);
		Thread th2 = new Thread(c);
		
		th1.start();
		th2.start();
	}
}
