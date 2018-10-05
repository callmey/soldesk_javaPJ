package d20181005;

// API 참조 - 최대한  1번은 + 출력, 최대한 1번은 - 출력 해보세요. (한 100번?)
// Thread 우선순위
public class PrintTest extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusEx pe = new PlusEx();
		MinusEx me = new MinusEx();
		
	
		pe.setPriority(Thread.MAX_PRIORITY);
		me.setPriority(Thread.MIN_PRIORITY);
		//
		
		//
		
		pe.start();
		me.start();
	}

}
