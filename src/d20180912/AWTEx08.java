package d20180912;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx08 extends Frame implements WindowListener {
	
	AWTEx08() {
		super("WindowListener");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		this.addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new AWTEx08();
	}
	
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ â�� ������ ȣ��");
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
		// ���� ���� �����δ� ���� ����� �� ���� ����
		System.out.println("������ â�� ������ ȣ��");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		// �ּ�ȭ ��ư
		System.out.println("â�� ������ȭ �Ǹ� ȣ��Ǵ� �κ�");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ȭ �Ǿ� �ִ� ���� �ݴ�� ȣ��");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ â�� Ȱ��ȭ �Ǿ����� �� ȣ��");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ â�� ��Ȱ��ȭ �Ǿ� ���� �� ȣ��");
	}

		
}
