package d20181004;

import java.util.Random;

import javax.swing.JButton;

public class Horse extends Thread{

	JButton jbtn;
	
	public Horse(JButton jbtn) {
		this.jbtn= jbtn;
	}
	
	public void run() {
		
		Random rnd = new Random();
		int interval = rnd.nextInt(4000);
		
		for(int i=1;i<=9;i++) {
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jbtn.setLocation(jbtn.getX()+10,jbtn.getY());
			if(jbtn.getX() == 1100) break;
		}
	}
}
