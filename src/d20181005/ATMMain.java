package d20181005;

public class ATMMain {
	
	public static void main(String[] args) {
		ATM atm1 = new ATM("홍길동", 100000);
		ATM atm2 = new ATM("유관순", 100000);
		
		
		// 총 10번 실행
		// 입, 출금이 랜덤하게 10000원 사이
		ATMThread at1 = new ATMThread(atm1);
		ATMThread at2 = new ATMThread(atm2);
		
		//at1.start();
		at1.start();
		at2.start();
		
	}
}
