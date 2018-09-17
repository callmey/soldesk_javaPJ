package exam_08;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


// 로봇 모양(버튼 혹은 그래픽 상관없음) 이동, 점프
public class Q1 extends Frame implements KeyListener{
	
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	
	
	Q1() {
		super("Lobot");
		setSize(800, 600);
		setLayout(null);
		setVisible(true); 
		
		// 컨테이너 사이즈 시각화
		
		btn1 = new Button("");
		btn2 = new Button("");
		btn3 = new Button("");
		btn4 = new Button("");
		btn5 = new Button("");
		btn6 = new Button("");
		
		btn1.setBounds(50, 400, 30, 40); // 왼쪽 팔
		btn2.setBounds(95, 350, 35, 35); // 머리
		btn3.setBounds(150, 400, 30, 40); //오른쪽 팔
		btn4.setBounds(90, 390, 48, 100); // 몸통
		btn5.setBounds(90, 500, 20, 50); //왼쪽 다리
		btn6.setBounds(120, 500, 20, 50); // 오른쪽 다리
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
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
	
	/*@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawRect(50, 400, 30, 40); // 왼쪽 팔
		g.drawRect(95, 350, 35, 35); // 머리
		g.drawRect(150, 400, 30, 40); // 오른쪽 팔
		g.drawRect(90, 390, 48, 100); // 몸통
		g.drawRect(90, 500, 20, 50); // 왼쪽 다리
		g.drawRect(120, 500, 20, 50); // 오른쪽 다리
		
		g.getClipBounds()
	
	}*/
	
	
	
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
		
		/*int key = e.getKeyCode();
		
		System.out.println("e : " +key);
		
		int x1 = btn1.getX();
		int y1 = btn1.getY();
		int x2 = btn2.getX();
		int y2 = btn2.getY();
		int x3 = btn3.getX();
		int y3 = btn3.getY();
		int x4 = btn4.getX();
		int y4 = btn4.getY();
		int x5 = btn5.getX();
		int y5 = btn5.getY();
		int x6 = btn6.getX();
		int y6 = btn6.getY();
		
		if(key == 37) {
			x1 -= 10; x2 -= 10; x3 -= 10;
			x4 -= 10; x5 -= 10; x6 -= 10;
		}
		else if(key == 38) {
			y1 -= 10; y2 -= 10; y3 -= 10; 
			y4 -= 10; y5 -= 10; y6 -= 10;
		}
		else if(key == 39) {
			x1 += 10; x2 += 10; x3 += 10;
			x4 += 10; x5 += 10; x6 += 10;
		}
		else if(key == 40) {
			y1 += 10; y2 += 10; y3 += 10;
			y4 += 10; y5 += 10; y6 += 10;
		}
		
		btn1.setLocation(x1,y1);
		btn2.setLocation(x2,y2);
		btn3.setLocation(x3,y3);
		btn4.setLocation(x4,y4);
		btn5.setLocation(x5,y5);
		btn6.setLocation(x6,y6);
		
		
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
				btn2.setLocation(btn2.getX()+10, btn2.getY()-10);
				btn3.setLocation(btn3.getX()+10, btn3.getY()-10);
				btn4.setLocation(btn4.getX()+10, btn4.getY()-10);
				btn5.setLocation(btn5.getX()+10, btn5.getY()-10);
				btn6.setLocation(btn6.getX()+10, btn6.getY()-10);
			}
			
			for(int i=0; i<7; i++) {
				
				try { 
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
		btn1.setLocation(btn1.getX()+10, btn1.getY()+10);
		btn2.setLocation(btn2.getX()+10, btn2.getY()+10);
		btn3.setLocation(btn3.getX()+10, btn3.getY()+10);
		btn4.setLocation(btn4.getX()+10, btn4.getY()+10);
		btn5.setLocation(btn5.getX()+10, btn5.getY()+10);
		btn6.setLocation(btn6.getX()+10, btn6.getY()+10);
		
		*/
		
		// ----------------------------코드 줄이기-------------------------
		
		int key = e.getKeyCode();
		int i;
		
		int[] x = {btn1.getX(), btn2.getX(), btn3.getX(), btn4.getX(), btn5.getX(), btn6.getX()};
		int[] y = {btn1.getY(), btn2.getY(), btn3.getY(), btn4.getY(), btn5.getY(), btn6.getY()};
		
		if(key==37) {
			for(i=0; i<6; i++) {
				x[i] -= 10; y[i] = y[i];
			}
			/*btn1.setLocation(x[0],y[0]);
			btn2.setLocation(x[1],y[1]);
			btn3.setLocation(x[2],y[2]);
			btn4.setLocation(x[3],y[3]);
			btn5.setLocation(x[4],y[4]);
			btn6.setLocation(x[5],y[5]);*/
		
		}	
		else if(key==38) {
			for(i=0; i<6; i++) {
				x[i] = x[i]; y[i] -= 10;
			}
		}
		else if(key==39) {
			for(i=0; i<6; i++) {
				x[i] += 10; y[i] = y[i];
			}
		}
		else if(key==40) {
			for(i=0; i<6; i++) {
				x[i] = x[i]; y[i] += 10;
			}
		}
		
		Button[] btn = {btn1, btn2, btn3, btn4, btn5,btn6};
		
		for(i =0; i<6; i++) {
			btn[i].setLocation(x[i], y[i]); // 위 btn들의 setLocation을 배열로 묶음
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
