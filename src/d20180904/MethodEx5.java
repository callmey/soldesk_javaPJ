package d20180904;
/*
 * 
 * 임의의 원의 반지름 정보를 전달
 * 원의 넓이를 계산해서 반환하는 메소드 생성
 * 원의 둘레를 계산해서 반환하는 메소드 생성
 * 메인함수에서 그 결과를 출력해보세요
 * 
 * 원의 넓이 : x*x*3.14
 * 원의 둘레 : x*2*3.14
 * 
 */
public class MethodEx5 {
	double circum(double radius) {
		return radius*2*3.14;
	}
	
	
	double area(double radius) {
		return radius*radius*3.14;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx5 me5 = new MethodEx5();
		System.out.println("원의 둘레 : " + me5.circum(84));
		System.out.println("원의 넓이 : " + me5.area(840));
	}

}
