package d20181005;

// API ���� - �ִ���  1���� + ���, �ִ��� 1���� - ��� �غ�����. (�� 100��?)
// Thread �켱����
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
