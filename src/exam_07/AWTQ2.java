package exam_07;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTQ2 extends Frame implements ActionListener{
	Button btn;
	
	AWTQ2() {
		super("GuGuDan");
		setSize(400, 300);
		setLocation(600, 200);
		setVisible(true);
		
		btn = new Button("GuGuDan");
		
		add(btn, "South");
		
		btn.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new AWTQ2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int dan; //¸â¹ö º¯¼ö	
		
		dan = (int)(Math.random()*10);
		
		if(dan != 0) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i)); 
			}
			System.out.println();
		}
	}
	
}
