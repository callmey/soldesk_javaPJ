package d20180911;

import java.awt.Button;
import java.awt.Frame;

// container : �ٸ� component���� ���� �� �ִ� component
public class AWTEx02 extends Frame{
	
	Button btn; // ��ü ����. �����ڿ��� �ʱ�ȭ��.
	
	AWTEx02(String title) {
		super(title);
		// ������ 400, 200
		setSize(400, 200);

		// ��ġ : 597, 289
		setLocation(597, 289);

		// ��ư
		btn = new Button("Click");
		// �����̳ʿ� ������Ʈ�� ��ƾ� �� �� ����
		add(btn);

		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTEx02 aw = new AWTEx02("��ư�� �ִ� ������");
	}
}
