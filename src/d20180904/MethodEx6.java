package d20180904;
// 1. 1이상 1000이하의 정수 중에서 소수를 출력하는 main메소드
// 2. 메인메소드에서 전달된 값이 소수인지 아닌지를 파악하는 primeNumber()
// 2-1. primeNumber()에서 소수 여부를 true, false 판단에서 반환
public class MethodEx6 {
	boolean primeNumber(int x) {
		for(int i=2; i<x; i++) {
			if(x % i  == 0) { // 1과 자기 자신 이외에 나누어지는 값이 있다면
				return false; //false 리턴
			}
		}
	
		return true; // 1과 자기 자신만 나누어 진다면 true 리턴
	}
	public static void main(String[] args) {
		MethodEx6 me6 = new MethodEx6();
		
		
		for(int i=2; i<=1000; i++) {
			if(me6.primeNumber(i) == true) { // 소수 출력
				System.out.println(i);
			}
		}
	}// main() end
}
