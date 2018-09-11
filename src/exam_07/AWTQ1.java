package exam_07;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class AWTQ1 extends Frame implements ActionListener{
	Button btn;
	
	AWTQ1() {
		super("Lotto"); //title
		setSize(400, 300);
		setLocation(600, 200);
		setVisible(true);
		
		
		btn = new Button("Lotto");
		add(btn, "South");
		
		btn.addActionListener(this);
		
		
	} // »ý¼ºÀÚ() end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
				41, 42, 43, 44, 45 };
		
		for (int i = 0; i < 1000; i++) {
			int first = (int) (Math.random() * 45);
			int second = (int) (Math.random() * 45);

			int temp = 0;
			if(first!=second) {
				temp = rnd[first];
	
				rnd[first] = rnd[second];
	
				rnd[second] = temp;
			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(rnd[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		new AWTQ1();
	}
	
}
