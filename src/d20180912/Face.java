package d20180912;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Face extends Frame { // implements WindowListener 사용 안함.

	Face() {
		super("Face");
		/*setSize(800, 600);
		setLocation(100, 100);*/ // setBounds 방식으로 사용가능
		setVisible(true);
		
		setBounds(100, 100, 800, 600);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.out.println("종료합니다");
				System.exit(0);
				
			}
		});
	
		
	
	} // 생성자() end
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g); // g 는 붙여서 사용한다는 뜻
		g.drawOval(200, 100, 400, 400); // 얼굴
		g.drawOval(260, 210, 80, 80); // 오른 눈
		g.fillOval(270, 220, 60, 60); //오른 동공
		
		g.drawOval(450, 210, 80, 80); // 왼눈
		g.fillOval(460, 220, 60, 60); // 왼 동공
		
		g.fillRect(260, 170, 80, 30); // 오른 눈썹
		g.fillRect(450, 170, 80, 30);
		
		g.drawArc(330, 300, 150, 150, 0 , -180);
		
	}
	
	
	public static void main(String[] args) {
		new Face();
	}

}
