package d20180911;

import java.awt.Frame;

//AWT : Abstract Window Toolkit

//component : ������ ���� ��� �������


public class AWTEx01 extends Frame {
	
	AWTEx01(String title) {
		super(title); // java. awt ���̺귯���� �ִ� Frame�̶�� �θ�����ڿ� title�� �־ ���
		// â ũ�� : 300, 300
		setSize(300, 300);        //������ ������
		
		// â ��ġ : x, y - 400, 200
		setLocation(400, 200);
		
		// â�� ���̰� �ض�
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTEx01 aw = new AWTEx01("���� ó�� ���� ������");
	}
}
