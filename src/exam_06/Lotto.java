package exam_06;

import java.util.Arrays;

public class Lotto {

	int[] data = new int[6];
	int num = 0;

	int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
			29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 };
	
	Lotto(int n) {
		this.num = n;
	}
	
	void select() {
		// 변수의 값을 서로 바꿔서 -> 마구 랜덤 -> 6개 추출

		for (int i = 0; i < 1000; i++) {
			int first = (int) (Math.random() * 45);
			int second = (int) (Math.random() * 45);

			int temp = 0;
			if(first!=second) {
				temp = rnd[first];
	
				rnd[first] = rnd[second];
	
				rnd[second] = temp;
			}
		}

		for (int i = 0; i < 6; i++) {
			data[i] = rnd[i];
		}
		Arrays.sort(data);
	}

	void print() {
		for(int j =0; j < num; j++) {
			System.out.print("[");
			for (int i = 0; i < 6; i++) {
				select();
				System.out.print(data[i] + "\t");
			}
			System.out.print("]");
			System.out.println();
		}
	}
}

/*
 * void select() { System.out.print("["); for (int i = 0; i < 6; i++) { num[i] =
 * (int) (Math.random() * 45);
 * 
 * if(num[i] == 0) { num[i] = (int) (Math.random() * 45); }
 * 
 * if(i==5) { System.out.print(num[i]); }else{ System.out.print(num[i] + "," +
 * " "); }
 * 
 * } System.out.print("]"); System.out.println(); }
 */
