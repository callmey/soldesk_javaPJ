package d20181010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// �ѱ� ����� ����ϱ�. 

public class IOEx6 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\soldesk\\Downloads\\good2.txt");
		
		FileOutputStream fos = new FileOutputStream(f); 
		
		FileReader fr = new FileReader(f);
		
		FileWriter fw = new FileWriter(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("�Է��ϼ��� (���� ctrl + z) ");
		
		int v = 0;
		
		while((v=isr.read()) != -1 ) {
			bw.write(v);
			System.out.print((char)v);
		}
		
		bw.flush();
		bw.close();
		
		System.out.println(" ����Ǿ����ϴ�.");
	}
}
