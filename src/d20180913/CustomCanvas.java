package d20180913;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class CustomCanvas extends JPanel {
	Image img;
	
	public CustomCanvas(Image img) {
		this.img = img;
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img, 0, 0, 800, 600, this);  
	}
	
}