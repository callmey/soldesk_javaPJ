package d20180914;

import java.util.ArrayList;

// Vector : ������ ������ Object �迭
// ArrayList : �񵿱��� ������ Object �迭(�� �ֽ�, �� ���� ���)

public class CollectionEx2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // �ߺ� ���
		
		al.add("����");
		al.add("����");
		al.add("����"); 
		al.add("�ٳ���");
		al.add(10);
		
		System.out.println(al.get(2));
		System.out.println(al.indexOf("����"));
		
		
	}
}
