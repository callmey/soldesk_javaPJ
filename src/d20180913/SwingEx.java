package d20180913;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 *  Swing : AWT�� ���
 *           : AWT�� �ü���� ����ϹǷ� ��������� ����
 *           : �淮 - ������ �ڹ� ���
 *           : Ŭ���� �տ� 'J'�� ����
 */
public class SwingEx extends JFrame implements ActionListener {

	JButton jbtn;
	
	public SwingEx() {
		super("ó�� ���� ����");
		setBounds(50, 50, 600, 600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jbtn = new JButton("Click");
		
		add(jbtn);
		
		jbtn.addActionListener(this);
		
		setVisible(true);		
	}// ������ end
	
	public static void main(String[] args) {
		new SwingEx();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�ȳ��ϼ��� �� �ָ��� �ɴϴ�");
	}

	
	
}
















