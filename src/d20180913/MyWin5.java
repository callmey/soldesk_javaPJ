package d20180913;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

// 스윙 : 자바에서 GUI(Graphic User Interface)를 구현하기 위해 JDK에서 기본적으로 제공하는 개발 툴킷
// AWT의 버튼, 대화창 등만을 구현하고 표나 트리 등의 좀 더 복잡하고 다양한 그래픽 컴포넌트를 사용할 수 없는 단점을 보완하기 위하여
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








