package exam_08;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// �κ� ���(��ư Ȥ�� �׷��� �������) �̵�, ����
public class Q1 extends Frame implements KeyListener{
	Graphics lobot;
	
	Q1() {
		super("Lobot");
		setBounds(100, 100, 800, 600);
		setVisible(true); 
		
		// �����̳� ������ �ð�ȭ
		
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			System.exit(0);
		}
	});
		
	
	this.addKeyListener(this);
	
	} // ������ end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawRect(50, 400, 30, 40); // ���� ��
		g.drawRect(95, 350, 35, 35); // �Ӹ�
		g.drawRect(150, 400, 30, 40); // ������ ��
		g.drawRect(90, 390, 48, 100); // ����
		g.drawRect(90, 500, 20, 50); // ���� �ٸ�
		g.drawRect(120, 500, 20, 50); // ������ �ٸ�
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
		
		/*// �׷��� ���� ��ǥ
		Graphics o1 = 
		int y = btn1.getY();

		if(key == 37) x -= 10;
		else if(key == 38) y -= 10;
		else if(key == 39) x += 10;
		else if(key == 40) y += 10;
		
		btn1.setLocation(x,y); // ��ġ �����͸� �޾Ƽ� setLocation���� �����ؾ���.
		
		// ���� - �����̽���
		if(key==32) {
			
			for(int i=0; i<7; i++) {
				
				try { // �ڹ� ���α׷� ���� �ϳ��ϳ��� �������� �ϸ� ������δ� ���μ���.
		// ��Ʈ��ũ/ I/O / DB�� ��ü ���α׷��� ������ ��ġ�Ƿ� �� ����� ����Ϸ��� ���� ó���� �ض�
					Thread.sleep(50); // millis : 1 / 1000 ��
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
