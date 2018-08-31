package d20180831;

import java.util.Scanner;

public class ArrBaseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컴퓨터가 3자리 정수 - 랜덤하게 생성함

		// 2. 각각 자리에 수를 넣고 각 자리별로 일치 여부 검사

		// 3. 사용자가 입력값 받기 - 3자리 정수

		// 4. 컴퓨터가 생성한 숫자와 사용자가 입력한 숫자를 비교
		// 각 요소를 비교하여 자리값과 숫자가 일치하는지 판단
		// 자리값과 숫자가 동시에 일치하면 스트라이크 변수 값을 증가
		// 다른 자리에서 일치하면 볼 변수 값을 증가

		// 5. 판정 결과를 화면에 출력
		// ? strike, ? ball

		// 6. 3S 이면 경기를 종료, 아니면 반복

		for(int i =0; i< 3; i++) {
			System.out.print((int) (Math.random() * 10));
			//if
		}
		//String str = String.valueOf(num); // string 변환
		
		char[] ch = new char[3];
		char[] ch2 = new char[3];
		int s = 0;
		int b = 0;
		
		System.out.print("컴퓨터가 생성한 랜덤 값 : ");
		for (int i = 0; i < 3; i++) {
			//ch[i] = str.charAt(i);
			System.out.print(ch[i]);
		}

		System.out.println();

		System.out.println("3자리 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		for (int i = 0; i < 3; i++) {
			ch2[i] = a.charAt(i);
			System.out.print(ch2[i]);
		}
		
		System.out.println();

		for (int i = 0; i < 3; i++) {
			if (ch[i] == ch2[i]) {
				s++;
			}
			for (int j = 0; j < 3; j++) {
				if ((ch[i] == ch2[j]) && (i != j)) {
					b++;
				}

			}
		}

		System.out.print(s + " strike" + " ");
		System.out.print(b + " ball");

	}
}
