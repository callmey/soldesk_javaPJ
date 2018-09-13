package d20180911;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

// Layout Manager : 배치관리자
// 컨테이너에는 컴포넌트를 어떻게 배치할지 도와주는 배치관리자가 있음
// Frame을 상속받으면 기본적으로 Border Layout 사용


public class AWTEx03 extends Frame{
	Button btn1, btn2, btn3, btn4, btn5;
	
	AWTEx03() {
		super("BorderLayout"); // super(title)에 직접적으로 제목을 넣어줌.
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl); // 기본적으로 Frame을 상속받으면 Border Layout이 정해져있어서 생략가능.
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER");
		
		add(btn1, bl.EAST); // Border Layout에 상대적으로 상수로 들어감.
		add(btn2, bl.WEST);
		add(btn3, bl.SOUTH);
		add(btn4, bl.NORTH);
		add(btn5, bl.CENTER);
		
	}
	
	public static void main(String[] args) {
		new AWTEx03(); // 내 클래스에서 나를 불러서 쓰고 있기 때문에 생략 가능.
	}
		

}
