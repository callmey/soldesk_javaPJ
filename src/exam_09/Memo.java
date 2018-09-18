package exam_09;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Memo extends JFrame implements ActionListener{
	
	JTextArea jta; // ��ȭ ����
	JTextField jtf; // ��ȭâ
	JMenu jbtn1, jbtn2, jbtn3, jbtn4, jbtn5 ; // ��ư
	JMenuItem newM, openM, saveM, printM, exitM; 
	JMenuItem cutM, copyM, pastM;
	
	// ������Ʈ�� ������ �г�
	JPanel jp; 
	JScrollPane jsp; // ��ũ�� ��ȭâ
	
	public Memo() {
		// TODO Auto-generated constructor stub
		super("������� - �޸���");
		setBounds(50, 50, 600, 600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		jta = new JTextArea();
		jtf = new JTextField(80);
		jbtn1 = new JMenu("����(F)");
		jbtn2 = new JMenu("����(E)");
		jbtn3 = new JMenu("����(O)");
		jbtn4 = new JMenu("����(v)");
		jbtn5 = new JMenu("����(H)");
		newM = new JMenuItem("���θ����");
		openM = new JMenuItem("����");
		saveM = new JMenuItem("����");
		printM = new JMenuItem("�μ�");
		exitM = new JMenuItem("������");
		cutM = new JMenuItem("�߶󳻱�");
		copyM = new JMenuItem("����");
		pastM = new JMenuItem("�ٿ��ֱ�"); 
		
		
		JMenu[] jbtn = {jbtn1, jbtn2, jbtn3, jbtn4, jbtn5};
		
		jp = new JPanel();
		jsp = new JScrollPane(jta, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED				
				);
		// vertical : ������ , horizon : ������
		
		jta.setBackground(Color.white);
		jp.setBackground(Color.white);
		
		for(int i=0; i<5; i++ ) {
			jbtn[i].setBackground(Color.white);
		}
		
	/*	jbtn1.setBackground(Color.white);
		jbtn2.setBackground(Color.white);
		jbtn3.setBackground(Color.white);
		jbtn4.setBackground(Color.white);
		jbtn5.setBackground(Color.white);*/
		
		/*for(int i=0; i<5; i++ ) {
			jbtn[i].setFocusPainted(true);
		}*/
		
	/*	jbtn1.setFocusPainted(true);
		jbtn2.setFocusPainted(true);
		jbtn3.setFocusPainted(true);
		jbtn4.setFocusPainted(true);
		jbtn5.setFocusPainted(true);*/
		
		jsp.setBounds(0, 30, 600, 600);
		add(jsp);
		
		/*for(int i=0; i<5; i++ ) {
			jbtn[i].setFocusPainted(true);
		}*/
		
		int x = 0;
		for(int i=0; i<5; i++ ) {
			jbtn[i].setBounds(x, 10, 100, 50);
			x += 120;
		}
		
		for(int i=0; i<5; i++ ) {
			jp.add(jbtn[i]);
		}
		
		jbtn1.add(newM); jbtn1.add(openM);  jbtn1.add(saveM); 
		jbtn1.add(printM); jbtn1.add(exitM);
		
		
		jp.setBounds(0, 0, 600, 50);
		add(jp);
		
		for(int i=0; i<5; i++ ) {
			jbtn[i].addActionListener(this);
		}
		
		newM.addActionListener(this); 
		openM.addActionListener(this);
		saveM.addActionListener(this); 
		printM.addActionListener(this);
		exitM.addActionListener(this);
		
		
		setVisible(true);
		
	} // ������ end
	
	public static void main(String[] args) {
		new Memo();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
