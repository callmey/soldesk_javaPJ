package d20180907;

import d20180906.고래;
import d20180906.다람쥐;
import d20180906.토끼;
import d20180906.포유류;

public class ArrReference {
	public static void main(String[] args) {
		
		토끼 r = new 토끼();
		고래 w = new 고래();
		다람쥐 s = new 다람쥐();
		
		// 배열
		//int[] m = new int[3];
		
		//int[] m = {,,};
		
		/*포유류[] moList = new 포유류[3];
		moList[0] = r;
		moList[1] = w;
		moList[2] = s;*/
		
		포유류[] moList = {new 토끼(), new 다람쥐(), new 고래()}; 
		//reference배열에 선언과 동시에 초기화로 값 할당해도 됨
		
		for(int i =0; i<moList.length; i++) {
			moList[i].먹기();
			moList[i].자기();
		}
		
		System.out.println("-----------------------------");
		
		// 참조변수 인지 확인하고 싶을 때
		// 참조변수 r이 토끼 클래스의 참조변수입니까? t/f
		System.out.println(r instanceof 토끼);
		
		
	}
}
