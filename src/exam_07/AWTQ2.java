package exam_07;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTQ2 extends Frame implements ActionListener, WindowListener{
	Button btn;
	
	AWTQ2() {
		super("GuGuDan");
		setSize(400, 300);
		setLocation(600, 200);
		setVisible(true);
		
		this.addWindowListener(this);
		
		btn = new Button("GuGuDan");
		
		add(btn, "South");
		
		btn.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new AWTQ2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int dan; //��� ����	
		
		dan = (int)(Math.random()*10);
		
		if(dan != 0) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i)); 
			}
			System.out.println();
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���α׷��� �����մϴ�");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ â�� ������ ȣ��");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
