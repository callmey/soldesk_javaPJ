package d20181004;

import java.util.Random;

//멀티쓰레드 구현방법 -2
//2. Runnable Interface 구현
// 1) Runnable Interface 구현
// 2) run() override -> 동시에 처리하고 싶은 logic
// 3) Runnable Interface를 구현받ㅇ느 객체를 Thread 클래스의 매개변수로 사용
// 4) Thread 클래스 start()실행

public class ThreadEx2 implements Runnable{
	
	String name;
	
	public ThreadEx2(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ThreadEx2 te1 = new ThreadEx2("1번마 번개");
		ThreadEx2 te2 = new ThreadEx2("2번마 천둥");
		
		//te1.start();에러
		
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
