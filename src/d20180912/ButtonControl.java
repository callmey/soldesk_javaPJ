package d20180912;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonControl extends Frame implements KeyListener{ // Ű ������

	Button btn1;
	
	ButtonControl() {
		setSize(800, 600);
		setLayout(null); // �⺻ ���̾ƿ� ����
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
				System.out.println("����");
				System.exit(0);
			
			}
		});
		
		this.addKeyListener(this);
		
		
		
	} // ������ end
	
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
		
		// ��ư ���� ��ǥ
		int x = btn1.getX();
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
			}
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	} 
	
}
