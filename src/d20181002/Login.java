package d20181002;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		super("������ �α���");
		setBounds(100, 100, 400, 300);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ����
		
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
		
		jtf1 = new JTextField(30); // 30�� ����
		jpf = new JPasswordField(30);
		jtf1.setBounds(100, 60, 150, 40);
		jpf.setBounds(100, 130, 150, 40);
		
		add(jtf1); add(jpf);
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		setVisible(true);
		
	} // ������ end

	public static void main(String[] args) {
		new Login();
	} // main() end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==jbtn1) {
			System.out.println("�α��� ��ư ������");
			// ID, PW �о�ͼ� �����ͺ��̽��� ���� �� �ִ� ����� ���� ��
			String id = jtf1.getText();
			String pw = jpf.getText(); // depricated. �����Ͱ� eclipse�� �� ������ ���� �׾���. �� ������ ���� ����.
			
			//System.out.println("id: " + id + ", pw : " + pw );
			
			// db �����ؼ� �α��� ���̺��� ������ ��
			Connection conn = MakeConnection.getConnection(); // try - catch �ʿ����.
			
			StringBuffer sb = new StringBuffer();
			sb.append("select * from login");
			sb.append("where id = ? and pw =? ");
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1,id);
				pstmt.setString(2, pw);
				
				pstmt.executeQuery();
				
				if(rs.next()) System.out.println("�����ϴ� ȸ���Դϴ�");
				else System.out.println("ȸ�������ϼ���");	
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
					try {
						if(rs!=null) rs.close();
						if(conn!=null) conn.close();
			} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} 
				
		} else if(obj==jbtn2) {
			System.exit(0);
		}
	}
} // class end()
