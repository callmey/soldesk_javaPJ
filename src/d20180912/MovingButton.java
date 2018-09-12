package d20180912;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MovingButton extends Frame implements MouseListener, MouseMotionListener {

	Button btn1;
	Label lb;
	
	MovingButton() {
		setBounds(100, 100, 600, 400);
		setLayout(null);
		setVisible(true);
		
		btn1 = new Button("^<^");
		lb = new Label("Catch me if you can...");
		
		btn1.setBounds(80, 60, 80, 60);
		lb.setBounds(100, 200, 200, 40);
		
		add(btn1); add(lb);
		
		this.addMouseMotionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
	} // ������ end
	
	public static void main(String[] args) {
		new MovingButton();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// ���� ��ư�� x,y ��ǥ
		// TODO Auto-generated method stub
		int bx = btn1.getX();
		int by = btn1.getY();
		
		//���콺�� x,y��ǥ
		int x = e.getX();
		int y = e.getY();
		
		// ��ư ���� -> �߾� ��ǥ
		bx += 40;
		by += 30;
		
		
		//System.out.println("x : " + x + ", y :" + y);
		
		double dis = Math.sqrt((bx-x)*(bx-x)+(by-y)*(by-y)); // sqrt �� ������
		// sqrt - double �̰�, ()���� int => double�� �� ũ�ϱ�
		// �ڵ� ����ȯ
		
		if(dis<90) {
			System.out.println("���� ������ ��");
		}else {
			System.out.println("���� �ִ�");
		}
		
		if(dis < 90) {
			btn1.setLocation(
			(int)(Math.random()*600),
			(int)(Math.random()*400));
		}
		
		
	}
	

	
	
	
}
