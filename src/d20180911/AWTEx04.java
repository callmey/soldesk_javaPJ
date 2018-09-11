package d20180911;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

// FlowLayout : 물 흐르듯 레이아웃 생성
public class AWTEx04 extends Frame {
	Button btn1, btn2, btn3, btn4, btn5;
	
	AWTEx04() {
		super("FlowLayout");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		// 현재 프레임의 레이아웃을 변경
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
	
	}
	
	public static void main(String[] args) {
		new AWTEx04();
	}
}
