package exam_09;


import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Memo extends JFrame implements ActionListener{
	
	JTextArea jta; // 대화창
	JMenuBar menuBar;
	JMenu jbtn1, jbtn2, jbtn3, jbtn4, jbtn5 ; // 버튼
	JMenuItem newM, openM, saveM, printM, exitM; 
	JMenuItem cutM, copyM, pastM;
	
	/*// 컴포넌트를 부착할 패널
	JPanel jp; */
	
	public Memo() {
		// TODO Auto-generated constructor stub
		super("제목없음 - 메모장"); // 제목
		setBounds(50, 50, 600, 600); // 창 크기
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료
		
		jta = new JTextArea();
		add(jta, "Center");
		
		menuLayout();
		
		
		setVisible(true);
		
		
	} // 생성자 end
	
	private void menuLayout() {
		menuBar = new JMenuBar();
		jbtn1 = new JMenu("파일(F)");
		newM = new JMenuItem("새로만들기");
		openM = new JMenuItem("열기");
		saveM = new JMenuItem("저장");
		printM = new JMenuItem("인쇄");
		exitM = new JMenuItem("끝내기");

		jbtn1.add(newM); jbtn1.add(openM);  jbtn1.add(saveM); 
		jbtn1.add(printM); jbtn1.add(exitM); // 첫번째 메뉴바에 넣기
		
		
		jbtn2 = new JMenu("편집(E)");
		cutM = new JMenuItem("잘라내기");
		copyM = new JMenuItem("복사");
		pastM = new JMenuItem("붙여넣기"); 
		

		jbtn2.add(cutM); jbtn2.add(copyM); jbtn2.add(pastM); // 두번쨰 메뉴바에 넣기
		jbtn3 = new JMenu("서식(O)");
		jbtn4 = new JMenu("보기(v)");
		jbtn5 = new JMenu("도움말(H)");

		menuBar.add(jbtn1);
		menuBar.add(jbtn2);
		menuBar.add(jbtn3);
		menuBar.add(jbtn4);
		menuBar.add(jbtn5);
		
		setJMenuBar(menuBar);
		
		newM.addActionListener(this);
		openM.addActionListener(this); 
		saveM.addActionListener(this); 
		printM.addActionListener(this); 
		exitM.addActionListener(new ExitListener());
		cutM.addActionListener(this); 
		copyM.addActionListener(this); 
		pastM.addActionListener(this);
		
		
		
	} // 함수 end
	
	// 메뉴바 종료 핸들러
		class ExitListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == exitM) {
					System.exit(0);
				}
			}
	}
		
	
	public static void main(String[] args) {
		new Memo();
	} // main end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == newM) {
			Memo m = new Memo();
			m.setTitle("새로만들기 - 2");
		
		}else if (e.getSource() == openM) {
			FileDialog fileOpen = new FileDialog(this, "파일열기", FileDialog.LOAD);    
            this.setVisible(true);
            fileOpen.setDirectory("c:\\");
            fileOpen.setVisible(true);
            String fname = fileOpen.getDirectory() + fileOpen.getFile();
            System.out.println(fname);
            
            try {
    			BufferedReader reader = new BufferedReader(new FileReader(fname));
    			jta.setText("");
    			String line;
    			
    				while((line = reader.readLine()) != null) { // 한 줄에 글씨가 있다면
    					jta.append(line +"\n"); // 대화창에 한 줄 추가하고 줄 바꾸기
    				}
    				reader.close();
    				
    			setTitle(fileOpen.getFile() +" -메모장"); // 제목 설정: open파일  -메모장
    		} catch (IOException e1) {
    				JOptionPane.showMessageDialog(this,"열기오류");
    		}

           
            //파일을선택한다음, FileDialog의열기버튼을누르면,

            //getFile()과getDirectory()를이용해서파일이름과위치한디렉토리를얻을수있다.

            
		}else if (e.getSource() == saveM) {
			FileDialog fileSave = new FileDialog(this, "파일저장", FileDialog.SAVE);
			 this.setVisible(true);
			 fileSave.setDirectory("c:\\");
			 fileSave.setVisible(true);
			 String fname = fileSave.getDirectory() + fileSave.getFile();
			 System.out.println(fname);
			 try {
					BufferedWriter writer = new BufferedWriter(new FileWriter(fname));
					writer.write(jta.getText()); // 대화창 글씨 가져오기
					writer.close();
					
					setTitle(fileSave.getFile()+" -메모장");
			 } catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(this, "저장 오류");
			 }
			 
		}else if (e.getSource() == printM) {
			System.out.println("파일을 인쇄합니다.");	
		}else if (e.getSource() == cutM) {
			System.out.println("파일을 잘라냅니다.");
		}else if (e.getSource() == copyM) {
			System.out.println("파일을 복사합니다.");
		}else if (e.getSource() == pastM) {
			System.out.println("파일을 붙여넣습니다.");
		}
	} // actionPerformed end
} // class end
