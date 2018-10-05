package d20181004;

import java.util.Random;

//Random
public class UtilEx1 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		for(int i= 0 ; i<=1000; i++) {
			int value = rnd.nextInt(100);
			System.out.println(value);
		}
		
		
	}
}
