package d20180913;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyWin1 extends Frame {
	
	public MyWin1() {
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
		
	}// 생성자 end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		// Grahphics g : 붓
		
		// 두 좌표 사이  직선 
		g.drawLine(100, 100, 200, 200); // x1, y1, x2, y2
		g.drawLine(200, 100, 100, 200);
		
		// 사각형
		g.drawRect(300, 300, 150, 150); // x, y , 너비, 높이
		
		// 곡선
		// 반원 (x, y, 너비, 높이, 시작각, 종료각)
		g.drawArc(150, 150, 100, 100, 0, 180);
		
		// 원
		g.drawOval(200, 200, 100, 100);
		
		// 사각형 채우기
		g.setColor(Color.PINK);
		g.fillRect(400, 400, 50, 50);
		
		// 글자
		g.drawString("날씨가 선선해졌네요", 250, 150); // 글씨, x, y 위치
		
	}
	
	
	
	public static void main(String[] args) {
		new MyWin1();
	}
	
}






