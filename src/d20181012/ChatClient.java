package d20181012;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, KeyListener, Runnable {
	
	// Swing 요소
	JButton jbtn1, jbtn2, jbtn3;
	JPanel jp1, jp2, jp3;
	JTextField jtf1, jtf2;
	JTextArea jta;
	JLabel jl;
	JScrollPane jsp;
	CardLayout layout;
	
	// 채팅 관련 요소
	Socket s;
	PrintWriter pw;
	BufferedReader br;
	
	//ip
	String ip;
	
	public ChatClient() {
		super("채팅클라이언트 1.01");
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		layout = new CardLayout();
		setLayout(layout);
		
		jbtn1 = new JButton("Login");
		jbtn2 = new JButton("Exit");
		
		jbtn3 = new JButton("Insert");
		
		jbtn1.setBounds(60, 200, 60, 50);
		jbtn2.setBounds(180, 200, 60, 50);
		
		jl = new JLabel("IP : ");
		jl.setBounds(40, 60, 60, 50);
		
		jtf1 = new JTextField("172.16.7.100");
		jtf1.setBounds(100, 60, 150, 40);
		
		jtf2 = new JTextField(25);
		
		jta = new JTextArea();
		
		jsp = new JScrollPane
				(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
					JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jp1.setLayout(null);
		jp1.add(jbtn1);
		jp1.add(jbtn2);
		jp1.add(jtf1);
		jp1.add(jl);
		
		Color c1 = new Color(229,234,245);
		jp1.setBackground(c1);
		
		add(jp1, "Login View"); // 화면이 안보일 시 Login View 만 뜸.
		
		jp2.setLayout(new BorderLayout());
		jp2.add(jsp, "Center");
		
		add(jp2, "Chat");
		
		Color c2 = new Color(241, 232, 92);
		
		jp3.setBackground(c2);
		jp3.add(jtf2);
		jp3.add(jbtn3);
		
		jp2.add(jp3, "South");
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		//jbtn3.addActionListener(this);
		
		jtf2.addKeyListener(this);
		
		setVisible(true);
		
	} // 생성자 end
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 소켓, I/O
		
		try {
			s = new Socket(ip, 5000);
			
			pw = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									s.getOutputStream())));
			br = new BufferedReader(
					new InputStreamReader(
							s.getInputStream()));
			
			String msg = null;
			while(true) {
		
					msg = br.readLine();
					
					// Inner Class는 OuterClass의 변수를 사용할 수 있음
					jta.append(msg + "\n");
					
					JScrollBar bar = jsp.getVerticalScrollBar();
					int position = bar.getMaximum(); // 일정부분 지나면 사라지도록
					bar.setValue(position);
					// TextArea에 글을 쓰도록 만듦
					
			} 
		}catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int v = e.getKeyCode();
		System.out.println(v);
		if(v==KeyEvent.VK_ENTER) {
			String msg = jtf2.getText();
			jta.append("["+ip+"]"+msg+"\n");
			pw.println(msg);
			pw.flush();
			jtf2.setText("");
		}
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o==jbtn1) {
			ip = jtf1.getText();
			layout.show(getContentPane(), "Chat");
			
			// 채팅 기능 시작
			Thread th = new Thread(this);
			th.start();
		}
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}
}
