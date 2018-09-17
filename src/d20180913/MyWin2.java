package d20180913;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MyWin2 extends Frame {
	
	public MyWin2() {
		setBounds(50, 50, 800, 600);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		// 랜덤하게 원 200개 그려보세요
		// (위치, 크기, 색 => 모두 랜덤)
		
		// 색 : Color(255,255,255)
		
		// g.drawOval(x, y, w, h)
		
		Random rnd = new Random();
			
		for(int i=1; i<=200; i++) {
			try {
				Thread.sleep(60);
				int x = rnd.nextInt(800); // 800 이내
				int y = rnd.nextInt(600); // 600 이내
				int w = rnd.nextInt(800); 
				int h = rnd.nextInt(600);
				
				int red = rnd.nextInt(255);
				int green = rnd.nextInt(255);
				int blue = rnd.nextInt(255);
				
				Color c = new Color(red, green, blue);
				
				g.setColor(c);		
				
				g.drawOval(x, y, w, h);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		
	}
	
	
	public static void main(String[] args) {
		new MyWin2();
	}
}











