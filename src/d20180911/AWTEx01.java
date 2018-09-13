package d20180911;

import java.awt.Frame;

//AWT : Abstract Window Toolkit

//component : 윈도우 상의 모든 구성요소


public class AWTEx01 extends Frame {
	
	AWTEx01(String title) {
		super(title); // java. awt 라이브러리에 있는 Frame이라는 부모생성자에 title을 넣어서 사용
		// 창 크기 : 300, 300
		setSize(300, 300);        //데이터 보내기
		
		// 창 위치 : x, y - 400, 200
		setLocation(400, 200);
		
		// 창을 보이게 해라
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTEx01 aw = new AWTEx01("내가 처음 만든 윈도우");
	}
}
