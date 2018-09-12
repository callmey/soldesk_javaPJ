package d20180912;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		// 랜덤 : Math.random() --> double type 리턴
		
		Random rnd = new Random();
		
		// 0부터 44까지 정수를 랜덤하게 추출하고 싶으면?
		int value = rnd.nextInt(45); // 원하는 범위까지 추출할 경우 () 안에 숫자넣기
		System.out.println(value);
		
		System.out.println("----------------------------------");
		// 1000 사이에서 랜덤하게 정수 100개를 추출하여 출력해보세요
		
		for(int i = 0; i< 10; i ++) {
			for(int j =0; j<10; j++) {
				int v =rnd.nextInt(1000);
				System.out.print(v + " ");
			}
			System.out.println();
		}
	}
	
	
}
