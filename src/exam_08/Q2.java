package exam_08;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// id , pw �� 
// textField �� id�� �н����� �Է�. ������ ���ڰ� ������
// ~~~ �� �α����ϼ̽��ϴ�. ~~�Է��ϼ̽��ϴ�
// ������ ���ڰ� �ٸ��� ȸ�������ϼ���
public class Q2 extends Frame implements ActionListener {
	Button btn;
	Button btn2;
	Label id;
	Label pwd;
	TextField tf1;
	TextField tf2;
	String login = "ekdusdl00";
	String pw = "test1234";

	
	Q2() {
		super("login"); // ����
		setSize(400, 300); // â ũ��
		setLocation(600, 200); // â ��ġ
		setVisible(true); // â ���̱�
		
		this.addWindowListener(new WindowAdapter() { 
			// ���ϴ� �����츮���ʸ� ����
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0); // ���� ����
			}
		});
		
		//Label�� �����ϰ� ũ��� ��ġ�� �����Ѵ�
        id = new Label("ID :");
        //50, 50��ġ�� ũ�Ⱑ ����30, ����10
        id.setBounds(100,50,50,20);
        tf1 = new TextField();
        tf1.setBounds(150,50,120,30);
        
        pwd = new Label("Password :");
        pwd.setBounds(60,100,80,20);
        tf2 = new TextField();
        tf2.setBounds(150,100,120,30);
        btn = new Button("Login");
        btn.setBounds(130, 150, 150, 30);
        btn2 = new Button("Sign up");
        btn2.setBounds(130, 200, 150, 30);
        
        add(id);
        add(pwd);
        add(tf1);
        add(tf2);
        add(btn);
        add(btn2);
        
        btn.addActionListener(this);
        btn2.addActionListener(this);
        
	} // ������ end
	
	public static void main(String[] args) {
		new Q2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e. getSource();

		if(obj==btn) {
			if(tf1.getText().equals(login) && tf2.getText().equals(pw)) {
				System.out.println(login +"���� �α����ϼ̽��ϴ�.");
			}
		}else if(obj==btn2) {
			if(tf1.getText().equals(login) == false && tf2.getText().equals(pw) == false) {
				System.out.println(tf1.getText() + ", " + tf2.getText() + " �Է��ϼ̽��ϴ�. ���̵� Ȥ�� �н����尡 �����ϴ�.");
				System.out.println("ȸ�������ϼ���.");
			}else {
				System.out.println("���̵� �����մϴ�. �ٽ� �α����ϼ���.");
			}
		}
	} // action
	
} // class end
