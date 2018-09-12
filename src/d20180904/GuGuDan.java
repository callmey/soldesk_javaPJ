package d20180904;
// 구구단 3단만 출력해보세요 - OOP형태
// g.print()
public class GuGuDan {
	int dan; //멤버 변수
	
	public GuGuDan() { //생성자
		dan = 3;
	}
	
	public void print() { //멤버 메소드
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i)); 
		}
	}
	
	public static void main(String[] args) {
		GuGuDan g = new GuGuDan();
		g.print();
	}
}
