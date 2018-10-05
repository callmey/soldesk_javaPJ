package d20181004;

public class MathEx {
	public static void main(String[] args) {
		System.out.println("원주율 : "+Math.PI);
		System.out.println("4의 제곱근 : "+Math.sqrt(4));
		
		System.out.println("원주율 육십분법 : "+Math.toDegrees(Math.PI));
		
		//프로그래밍에서는 라디안을 많이 씀
		double radian = Math.toRadians(45);
		
		System.out.println("싸인 45 : "+Math.sin(radian));
		System.out.println("코싸인 45 : "+Math.cos(radian));
		System.out.println("탄젠트 45 : "+Math.tan(radian));
		
		//로그, 승 
		System.out.println("로그 90 : "+Math.log(90));
		System.out.println("2의 승 : " + Math.pow(2, 4));
	}
}
