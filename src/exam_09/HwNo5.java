package exam_09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HwNo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
	
		Random rnd = new Random();
		for(int i =0; i<10; i++) {
			hs.add(rnd.nextInt(100)); // 100 »çÀÌ
		}

		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
