package d20181005;

import java.util.Random;

public class ATM {
	
	Random rnd = new Random();
	
	// 계좌, 잔액
	String account;
	int balance;
	
	// 생성자, 계좌, 잔액 초기화
	
	ATM(String account, int balance) {
		this.account = account;
		this.balance = balance;
	}
	// 입금 : deposit()
	public synchronized void deposit(int money) {
		balance += money;
		System.out.println(account + "님 " + money + " 원이 입금되었습니다.");
		System.out.println("총 잔액은 " + balance + "원 입니다.");
	}
	
	// 출금 : withDraw()
	public synchronized void withDraw(int money) {
		if(balance >= money) {
			balance -= money;
		}
		System.out.println(account + "님 " +  money + " 원이 출금되었습니다.");
		System.out.println("총 잔액은 " + balance + "원 입니다.");
		
	}
	
}
