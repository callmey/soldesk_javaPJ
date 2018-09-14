package d20180831;

import java.awt.TextField;

public class ArrLotto {
	public void print(int[] rnd) {
		for(int i=0; i<6; i++) {
			System.out.print(rnd[i]+ "\t");
		}
		System.out.println();
	}
	public int[] print2(int[] rnd) {
		for(int i=0; i<6; i++) {
			System.out.println(rnd[i] + "\t");
		}
		return rnd;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
				41, 42, 43, 44, 45 };
		
		ArrLotto al = new ArrLotto();
		
		//System.out.println(Math.random()*45);
		// 0.0 < Math.random() < 1.0 : double type 값
		// 0 < Math.random()*10 < 10 : double type 값
		// 0 < Math.random()*45 < 45 : double type 값
		// 						=> 44.49275~~
		
		// 정수값만 필요함
		// 0 < (int)Math.random()*45 < 45 : int type 값
		
		/*for(int i=0; i<100; i++) {
			System.out.println((int)(Math.random()*45)); // (int)'('Math.random()*45)')' 괄호 추가하여야 0이 나오지 않음.
		}*/
		
		//변수의 값을 서로 바꿔서 -> 마구 랜덤 -> 6개 추출
		
		for(int i=0; i<1000; i++) {
			int first = (int)(Math.random()*45);
			int second = (int)(Math.random()*45);
			
			int temp = 0;
			
			temp = rnd[first];
			
			rnd[first] = rnd[second];
			
			rnd[second] = temp;
		}
		
		al.print(rnd);
			
	}

}
