package d20180913;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 *  Swing : AWT를 상속
 *           : AWT가 운영체제를 사용하므로 상대적으로 느림
 *           : 경량 - 순수한 자바 기술
 *           : 클래스 앞에 'J'자 붙임
 */
public class SwingEx extends JFrame implements ActionListener {

	JButton jbtn;
	
	public SwingEx() {
		super("처음 만든 스윙");
		setBounds(50, 50, 600, 600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jbtn = new JButton("Click");
		
		add(jbtn);
		
		jbtn.addActionListener(this);
		
		setVisible(true);		
	}// 생성자 end
	
	public static void main(String[] args) {
		new SwingEx();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("안녕하세요 곧 주말이 옵니다");
	}

	
	
}
















