package d20181005;

public class PlusEx extends Thread{
	@Override
	public void run() {
		//1���� 100������ ���� ȭ�鿡 ���
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
