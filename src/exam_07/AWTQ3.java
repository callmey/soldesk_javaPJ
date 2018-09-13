package exam_07;

// 아래 next, exit 버튼 만들어서  next 누르면 r -y -g 순으로 색 바꾸고 exit 누르면 종료
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class AWTQ3 extends Frame implements ActionListener, WindowListener{
	Button btn1;
	Button btn2;
	
	int cnt = 0;
	
	AWTQ3() {
		setSize(200, 300);
		setLocation(600, 200);
		setLayout(null);//no layout manager  
		
		this.addWindowListener(this); // 
		
		
		btn1 = new Button("NEXT");
		btn2 = new Button("EXIT");
		
		btn1.setBounds(0,261,100,30);// setting button position  
		btn2.setBounds(100,261,100,30);
		add(btn1);
		add(btn2);
		
		btn1.addActionListener(this);
		
		btn2.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AWTQ3();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 창이 닫히면 호출");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
				if(e.getSource() == btn1 && cnt == 0) { // 버튼 1이면서 첫번째 빨강
					this.setBackground(Color.RED);  
					cnt ++; 	
				}
				else if(e.getSource() == btn1 && cnt == 1) { //두번째 파랑
					this.setBackground(Color.BLUE); cnt++; 
				}
				else if(e.getSource() == btn1 && cnt == 2) { // 세번째 녹색
					this.setBackground(Color.GREEN); cnt++; cnt= cnt % 3; // 다시 처음으로
				}
				else if(e.getSource()== btn2){ //버튼 2일 때 종료
					System.exit(0);
				}
		}
	} // actionPerformed end
