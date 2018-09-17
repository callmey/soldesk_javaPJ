package exam_09;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class SearchWord extends Frame implements ActionListener{
	TextField tf1;
	TextField tf2;
	Button btn1;
	Button btn2;
	
	
	SearchWord() {
		super("SeachWord");
		setBounds(700, 300, 300, 300);
		setVisible(true);
		setLayout(null);
		
		
		tf1 = new TextField();
		tf2 = new TextField();
		btn1 = new Button("Insert");
		btn2 = new Button("Find");
		
		tf1.setBounds(50, 100, 100, 30);
		tf2.setBounds(50, 150, 100, 30);
		btn1.setBounds(200, 100, 50, 30);
		btn2.setBounds(200, 150, 50, 30);
		
		add(tf1); add(tf2); add(btn1); add(btn2);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		
	} // »ý¼ºÀÚ end
	
	public static void main(String[] args) {
		new SearchWord();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		HashSet hs = new HashSet();
		String str;
		
		if(tf1.getText()!= null) {
			
			
		}
		
		/*else if(obj == btn2) {*/
		/*	System.out.println(hs);
			it=hs.iterator();
			while(it.hasNext()) {
				obj1 = it.next();
				System.out.print(obj1 + " ");
			}*/
	}		
} //class end
