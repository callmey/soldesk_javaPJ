package d20180914;

import java.util.ArrayList;

public class WrapperEx {
	// WrapperClass
	// ������ ��ü������ �޲ٴ� �ڹ� ���α׷��� �ٶ�
	// primitive type ������ ��ü�� ���� �� �ִ�
	
	public static void main(String[] args) {
		
	ArrayList list = new ArrayList(); // ���ʸ��� ���ϴ� �ڷ������� ���߰� ������ ������ ���� ���� ����
	list.add("����");
	list.add("����");
	
	int a = 300;
	
	//Integer it = new Integer(a); // Boxing
	
	Integer it = a; // AutoBoxing
	
	// int b = it.intValue(); // Unboxing
	
	int b = it; // AutoUnboxing
	
	Object obj = it;
	list.add(obj);
	
	System.out.println(it.intValue());
	System.out.println(it.MAX_VALUE);
	
	// 2���� ���
	System.out.println(Integer.toBinaryString(a));
	
	String s = "01011112222";
	
	int v = Integer.parseInt(s); // AutoBoxing. ���ڸ� ���ڷ� ��ȯ 
	
	System.out.println(v);
	System.out.println(v+1);
	
	System.out.println("--------------------------");
	
	list.add(a);
	list.add(a);
	
	System.out.println(list); 
	}
}
