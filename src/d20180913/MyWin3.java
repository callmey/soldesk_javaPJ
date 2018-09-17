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
		y2 = 300; // �밢��
		
		setLayout(null);
		
		btn = new Button("click");
		btn.setBounds(100, 50, 100, 50); 
		
		add(btn);
		
		btn.addActionListener(this);
		
	}// ������ end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawLine(x1, y1, x2, y2);
		
		// paint() : �ý��� ���������� ȣ��
		// - ������ â�� �ٲ� �� ������ ���� 
	}	
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
		
		// �̹��� ��� �۾�(ȭ��)�� �����ϰ� ���� �� ���
		// �ַ� ȭ���� �����Ÿ��� ���� ���ؼ� ���
		
		// update()       ------------->      paint()
		//  ���� ����     -------------->    �׸���
		
		// ȣ�� �� repaint()�� ���� paint(), update()�� ��� ����
		
		// �ݴ�� �ܻ�ȿ���ε� �� �� ����
		
		
		paint(g);
		
	}
	
	
	public static void main(String[] args) {
		new MyWin3();
		
	}// main() end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		x1 += 20;
		x2 += 20;
		
		// repaint : ���������� paint() �ѹ� �� ȣ���ϰ� ���� ��
		repaint();
	}

}










