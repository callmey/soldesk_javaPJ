package d20180828;

import java.util.Scanner;

// 국어, 영어, 수학 점수를 차례대로 입력받은 후
// 평균점수와 학점을 구하세요. switch문
public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade = "";
		
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하시오.");
	
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 점수 입력 : " );
			int score1 = sc.nextInt();
			
			System.out.print("영어 점수 입력 : " );
			int score2 = sc.nextInt();	
			
			System.out.print("수학 점수 입력 : " );
			int score3 = sc.nextInt();
			
			int sum = score1 + score2 + score3;
			double avg = (sum / 3);
			
			int key = (int)avg / 10;
			
		
		switch(key) {
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6: grade = "D"; break;
		default : grade = "F"; break;
		}
		
		System.out.println("당신의 평균점수는" + avg + " 입니다");
		System.out.println("당신의 학점은" + grade + " 입니다");
		
	}

}
