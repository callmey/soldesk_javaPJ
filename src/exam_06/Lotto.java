package exam_06;

public class Lotto {

	int[] num = new int[6];
	int nn;

	Lotto(int n) {
		this.nn = n;
	}

	void select() {
		System.out.print("[");
		for (int i = 0; i < 6; i++) {
			num[i] = (int) (Math.random() * 45);
			
			if(num[i] == 0) {
				num[i] = (int) (Math.random() * 45);
			}
			
			if(i==5) {
				System.out.print(num[i]);
			}else{
				System.out.print(num[i] + "," + " ");
			}
					
		}
		System.out.print("]");
		System.out.println();
	}
	// }

	void print() {
		for (int i = 0; i < nn - 1; i++) {
				select();	
		}
	}
}
