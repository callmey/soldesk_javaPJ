package d20181005;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	ArrayList<String> list;
	String[] carName = {"���", "���", "K3", "K5"};
	Random rnd = new Random();
	
	public Car() {
		list = new ArrayList<String>();
		
	}
	
	// �ڵ��� �̸� �����ϰ� ������
	public String getCar() {
		/*int value = rnd.nextInt(carName.length);
		
		String name = carName[value];
		return name;*/
		
		return carName[rnd.nextInt(carName.length)];
	}
	
	// �ڵ����� ����� �޼ҵ�
	public synchronized void push(String car) { 
		// synchronized(����ȭ)
		System.out.println("push()-------------");
		System.out.println("���� ��� : " + list);
		System.out.println("�԰� ���� : " + car);
		
		list.add(car);
		
		//notify(); // ���� wait�ϰ� �ִ� thread �� �ϳ��� �����ϰ� ������.
		notifyAll();
	} //push() end
	
	
	// ���� �������� ���� ���� ����ϴ� �޼ҵ�
	public synchronized String pop() {
		System.out.println("pop()-------------");
		System.out.println("���� ���: " + list);
		
		if(list.size()==0) {
			try {
				this.wait(); // wait() : �ٸ� thread�� �� �����ٶ����� ��ٸ���� �Լ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String carName = list.remove(list.size()-1);
		
		// list.get(list.size()-1); =>  ������ ���������� ����Ʈ���� ������ ��������.
		
		System.out.println("��� ���� : " + carName);
		return carName;
	}
	
	
}
