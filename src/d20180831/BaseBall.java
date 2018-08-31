package d20180831;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 컴퓨터가 3자리 정수 - 랜덤하게 생성함
		
		int[] com = new int[3];
		
		
		// 2. 각각 자리에 수를 넣고 각 자리별로 일치 여부 검사
		
		boolean flag = true;
		
		while(flag) {
			com[0] = (int)(Math.random()*10);
			com[1] = (int)(Math.random()*10);
			com[2] = (int)(Math.random()*10);
			
			if(com[0]!=com[1] && com[0]!= com[2] && com[1] != com[2]) {
				flag = false;
			}//if end
		}//while end
		
		System.out.println("컴퓨터 생성값 : " + com[0] + com[1] + com[2]);
		
		
		// 3. 사용자가 입력값 받기 - 3자리 정수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		
		int value = sc.nextInt();
		
		System.out.println("사용자가 입력한 값: " + value);
		//376
		//userInput[0] --> 3 
		//userInput[1] --> 7
		//userInput[2] --> 6
		
		int[] userInput = new int[3];
		userInput[0] = value/100;	//
		userInput[1] = (value%100)/10; //
		userInput[2] = value%10; //exam_02의 8번 화페교환기 문제에 활용 가능
		
		//System.out.println("사용자가 입력한 값: " + userInput[0] + userInput[1] + userInput[2]);
		
		
		// 4. 컴퓨터가 생성한 숫자와 사용자가 입력한 숫자를 비교
		
		int strike = 0;
		int ball = 0;
		
		
	
		// 각 요소를 비교하여 자리값과 숫자가 일치하는지 판단
		// 자리값과 숫자가 동시에 일치하면 스트라이크 변수 값을 증가
		// 다른 자리에서 일치하면 볼 변수 값을 증가
		//if(com[0]==userInput[0]) strike++; 
		
		for(int i = 0; i<3; i++) {
			if(com[i] == userInput[i]) {
				strike++;
			}else {
				for(int j=0; j<3; j++) {
					if(com[j] == userInput[i]) {
						ball++;
					}
				}
			}
		} // 다시 한번 복습하기! 
		
		
		// 5. 판정 결과를 화면에 출력
		// ? strike, ? ball

		// 6. 3S 이면 경기를 종료, 아니면 반복
	}

}
