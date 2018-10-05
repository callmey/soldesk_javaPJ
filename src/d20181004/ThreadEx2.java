package d20181004;

import java.util.Random;

//��Ƽ������ ������� -2
//2. Runnable Interface ����
// 1) Runnable Interface ����
// 2) run() override -> ���ÿ� ó���ϰ� ���� logic
// 3) Runnable Interface�� �����ޤ��� ��ü�� Thread Ŭ������ �Ű������� ���
// 4) Thread Ŭ���� start()����

public class ThreadEx2 implements Runnable{
	
	String name;
	
	public ThreadEx2(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ThreadEx2 te1 = new ThreadEx2("1���� ����");
		ThreadEx2 te2 = new ThreadEx2("2���� õ��");
		
		//te1.start();����
		
		Thread th1 = new Thread(te1);
		Thread th2 = new Thread(te2);
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		for(int i =1;i<=100;i++) {
			System.out.println(name + ":"+i);
		}
		try {
			Thread.sleep(rnd.nextInt(5000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//run() end
	
}
