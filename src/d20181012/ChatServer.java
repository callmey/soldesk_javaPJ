package d20181012;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatServer extends JFrame implements ActionListener{

	ArrayList<MTServer> list = new ArrayList<>();
	ServerSocket ss;
	PrintWriter pw;
	BufferedReader br;
	
	JButton jbtn1;
	JTextArea jta1;
	JScrollPane jsp;
	Font f;
	
	public ChatServer() {
		super("채팅서버  1,01");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(30, 30, 800, 600);
		
		f = new Font("고딕", ABORT, 30);
		jbtn1 = new JButton("Exit");
		jta1 = new JTextArea();
		jta1.setFont(f);
		
		add(jbtn1, "South");
		add(jta1, "Center");
		
		jsp = new JScrollPane(jta1, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED// 가지고 있는 크기를 넘어가면 스크롤 생김.
				);
		
		add(jsp, "Center");
		
		jbtn1.addActionListener(this);
		
		startChat();
		
	} // 생성자 end
	
	// 채팅과 관련된 로직은 모두 모아서 메소드로 생성
	private void startChat() {
		try {
			ss = new ServerSocket(5000);
			while(true) {
				Socket client = ss.accept();
				// 멀티 스레드 동작할 부분
				MTServer ms = new MTServer(client);
				list.add(ms);
				ms.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog
		(this, "종료할까요?", "진짜", JOptionPane.YES_NO_OPTION);
		
		if(result == JOptionPane.OK_OPTION) {
			System.out.println("종료합니다");
			System.exit(0);
		}
	} 

// Inner Class	
class MTServer extends Thread{
	Socket client;
	PrintWriter pw;
	BufferedReader br;
	String ip;
	
	public MTServer(Socket client) {
		this.client = client;
		
	
	try {
		pw = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(
								client.getOutputStream())));
		br = new BufferedReader(
				new InputStreamReader(
						client.getInputStream()));
		
		InetAddress inet = client.getInetAddress();
		ip = inet.getHostAddress();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	} // 생성자 end
	
	@Override
	public void run() { 
		// 읽고 쓰는 기능
		String msg = null;
		while(true) {
			try {
				msg = br.readLine();
				
				// Inner Class는 OuterClass의 변수를 사용할 수 있음
				jta1.append("["+ip+"]" + msg + "\n");
				
				JScrollBar bar = jsp.getVerticalScrollBar();
				int position = bar.getMaximum(); // 일정부분 지나면 사라지도록
				bar.setValue(position);
				// TextArea에 글을 쓰도록 만듦
				
				// 모두에게 뿌려주는 기능
				broadCast("["+ip+"]" + msg);
				
				
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				list.remove(this);
			}
		} // while() end
	} // run() end
	
	void broadCast(String msg) {
		// ArrayList 안에 있는 모든 객체를 꺼내서 출력
		for(MTServer ms : list) {
			ms.pw.println(msg);
			ms.pw.flush();
		}
	} // broadCast end()
} 

} // ChatServer class end

