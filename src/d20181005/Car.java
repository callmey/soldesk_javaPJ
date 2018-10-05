package d20181005;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	ArrayList<String> list;
	String[] carName = {"기블리", "페라리", "K3", "K5"};
	Random rnd = new Random();
	
	public Car() {
		list = new ArrayList<String>();
		
	}
	
	// 자동차 이름 랜덤하게 얻어오기
	public String getCar() {
		/*int value = rnd.nextInt(carName.length);
		
		String name = carName[value];
		return name;*/
		
		return carName[rnd.nextInt(carName.length)];
	}
	
	// 자동차를 만드는 메소드
	public synchronized void push(String car) { 
		// synchronized(동기화)
		System.out.println("push()-------------");
		System.out.println("현재 재고 : " + list);
		System.out.println("입고 차량 : " + car);
		
		list.add(car);
		
		//notify(); // 현재 wait하고 있는 thread 중 하나를 랜덤하게 깨워줌.
		notifyAll();
	} //push() end
	
	
	// 가장 마지막에 들어온 차를 출고하는 메소드
	public synchronized String pop() {
		System.out.println("pop()-------------");
		System.out.println("현재 재고: " + list);
		
		if(list.size()==0) {
			try {
				this.wait(); // wait() : 다른 thread가 날 깨워줄때까지 기다리라는 함수
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String carName = list.remove(list.size()-1);
		
		// list.get(list.size()-1); =>  내용을 가져오지만 리스트에는 여전히 남아있음.
		
		System.out.println("출고 차량 : " + carName);
		return carName;
	}
	
	
}
