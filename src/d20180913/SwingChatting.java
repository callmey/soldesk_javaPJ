package d20180913;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// a.k.a �ɽ���
public class SwingChatting extends JFrame implements ActionListener, KeyListener {
	// title : �ɽ���
	// 600, 400 ũ��
	// x : ���� ���
	// ���� ������Ʈ�� ����
	
	String[] str = {
			"���� �԰� �ٴϴ�?",
			"�θ���� �� ��ô�?",
			"�ɽ���~",
			"�� �ָ��� ���±���",
			"�ȳ��ϼ���",
			"���� �� ����?",
			"���� ���� �ؾ������, �� ���� ����ϰ� ���� �غ� ���� ��������",
			"������ xr ���",
			"�޸��� ��������",
			"������ �ȵǿ�~"		
	};
	
	JTextArea jta; // ��ȭ ����
	JTextField jtf; // ��ȭâ
	JButton jbtn; // ��ư
	
	// ������Ʈ�� ������ �г�
	JPanel jp;
	JScrollPane jsp; // ��ũ��
	
	public SwingChatting() {
		super("�ɽ��� ver 1.01");
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jta = new JTextArea();
		jtf = new JTextField(40); // 40 columns 
		jbtn = new JButton("Insert");
		jp = new JPanel();
		jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED 
				);
		
		// vertical : ������ , horizon : ������
		
		// R , G, B : red, green, blue
		// 0 ~ 255
		
		//Color c = new Color(110, 222, 243);
		jta.setBackground(Color.WHITE); //JtextArea
		jp.setBackground(Color.PINK);	//Jpanel
		
		add(jsp, "Center");  // JScrollPane
		
		// �гο� ���� textfield�� button�� ���̱�
		jp.add(jtf);
		jp.add(jbtn);
		
		// �����̳ʿ� ���
		add(jp, "South");
		
		jbtn.addActionListener(this);	
		jtf.addKeyListener(this);
		
		setVisible(true);
		
		jtf.requestFocus();
	}
	
	public static void main(String[] args) {
		new SwingChatting();
	}
	
	// �ɽ��̰� ������ ������ִ� �޼ҵ�
	private void makeWord() {
		Random rnd = new Random();
		
		int value = rnd.nextInt(str.length);
		
		jta.append("�ɽ��� : " + str[value] + "\n");		
	}	
	
	// ä��â���� ���� ���̴� �޼ҵ�
	private void appendData() {
		String str = jtf.getText();
		jta.append(str + " \n");
		
		makeWord();
		
		jtf.setText(null);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư�� Ŭ���ϸ� ä��â�� ���� �������� �ϴ� ������ �ʿ�
		appendData();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==10) {
			appendData();
			jtf.requestFocus();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
