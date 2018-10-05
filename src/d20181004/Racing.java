package d20181004;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing extends JFrame implements ActionListener {

	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	ImageIcon icon1,icon2,icon3,icon4;
	Horse h1,h2,h3;
	
	public Racing() {
		System.out.println("스크린 경마장");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50,100,1200,600);
		setLayout(null);
		
		icon1 = new ImageIcon("src/images/horseStop.png");
		icon2 = new ImageIcon("src/images/horseStop.png");
		icon3 = new ImageIcon("src/images/horseStop.png");
		icon4 = new ImageIcon("src/images/horse.gif");
		
		jbtn1= new JButton("1h",icon1);
		jbtn2= new JButton("2h",icon2);
		jbtn3= new JButton("3h",icon3);
		jbtn4= new JButton("STRAT!!");
		
		jbtn1.setBounds(60, 80, 128, 128);
		jbtn2.setBounds(60, 220, 128, 128);
		jbtn3.setBounds(60, 360, 128, 128);
		jbtn4.setBounds(100, 500, 400, 50);
		
		jbtn4.addActionListener(this);
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		
		setVisible(true);
	}//생성자 end
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			/*try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
			jbtn1.setLocation(jbtn1.getX()+10,jbtn1.getY());
			jbtn2.setLocation(jbtn2.getX()+10,jbtn2.getY());
			jbtn3.setLocation(jbtn3.getX()+10,jbtn3.getY());
			*/
			
			//멀티쓰레드로 구성하여 각각 다르게 달리도록 한다.
			//멀티스레드 구현
			
			h1 = new Horse(jbtn1);
			h2 = new Horse(jbtn2);
			h3 = new Horse(jbtn3);
			
			h1.jbtn.setIcon(icon4);
			h2.jbtn.setIcon(icon4);
			h3.jbtn.setIcon(icon4);
			
			h1.start();
			h2.start();
			h3.start();
			
		
		}
	
	}
	
	public static void main(String[] args) {
		new Racing();
	}
}
