package exam_09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HwNo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		int[] value = new int[10];
		
		Random rnd = new Random();
		int num = 0;
		for(int i =0; i<10; i++) {
			num = rnd.nextInt(100); // 100 »çÀÌ
			System.out.print(num+ " "
					+ "");
		}

		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
}
