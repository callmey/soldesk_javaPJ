package d20180911;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// �̺�Ʈ ó��
// 1. �̺�Ʈ �ҽ� ����
// 2. �̺�Ʈ �ҽ� ������ ����
// 3. �ڵ鷯 ��ü ����
// 

public class AWTEx07 extends Frame implements ActionListener{
	// �ڵ鷯 ��ü�� ���� ���� �ʿ���� �� Ŭ�������� �������̵� �ؼ� ���� �� �� ����.
	// �ٸ� �̺�Ʈ�� ���ų� ������ ���������� �ڵ鷯 Ŭ������ ���� �����ؼ� 
	// �и��ϴ� ���� �� �ٶ���
	
	Button btn;
	
	AWTEx07() {
		super("Action Test");
		setSize(400, 300);
		setLocation(600, 200);
		setVisible(true);
		
		btn = new Button("click");
		add(btn, "South");
		
		// ������ ����
		btn.addActionListener(this); // �ڵ鷯�� �� Ŭ������ �ٿ��� �������̵������Ƿ�
									//�� �ڽ��� �����ϴ� ���������� �־���.
	} // ������ end
	
	public static void main(String[] args) {
		new AWTEx07();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�ȳ��ϼ���");
		System.out.println("e : " + e.getSource()); // Object ����
		
		Object obj = e.getSource(); // Object ������ Object ��ü�� ��ƾ� ��.
		if(obj==btn) {
			this.setBackground(Color.CYAN);
		}
	} // ActionListener �������̽� �������̵�
} // class end

