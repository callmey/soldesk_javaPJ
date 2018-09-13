package d20180910;

public class TestMain {

	public static void main(String[] args) {
		광선검 b = new 광선검();
		레이저총 r = new 레이저총();
		Gun g = new Gun();
		수류탄 gr = new 수류탄();
		
		졸라맨 j = new 졸라맨(g);
		j.변신하기();
		j.공격하기();
		System.out.println(g.총알);
	}

}
