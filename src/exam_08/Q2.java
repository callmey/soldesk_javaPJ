package exam_08;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// id , pw 라벨 
// textField 에 id랑 패스워드 입력. 정해진 문자가 맞으면
// ~~~ 님 로그인하셨습니다. ~~입력하셨습니다
// 정해진 문자가 다르면 회원가입하세요
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
		super("login"); // 제목
		setSize(400, 300); // 창 크기
		setLocation(600, 200); // 창 위치
		setVisible(true); // 창 보이기
		
		this.addWindowListener(new WindowAdapter() { 
			// 원하는 윈도우리스너만 사용시
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0); // 정상 종료
			}
		});
		
		//Label을 생성하고 크기와 위치를 지정한다
        id = new Label("ID :");
        //50, 50위치에 크기가 가로30, 세로10
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
        
	} // 생성자 end
	
	public static void main(String[] args) {
		new Q2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e. getSource();

		if(obj==btn) {
			if(tf1.getText().equals(login) && tf2.getText().equals(pw)) {
				System.out.println(login +"님이 로그인하셨습니다.");
			}
		}else if(obj==btn2) {
			if(tf1.getText().equals(login) == false && tf2.getText().equals(pw) == false) {
				System.out.println(tf1.getText() + ", " + tf2.getText() + " 입력하셨습니다. 아이디 혹은 패스워드가 없습니다.");
				System.out.println("회원가입하세요.");
			}else {
				System.out.println("아이디가 존재합니다. 다시 로그인하세요.");
			}
		}
	} // action
	
} // class end
