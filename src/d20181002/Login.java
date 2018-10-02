package d20181002;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	JButton jbtn1, jbtn2;
	JLabel jlb1, jlb2;
	JTextField jtf1;
	JPasswordField jpf;
	
	public Login() {
		super("간단한 로그인");
		setBounds(100, 100, 400, 300);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료
		
		jbtn1 = new JButton("Login");	
		jbtn2 = new JButton("End");
		
		jbtn1.setBounds(80, 200, 80, 40);
		jbtn2.setBounds(200, 200, 70, 40);
		
		add(jbtn1); add(jbtn2);
		
		jlb1 = new JLabel("ID");
		jlb2 = new JLabel("PW");
		
		jlb1.setBounds(30, 60, 70, 40);
		jlb2.setBounds(30, 120, 70, 40);
		
		add(jlb1); add(jlb2);
		
		jtf1 = new JTextField(30); // 30자 쓰기
		jpf = new JPasswordField(30);
		jtf1.setBounds(100, 60, 150, 40);
		jpf.setBounds(100, 130, 150, 40);
		
		add(jtf1); add(jpf);
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		setVisible(true);
		
	} // 생성자 end

	public static void main(String[] args) {
		new Login();
	} // main() end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==jbtn1) {
			System.out.println("로그인 버튼 눌러짐");
			// ID, PW 읽어와서 데이터베이스에 접근 후 있는 사용자 인지 비교
		} else if(obj==jbtn2) {
			System.exit(0);
		}
		
	}
} // class end()
