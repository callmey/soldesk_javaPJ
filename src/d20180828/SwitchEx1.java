package d20180828;

import java.util.Scanner;

//switch 문
//상대적으로 if문 보다 빠르다
//switch문의 조건식은 제한적이지만 if문보다 조건을 파악하기 쉽다
//switch문에는 key 값이 필요하다

// 1부터 5까지 숫자를 입력하면 해당하는 요일을 영문으로 출력해보세요.
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5 사이의 숫자를 입력하세요: ");
		int day = sc.nextInt();
		
		System.out.println(day);
		
		String d ="";
		
		switch(day) {
		case 1: 
			d= "Monday"; break;
		case 2: 
			d= "Tuesday"; break;
		case 3: 
			d = "Wednesday"; break;
		case 4: 
			d="Thursday"; break;
		case 5: 
			d = "Friday";break;
		default: 
			System.out.println("주말은 휴일");
		}
		
		System.out.println("Today is " + d);
	}

}
