package d20181005;

public class PlusEx extends Thread{
	@Override
	public void run() {
		//1부터 100까지의 값을 화면에 출력
		for(int i=1; i<=100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("+");
		}
	}//run() end
}
