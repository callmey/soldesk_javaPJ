package d20180906;

public class 고래 extends 포유류{
	int 나이;
	
	@Override
	public void 먹기() {
		System.out.println("고래는 크릴새우를 먹는다");
	}

	@Override
	public void 자기() {
		System.out.println("고래는 선잠을 자요");
	} // 추상클래스는 반드시 override해서 받아야 함. 
	
	
	public void 헤엄치기() {
		System.out.println("고래는 평생 헤엄쳐요");
	}
	
	
}
