package exam_07;

// �Ʒ� next, exit ��ư ����  next ������ r -y -g ������ �� �ٲٰ� exit ������ ����
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTQ3 extends Frame implements ActionListener{
	Button btn1;
	Button btn2;
	
	AWTQ3() {
		setSize(400, 300);
		setSize(200, 300);
		setLocation(600, 200);
		setVisible(true);
		
		btn1 = new Button("NEXT");
		btn2 = new Button("EXIT");
		
	/*	FlowLayout fl = new FlowLayout();
		setLayout(fl);*/
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		//add(btn1, bl.);
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new AWTQ3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
