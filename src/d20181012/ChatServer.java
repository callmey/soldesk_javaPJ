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
		super("ä�ü���  1,01");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(30, 30, 800, 600);
		
		f = new Font("���", ABORT, 30);
		jbtn1 = new JButton("Exit");
		jta1 = new JTextArea();
		jta1.setFont(f);
		
		add(jbtn1, "South");
		add(jta1, "Center");
		
		jsp = new JScrollPane(jta1, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED// ������ �ִ� ũ�⸦ �Ѿ�� ��ũ�� ����.
				);
		
		add(jsp, "Center");
		
		jbtn1.addActionListener(this);
		
		startChat();
		
	} // ������ end
	
	// ä�ð� ���õ� ������ ��� ��Ƽ� �޼ҵ�� ����
	private void startChat() {
		try {
			ss = new ServerSocket(5000);
			while(true) {
				Socket client = ss.accept();
				// ��Ƽ ������ ������ �κ�
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
		(this, "�����ұ��?", "��¥", JOptionPane.YES_NO_OPTION);
		
		if(result == JOptionPane.OK_OPTION) {
			System.out.println("�����մϴ�");
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
	
	} // ������ end
	
	@Override
	public void run() { 
		// �а� ���� ���
		String msg = null;
		while(true) {
			try {
				msg = br.readLine();
				
				// Inner Class�� OuterClass�� ������ ����� �� ����
				jta1.append("["+ip+"]" + msg + "\n");
				
				JScrollBar bar = jsp.getVerticalScrollBar();
				int position = bar.getMaximum(); // �����κ� ������ ���������
				bar.setValue(position);
				// TextArea�� ���� ������ ����
				
				// ��ο��� �ѷ��ִ� ���
				broadCast("["+ip+"]" + msg);
				
				
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				list.remove(this);
			}
		} // while() end
	} // run() end
	
	void broadCast(String msg) {
		// ArrayList �ȿ� �ִ� ��� ��ü�� ������ ���
		for(MTServer ms : list) {
			ms.pw.println(msg);
			ms.pw.flush();
		}
	} // broadCast end()
} 

} // ChatServer class end

