package d20181005;

import java.util.Random;

public class ATM {
	
	Random rnd = new Random();
	
	// ����, �ܾ�
	String account;
	int balance;
	
	// ������, ����, �ܾ� �ʱ�ȭ
	
	ATM(String account, int balance) {
		this.account = account;
		this.balance = balance;
	}
	// �Ա� : deposit()
	public synchronized void deposit(int money) {
		balance += money;
		System.out.println(account + "�� " + money + " ���� �ԱݵǾ����ϴ�.");
		System.out.println("�� �ܾ��� " + balance + "�� �Դϴ�.");
	}
	
	// ��� : withDraw()
	public synchronized void withDraw(int money) {
		if(balance >= money) {
			balance -= money;
		}
		System.out.println(account + "�� " +  money + " ���� ��ݵǾ����ϴ�.");
		System.out.println("�� �ܾ��� " + balance + "�� �Դϴ�.");
		
	}
	
}
