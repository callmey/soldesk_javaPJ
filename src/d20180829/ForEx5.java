package d20180829;

public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 다음 식을 만족하는 모든 A와 B의 조합을 출력하세요.
		 * 
		 *        A        B
		 *     +  B        A 
		 *   ---------------------
		 *        9        9
		 * 
		 */
		
		/*
		for(int i=1; i<=i*1; i++) {
			for(int j=8; j>=5;j--) {
				if(i<j) {
					System.out.println(i + "" + j + "+" + j + "" + i + "=" + (i+j)+(i+j));
		

				}
			}
		}*/
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9;j++) {
				if((i*10+j)+(j*10+i)==99) {
					System.out.println(i+","+j);
				}
			}
		}
			
	}
}
