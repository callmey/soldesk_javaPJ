package d20180911;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 이벤트 처리
// 1. 이벤트 소스 결정
// 2. 이벤트 감지기 설치 ex) 화재 감지기
// 3. 핸들러 동작
public class AWTEx05 extends Frame{
	Button btnYes, btnNo;
	
	AWTEx05() {
		super("event");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		// 기본 배치 관리자를 사용하지 않기
		setLayout(null);
		
		btnYes = new Button("Yes");
		btnNo = new Button("No");
		
		// 배치 관리자가 없어지면 모든 컴포넌트는 각각의 크기와 위치 지정 가능
		btnYes.setSize(50, 20);
		btnYes.setLocation(30, 60);
		
		btnNo.setSize(50, 20);
		btnNo.setLocation(100, 60);
		
		add(btnYes);
		add(btnNo);
		
		// 자바 감지기 : add~~~Listener
		Handler hd = new Handler();
		btnYes.addActionListener(hd);
		
	} // 생성자 end
	
	public static void main(String[] args) {
		new AWTEx05();
	}
	
}// class end 

class Handler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("why click me?");
	}
	
}
