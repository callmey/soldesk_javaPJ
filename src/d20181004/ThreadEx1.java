package d20181004;


//��Ƽ ������
//1. Thread ���
//1)Thread ���
//2) run() override - > ���ÿ� ó���ϰ� ���� logic�� �־���
//3) ���� Ŭ�������� start() ȣ��

public class ThreadEx1 extends Thread{
	public ThreadEx1(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		//1���� 100������ ���� ȭ�鿡 ���
		for(int i=1; i<=100; i++) {
			System.out.println(
					Thread.currentThread().getName()+":"+i
					);
		}
	}//run() end
	
	public static void main(String[] args) {
		ThreadEx1 te1 = new ThreadEx1("1���� ����");
		ThreadEx1 te2 = new ThreadEx1("2���� õ����");
		
		te1.start();
		te2.start();
		
	}
}
