package d20180913;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

// ���� : �ڹٿ��� GUI(Graphic User Interface)�� �����ϱ� ���� JDK���� �⺻������ �����ϴ� ���� ��Ŷ
// AWT�� ��ư, ��ȭâ ��� �����ϰ� ǥ�� Ʈ�� ���� �� �� �����ϰ� �پ��� �׷��� ������Ʈ�� ����� �� ���� ������ �����ϱ� ���Ͽ�
public class MyWin5 extends JFrame {
	Image img;
	CustomCanvas cc;
	

	public MyWin5() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		Dimension d = tool.getScreenSize();
		
		/*System.out.println(d.width);
		System.out.println(d.height);*/
		int x = d.width/2-400;
		int y = d.height/2-300;
		
		img = tool.getImage("src/images/dog.jpg");		
		
		setBounds(x, y, 800, 600);
		
		cc = new CustomCanvas(img);
		add(cc);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin5();
	}
}








