package d20181005;
// 2�ʸ��� 1�뾿 ����
public class Productor implements Runnable{
	private Car car;
	
	public Productor(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			car.push(car.getCar());
		}
	}
	
}
