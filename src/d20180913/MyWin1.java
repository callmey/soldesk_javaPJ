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
		
	}// ������ end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		// Grahphics g : ��
		
		// �� ��ǥ ����  ���� 
		g.drawLine(100, 100, 200, 200); // x1, y1, x2, y2
		g.drawLine(200, 100, 100, 200);
		
		// �簢��
		g.drawRect(300, 300, 150, 150); // x, y , �ʺ�, ����
		
		// �
		// �ݿ� (x, y, �ʺ�, ����, ���۰�, ���ᰢ)
		g.drawArc(150, 150, 100, 100, 0, 180);
		
		// ��
		g.drawOval(200, 200, 100, 100);
		
		// �簢�� ä���
		g.setColor(Color.PINK);
		g.fillRect(400, 400, 50, 50);
		
		// ����
		g.drawString("������ ���������׿�", 250, 150); // �۾�, x, y ��ġ
		
	}
	
	
	
	public static void main(String[] args) {
		new MyWin1();
	}
	
}






