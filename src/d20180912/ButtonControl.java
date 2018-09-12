package d20180912;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonControl extends Frame implements KeyListener{ // 키 감지기

	Button btn1;
	
	ButtonControl() {
		setSize(800, 600);
		setLayout(null); // 기본 레이아웃 해제
		setVisible(true);
		
		btn1 = new Button("^__^");
		
		/*btn1.setSize(50, 50);
		btn1.setLocation(400, 300);
		*/
		btn1.setBounds(400, 300, 50, 50);
		add(btn1);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.out.println("종료");
				System.exit(0);
			
			}
		});
		
		this.addKeyListener(this);
		
		
		
	} // 생성자 end
	
	public static void main(String[] args) {
		new ButtonControl();
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
		
		// 버튼 현재 좌표
		int x = btn1.getX();
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
			}
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	} 
	
}
