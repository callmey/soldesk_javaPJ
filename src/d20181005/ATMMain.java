package d20181005;

public class ATMMain {
	
	public static void main(String[] args) {
		ATM atm1 = new ATM("ȫ�浿", 100000);
		ATM atm2 = new ATM("������", 100000);
		
		
		// �� 10�� ����
		// ��, ����� �����ϰ� 10000�� ����
		ATMThread at1 = new ATMThread(atm1);
		ATMThread at2 = new ATMThread(atm2);
		
		//at1.start();
		at1.start();
		at2.start();
		
	}
}
