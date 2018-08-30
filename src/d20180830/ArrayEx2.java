package d20180830;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 크기 배열 생성
		// 참조 대상 변수는 3개
		// 3개의 변수에 임의의 값을 대입한 후 출력해보세요
		
		int[] arr = new int[3];
		int[] b = {5, 15, 25};
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		// int 기본값 : 0
		// float 기본값 ; 0.0f
		
		for(int i = 0; i<3; i++) {
			System.out.println(arr[i]);
			System.out.println(b[i]);
		}
		
		
		
		
		
	}

}
