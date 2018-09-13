package exam_08;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 로봇 모양(버튼 혹은 그래픽 상관없음) 이동, 점프
public class Q1 extends Frame implements KeyListener{
	Graphics lobot;
	
	Q1() {
		super("Lobot");
		setBounds(100, 100, 800, 600);
		setVisible(true); 
		
		// 컨테이너 사이즈 시각화
		
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			System.exit(0);
		}
	});
		
	
	this.addKeyListener(this);
	
	} // 생성자 end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawRect(50, 400, 30, 40); // 왼쪽 팔
		g.drawRect(95, 350, 35, 35); // 머리
		g.drawRect(150, 400, 30, 40); // 오른쪽 팔
		g.drawRect(90, 390, 48, 100); // 몸통
		g.drawRect(90, 500, 20, 50); // 왼쪽 다리
		g.drawRect(120, 500, 20, 50); // 오른쪽 다리
	}
	
	
	public static void main(String[] args) {
		new Q1();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int key = e.getKeyCode();
		
		System.out.println("e : " +key);
		
		/*// 그래픽 현재 좌표
		Graphics o1 = 
		int y = btn1.getY();

		if(key == 37) x -= 10;
		else if(key == 38) y -= 10;
		else if(key == 39) x += 10;
		else if(key == 40) y += 10;
		
		btn1.setLocation(x,y); // 위치 데이터를 받아서 setLocation으로 설정해야함.
		
		// 점프 - 스페이스바
		if(key==32) {
			
			for(int i=0; i<7; i++) {
				
				try { // 자바 프로그램 동작 하나하나를 스레드라고 하며 윈도우로는 프로세스.
		// 네트워크/ I/O / DB는 전체 프로그램에 영향을 미치므로 이 기능을 사용하려면 먼저 처리를 해라
					Thread.sleep(50); // millis : 1 / 1000 초
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				btn1.setLocation(btn1.getX()+10, btn1.getY()-10);
			}
			
			for(int i=0; i<7; i++) {
				
				try { 
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
		btn1.setLocation(btn1.getX()+10, btn1.getY()+10);
			*/
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
