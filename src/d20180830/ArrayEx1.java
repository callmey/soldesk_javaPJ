package d20180830;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 생성 - int 크기 변수 5개를 생성하고 각 변수에 임의의 값을 대입
		//콘솔에 출력
		
		//배열 선언: 자료형[] 변수명;
		
		int[] num = new int[5]; // 원시타입은 stack 영역에 값을 할당받고, 참조타입은 heap 영역에 주소를 할당받음.
		
		
		
		//System.out.println("num : " + num);
		num[0] = 0;
		num[1] = 10;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		/*System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);*/
		
		// 배열 출력을 반복문으로 할 수 있음
		System.out.println("배열의 크기 : " + num.length);
		for(int i = 0; i<5; i++) {
			System.out.println(num[i]);
		}
	}

}
