package d20180911;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// �̺�Ʈ ó��
// 1. �̺�Ʈ �ҽ� ����
// 2. �̺�Ʈ ������ ��ġ ex) ȭ�� ������
// 3. �ڵ鷯 ����
public class AWTEx05 extends Frame{
	Button btnYes, btnNo;
	
	AWTEx05() {
		super("event");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		// �⺻ ��ġ �����ڸ� ������� �ʱ�
		setLayout(null);
		
		btnYes = new Button("Yes");
		btnNo = new Button("No");
		
		// ��ġ �����ڰ� �������� ��� ������Ʈ�� ������ ũ��� ��ġ ���� ����
		btnYes.setSize(50, 20);
		btnYes.setLocation(30, 60);
		
		btnNo.setSize(50, 20);
		btnNo.setLocation(100, 60);
		
		add(btnYes);
		add(btnNo);
		
		// �ڹ� ������ : add~~~Listener
		Handler hd = new Handler();
		btnYes.addActionListener(hd);
		
	} // ������ end
	
	public static void main(String[] args) {
		new AWTEx05();
	}
	
}// class end 

class Handler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("why click me?");
	}
	
}
