package d20180913;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin3 extends Frame implements ActionListener {

	int x1, x2, y1, y2;
	Button btn;
	
	public MyWin3() {
		setBounds(50, 50, 800, 600);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		x1 = 200; 
		y1 = 200; 
		x2 = 300;
		y2 = 300; // 대각선
		
		setLayout(null);
		
		btn = new Button("click");
		btn.setBounds(100, 50, 100, 50); 
		
		add(btn);
		
		btn.addActionListener(this);
		
	}// 생성자 end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawLine(x1, y1, x2, y2);
		
		// paint() : 시스템 내부적으로 호출
		// - 윈도우 창이 바뀔 때 움직임 생김 
	}	
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
		
		// 이미지 출력 작업(화면)을 갱신하고 싶을 때 사용
		// 주로 화면의 깜빡거림을 막기 위해서 사용
		
		// update()       ------------->      paint()
		//  내용 갱신     -------------->    그리기
		
		// 호출 시 repaint()를 통해 paint(), update()를 사용 가능
		
		// 반대로 잔상효과로도 쓸 수 있음
		
		
		paint(g);
		
	}
	
	
	public static void main(String[] args) {
		new MyWin3();
		
	}// main() end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		x1 += 20;
		x2 += 20;
		
		// repaint : 강제적으로 paint() 한번 더 호출하고 싶을 때
		repaint();
	}

}










