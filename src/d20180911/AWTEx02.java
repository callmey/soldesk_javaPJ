package d20180911;

import java.awt.Button;
import java.awt.Frame;

// container : 다른 component들을 담을 수 있는 component
public class AWTEx02 extends Frame{
	
	Button btn; // 객체 선언. 생성자에서 초기화함.
	
	AWTEx02(String title) {
		super(title);
		// 사이즈 400, 200
		setSize(400, 200);

		// 위치 : 597, 289
		setLocation(597, 289);

		// 버튼
		btn = new Button("Click");
		// 컨테이너에 컴포넌트를 담아야 쓸 수 있음
		add(btn);

		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTEx02 aw = new AWTEx02("버튼이 있는 윈도우");
	}
}
