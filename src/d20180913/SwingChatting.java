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

// a.k.a 심심이
public class SwingChatting extends JFrame implements ActionListener, KeyListener {
	// title : 심심이
	// 600, 400 크기
	// x : 종료 기능
	// 스윙 컴포넌트로 구성
	
	String[] str = {
			"밥은 먹고 다니니?",
			"부모님은 잘 계시니?",
			"심심해~",
			"곧 주말이 오는군요",
			"안녕하세요",
			"오늘 뭐 먹지?",
			"들은 것은 잊어버리고, 본 것은 기억하고 직접 해본 것은 이해하자",
			"아이폰 xr 출시",
			"메르스 조심하자",
			"폭행은 안되요~"		
	};
	
	JTextArea jta; // 대화 문장
	JTextField jtf; // 대화창
	JButton jbtn; // 버튼
	
	// 컴포넌트를 부착할 패널
	JPanel jp;
	JScrollPane jsp; // 스크롤
	
	public SwingChatting() {
		super("심심이 ver 1.01");
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
		
		// vertical : 수직의 , horizon : 수평의
		
		// R , G, B : red, green, blue
		// 0 ~ 255
		
		//Color c = new Color(110, 222, 243);
		jta.setBackground(Color.WHITE); //JtextArea
		jp.setBackground(Color.PINK);	//Jpanel
		
		add(jsp, "Center");  // JScrollPane
		
		// 패널에 먼저 textfield와 button을 붙이기
		jp.add(jtf);
		jp.add(jbtn);
		
		// 컨테이너에 담기
		add(jp, "South");
		
		jbtn.addActionListener(this);	
		jtf.addKeyListener(this);
		
		setVisible(true);
		
		jtf.requestFocus();
	}
	
	public static void main(String[] args) {
		new SwingChatting();
	}
	
	// 심심이가 나에게 대답해주는 메소드
	private void makeWord() {
		Random rnd = new Random();
		
		int value = rnd.nextInt(str.length);
		
		jta.append("심심이 : " + str[value] + "\n");		
	}	
	
	// 채팅창에서 글이 보이는 메소드
	private void appendData() {
		String str = jtf.getText();
		jta.append(str + " \n");
		
		makeWord();
		
		jtf.setText(null);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 클릭하면 채팅창에 글이 써지도록 하는 로직이 필요
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
