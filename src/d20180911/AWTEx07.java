package d20180911;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// 이벤트 처리
// 1. 이벤트 소스 결정
// 2. 이벤트 소스 감지기 부착
// 3. 핸들러 객체 정의
// 

public class AWTEx07 extends Frame implements ActionListener{
	// 핸들러 객체를 따로 만들 필요없이 내 클래스에서 오버라이드 해서 쓰는 게 더 편함.
	// 다만 이벤트가 많거나 로직이 복잡해지면 핸들러 클래스를 따로 생성해서 
	// 분리하는 것이 더 바람직
	
	Button btn;
	
	AWTEx07() {
		super("Action Test");
		setSize(400, 300);
		setLocation(600, 200);
		setVisible(true);
		
		btn = new Button("click");
		add(btn, "South");
		
		// 감지기 부착
		btn.addActionListener(this); // 핸들러를 내 클래스에 붙여서 오버라이드했으므로
									//나 자신을 참조하는 참조변수를 넣어줌.
	} // 생성자 end
	
	public static void main(String[] args) {
		new AWTEx07();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("안녕하세요");
		System.out.println("e : " + e.getSource()); // Object 정보
		
		Object obj = e.getSource(); // Object 정보를 Object 객체에 담아야 함.
		if(obj==btn) {
			this.setBackground(Color.CYAN);
		}
	} // ActionListener 인터페이스 오버라이딩
} // class end

