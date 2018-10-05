package d20181005;

import java.util.Random;

public class ATMThread extends Thread{
	ATM atm;
	Random rnd = new Random();
	
	public ATMThread(ATM atm) {
		this.atm = atm;
		
	}
	
	@Override
	public void run() {
		
		boolean flag = false;
		
		// 총 10번 실행
		
		for(int i=1; i <= 10; i++) {
			/*int money = rnd.nextInt(10000);*/
			
			int start = 1000;
			int end = 10000;
			
			double range = end-start+1;
			
			int result = (int)(rnd.nextDouble() * range) + start;
			
			
			if(!flag) {
				atm.deposit(result);	
			} else {	
				atm.withDraw(result);
			}
			flag = !flag;
		}
		// 랜덤하게 1000 ~ 10000원 사이
		
	}

}
