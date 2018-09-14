package exam_08;
// Lotto
// 6개의 Label 혹은 라벨도 상관없음
// 6개 랜덤하게 출력

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Q3 extends Frame implements ActionListener {	
	Label lb;
	
	Button btn;

	
	Q3() {
		super("ArrLotto");
		setSize(400, 400);
		setLocation(400, 200);
		setLayout(null);
		setVisible(true);
		
		lb = new Label("");
		
		btn = new Button("Random");
		
		
		lb.setBounds(150, 100, 150, 100);	
	
		btn.setBounds(160,250,60,40);
		
		add(lb);
		add(btn);
		
		btn.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}	
			
		});
	}  // 생성자 end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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
		
				String text = "";
				for(int i=0; i< 6; i++) {
					text += rnd[i] + " ";
				}
		
			lb.setText(text);
		}
	

	public static void main(String[] args) {
		new Q3();	
	}
	
} // class end

