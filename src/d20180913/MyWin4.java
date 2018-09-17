package d20180913;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyWin4 extends Frame implements MouseListener {
	
	Image img;
	int x1, x2, y1, y2, w, h;
	
	public MyWin4() {
		Toolkit tool = Toolkit.getDefaultToolkit(); 
		// 해당 객체로 현재 플랫폼의 화면 크기나 로컬 영역의 위치를 추적해  image 객체를 얻어 낼 수 있다.
		
		Dimension d = tool.getScreenSize(); 
		// tookit 객체를 통해 화면 크기를 얻어 내는 메소드 선언 가능
		
		/*System.out.println(d.width);
		System.out.println(d.height);*/
		int x = d.width/2-400; // 창  X 위치
		int y = d.height/2-300; // 창 Y 위치
		
		img = tool.getImage("src/images/dog.jpg"); 
		//tookit 객체를 통해 로컬 경로 이미지를 얻어 내는 메소드 선언 가능
		
		setBounds(x, y, 800, 600); // 창 위치, 크기 선언 및 초기화
		
		x1 = 100; 
		y1 = 100; 
		x2 = 200;
		y2 = 200;
		w = 80;
		h = 80; //원울 그리기 위한 변수 초기화
		
		this.addMouseListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin4();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawImage(img, 10, 10, 800, 600, this); // dog.jpg
		
		g.setColor(Color.ORANGE); // 원 색
		g.drawOval(x1, y1, w, h); //원
		
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) { // 마우스 누를 떄
		x1 = e.getX(); // 눌렀던 x 위치
		y1 = e.getY(); // 눌렀던 Y 위치
	}

	@Override
	public void mouseReleased(MouseEvent e) { // 마우스 뗄 때
		w = e.getX() - x1; // 땔 때 X - 눌렀던 X = 지정된 너비
		h = e.getY() - y1; // 뗄 떄 Y - 눌렀던 Y = 지정된 높이
		
		repaint(); // update(), paint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}