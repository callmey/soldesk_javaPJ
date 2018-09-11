package d20180911;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

// Layout Manager : ��ġ������
// �����̳ʿ��� ������Ʈ�� ��� ��ġ���� �����ִ� ��ġ�����ڰ� ����
// Frame�� ��ӹ����� �⺻������ Border Layout ���


public class AWTEx03 extends Frame{
	Button btn1, btn2, btn3, btn4, btn5;
	
	AWTEx03() {
		super("BorderLayout"); // super(title)�� ���������� ������ �־���.
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl); // �⺻������ Frame�� ��ӹ����� Border Layout�� �������־ ��������.
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER");
		
		add(btn1, bl.EAST); // Border Layout�� ��������� ����� ��.
		add(btn2, bl.WEST);
		add(btn3, bl.SOUTH);
		add(btn4, bl.NORTH);
		add(btn5, bl.CENTER);
		
	}
	
	public static void main(String[] args) {
		new AWTEx03(); // �� Ŭ�������� ���� �ҷ��� ���� �ֱ� ������ ���� ����.
	}
		

}
