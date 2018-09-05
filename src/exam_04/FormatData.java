package exam_04;
public class FormatData {
    
	public void print(int a) {
		System.out.println(a);
	}
	public void print(int[] b) {
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] +" ");
		}
		System.out.println();
	}
	public void print(float f) {
		System.out.println(f);
	}
	
}
