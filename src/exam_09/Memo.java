package exam_09;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Memo extends JFrame implements ActionListener{
	
	JTextArea jta; // 대화 문장
	JTextField jtf; // 대화창
	JButton jbtn1; // 버튼
	JButton jbtn2; // 버튼
	JButton jbtn3; // 버튼
	JButton jbtn4; // 버튼
	JButton jbtn5; // 버튼
	
	// 컴포넌트를 부착할 패널
	JPanel jp; 
	JScrollPane jsp; // 스크롤 대화창
	
	public Memo() {
		// TODO Auto-generated constructor stub
		super("제목없음 - 메모장");
		setBounds(50, 50, 600, 600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jta = new JTextArea();
		jtf = new JTextField(80);
		jbtn1 = new JButton("파일(F)");
		jbtn2 = new JButton("편집(E)");
		jbtn3 = new JButton("서식(O)");
		jbtn4 = new JButton("보기(v)");
		jbtn5 = new JButton("도움말(H)");
		
		
		JButton[] jbtn = {jbtn1, jbtn2, jbtn3, jbtn4, jbtn5};
		
		jp = new JPanel();
		jsp = new JScrollPane(jta, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED				
				);
		// vertical : 수직의 , horizon : 수평의
		
		jta.setBackground(Color.white);
		jp.setBackground(Color.white);
		
		for(int i=0; i<5; i++ ) {
			
		}
		for(int i=0; i<5; i++ ) {
			jbtn[i].setBackground(Color.white);
		}
		
	/*	jbtn1.setBackground(Color.white);
		jbtn2.setBackground(Color.white);
		jbtn3.setBackground(Color.white);
		jbtn4.setBackground(Color.white);
		jbtn5.setBackground(Color.white);*/
		
		for(int i=0; i<5; i++ ) {
			jbtn[i].setFocusPainted(true);
		}
		
	/*	jbtn1.setFocusPainted(true);
		jbtn2.setFocusPainted(true);
		jbtn3.setFocusPainted(true);
		jbtn4.setFocusPainted(true);
		jbtn5.setFocusPainted(true);*/
		
		jsp.setBounds(0, 50, 600, 600);
		add(jsp);
		
		for(int i=0; i<5; i++ ) {
			jbtn[i].setFocusPainted(true);
		}
		
		int x = 0;
		for(int i=0; i<5; i++ ) {
			jbtn[i].setBounds(x, 10, 100, 50);
			x += 120;
		}
		
		for(int i=0; i<5; i++ ) {
			jp.add(jbtn[i]);
		}
		
		jp.setBounds(0, 30, 600, 50);
		add(jp);
		
		for(int i=0; i<5; i++ ) {
			jbtn[i].addActionListener(this);
		}
		
		setVisible(true);
		
	} // 생성자 end
	
	public static void main(String[] args) {
		new Memo();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
