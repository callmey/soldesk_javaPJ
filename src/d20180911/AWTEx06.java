package d20180911;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 버튼 1개 만들고
// 버튼을 South 배치해보세요

public class AWTEx06 extends Frame{
	Button btn;
	
	AWTEx06() {
		super("Action Test");
		setSize(400, 300);
		setLocation(600, 200);
		
		/*BorderLayout bl = new BorderLayout();
		setLayout(bl);*/
		
		btn = new Button("click");
		
		add(btn, "South"); // borderLayout 생략 시 작성 방식
		
		Handler1 hd1 = new Handler1();
		btn.addActionListener(hd1);
		
		setVisible(true);	
		
	}
	public static void main(String[] args) {
		new AWTEx06();
	} // main() end
} // class end

class Handler1 implements ActionListener{ //public 못씀. 이 파일의 주인은 AWTEx06 이므로

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("안녕하세요");
		System.exit(0); // 0 : 정상종료
						// 0 이외의 다른 값 사용 : 비정상 종료
	}

	
}
