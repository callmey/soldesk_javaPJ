package d20181004;


//멀티 쓰레드
//1. Thread 상속
//1)Thread 상속
//2) run() override - > 동시에 처리하고 싶은 logic을 넣어줌
//3) 구현 클래스에서 start() 호출

public class ThreadEx1 extends Thread{
	public ThreadEx1(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		//1부터 100까지의 값을 화면에 출력
		for(int i=1; i<=100; i++) {
			System.out.println(
					Thread.currentThread().getName()+":"+i
					);
		}
	}//run() end
	
	public static void main(String[] args) {
		ThreadEx1 te1 = new ThreadEx1("1번마 번개");
		ThreadEx1 te2 = new ThreadEx1("2번마 천둥이");
		
		te1.start();
		te2.start();
		
	}
}
