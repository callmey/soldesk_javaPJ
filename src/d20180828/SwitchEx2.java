package d20180828;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("성적을 입력하세요 : ");
		Scanner sc =new Scanner(System.in);
		
		int score = sc.nextInt();
		String grade = "";
		
		// switch문은 case에 값 하나만 인정되므로 
		// key값이 하나가 되도록 사이값을 미리 조정
		
		// key값이 앞자리가 같도록 사이값을 조정
		/*
		 *
		 * 100             A
		 * 99 ~ 90         A
		 * 89 ~ 80         B
		 * 79 ~ 70         C
		 * 69 ~ 60         D
		 * 나머지                            F
		 *
		 *
		 *
		 *
		 *
		 */
		
		int key = score/10;
		
		switch(key) {
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6: grade = "D"; break;
		default : grade = "F"; break;
		}
		
		System.out.println("당신의 학점은" + grade + "입니다");
		
	}

}
