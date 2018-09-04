package d20180904;
// SwitchEx3 과 같은 결과가 나오게 해보세요

import java.util.Scanner;

public class MethodParam {
	
	//void paramDemo() - call by value 형태
	
	void paramDemo(int s1, int s2, int s3) {
		
		String grade;
		int sum = s1 + s2 + s3;
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
		
		System.out.println("당신의 평균점수는 " + avg + " 입니다");
		System.out.println("당신의 학점은 " + grade + " 입니다");
		
	}
	
	public static void main(String[] args) {
		
		MethodParam mp = new MethodParam();
		
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : " );
		int score1 = sc.nextInt();
		
		System.out.print("영어 점수 입력 : " );
		int score2 = sc.nextInt();	
		
		System.out.print("수학 점수 입력 : " );
		int score3 = sc.nextInt();
		
		mp.paramDemo(score1, score2, score3);

		
	}
}
