package d20180912;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx08 extends Frame implements WindowListener {
	
	AWTEx08() {
		super("WindowListener");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		this.addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new AWTEx08();
	}
	
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 창이 열리면 호출");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료합니다");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		// 지금 수업 상으로는 구현 모습을 볼 수가 없음
		System.out.println("윈도우 창이 닫히면 호출");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		// 최소화 버튼
		System.out.println("창이 아이콘화 되면 호출되는 부분");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("아이콘화 되어 있는 것을 반대로 호출");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 창이 활성화 되어있을 때 호출");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 창이 비활성화 되어 있을 때 호출");
	}

		
}
