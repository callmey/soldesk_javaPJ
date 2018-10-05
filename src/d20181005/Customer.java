package d20181005;

import java.util.Random;

// 4초마다 랜덤하게 구입

public class Customer implements Runnable{
	private Car car;
	Random rnd = new Random();
	
	public Customer(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(rnd.nextInt(4)*1000);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			car.pop();
		}
	}
}
