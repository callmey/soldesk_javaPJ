package d20180911;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ��ư 1�� �����
// ��ư�� South ��ġ�غ�����

public class AWTEx06 extends Frame{
	Button btn;
	
	AWTEx06() {
		super("Action Test");
		setSize(400, 300);
		setLocation(600, 200);
		
		/*BorderLayout bl = new BorderLayout();
		setLayout(bl);*/
		
		btn = new Button("click");
		
		add(btn, "South"); // borderLayout ���� �� �ۼ� ���
		
		Handler1 hd1 = new Handler1();
		btn.addActionListener(hd1);
		
		setVisible(true);	
		
	}
	public static void main(String[] args) {
		new AWTEx06();
	} // main() end
} // class end

class Handler1 implements ActionListener{ //public ����. �� ������ ������ AWTEx06 �̹Ƿ�

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�ȳ��ϼ���");
		System.exit(0); // 0 : ��������
						// 0 �̿��� �ٸ� �� ��� : ������ ����
	}

	
}
