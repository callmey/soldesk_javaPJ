package d20180828;

import java.io.IOException;

public class IfChangeWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 사용자로부터 문자 한 자를 입력받은 후
		// 소문자는 대문자로, 대문자는 소문자로 변환시켜 보세요
		
		//힌트 : 대문자 ㅁ 65 - z: 90
		// 소문자 a: 97 - z : 122
		
		System.out.println("문자 입력 : ");
		int value = System.in.read();
		
		System.out.println(value);
		
		if(value >= 65 && value <= 90) {
			value += 32;
	
			
		}
		else if(value >= 97 && value <= 122) {
			value -= 32;
		}
		
		//System.out.println("변환된 값 : " + value);
		char v = (char) value;
		
		System.out.println("최종 변환된 문자 : " + v);
	}

}
