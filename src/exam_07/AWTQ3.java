package exam_07;

// �Ʒ� next, exit ��ư ����  next ������ r -y -g ������ �� �ٲٰ� exit ������ ����
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
		System.out.println("������ â�� ������ ȣ��");
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
		
				if(e.getSource() == btn1 && cnt == 0) { // ��ư 1�̸鼭 ù��° ����
					this.setBackground(Color.RED);  
					cnt ++; 	
				}
				else if(e.getSource() == btn1 && cnt == 1) { //�ι�° �Ķ�
					this.setBackground(Color.BLUE); cnt++; 
				}
				else if(e.getSource() == btn1 && cnt == 2) { // ����° ���
					this.setBackground(Color.GREEN); cnt++; cnt= cnt % 3; // �ٽ� ó������
				}
				else if(e.getSource()== btn2){ //��ư 2�� �� ����
					System.exit(0);
				}
		}
	} // actionPerformed end
