package d20180914;

import java.util.Vector;

public class CollectionEx1 {
	public static void main(String[] args) {
		// Vector : ���� ������ Object �迭
		Vector v = new Vector();
		System.out.println(v.capacity()); // �迭 �⺻ 10ĭ
		System.out.println(v.size());
		
		String s1 = "Java";
		Object obj = s1; 
		
		v.add(obj); // Object�� ���� �� �ֱ� ������ � �� �־ �������.
		
		v.add("������"); 
		v.add("�ݿ���");
		v.add("��");
		v.add("����");
		v.add("������");
		v.add("������");
		v.add("�ٳ���");
		v.add("ü��");
		v.add("��");
		v.add("���");
		
		System.out.println(v.capacity());
		System.out.println(v.size()); // �⺻ 10ĭ�� �ʰ��ϸ� �ڵ����� �뷮�� �÷���.
		
		int[] i = new int[2];
		i[0] =10;
		i[1] = 20;
		System.out.println(i);
		
		System.out.println("v : " + v);
		for(int j =0; j<v.size(); j ++) {
			System.out.println(v.get(j));
			
			// ������ ù���ڸ� �����ؼ� ����غ�����
			
			Object obj2 = v.get(j);
			String str = (String)obj2;
			
			System.out.println("ù���� : " + str.substring(0,1));
			
			// ����� ���° ��ġ�� �ֳ���?
			System.out.println("��ġ1 : " + str.indexOf("����"));
			
			// ���Ⱑ �ֳ���?
			if(v.contains("����")) {
				// ���Ⱑ �־��...
				for(int k =0; k<v.size(); k++) {
					String str1 = (String)v.get(k);
					if(str1.equals("����")) {
						System.out.println("��ġ2 :"  + k);
					}// ���� if end
				}
			}else {
				System.out.println("���Ⱑ �����");
			}
			
			System.out.println("--------------");
			
			Object[] obj3 = {"����", "��", "�κ�","���� �ິ","�Ķ� �ິ","����", "����", "ȫ��"};
			
			// ���Ⱑ ���° ��ġ�� �ֳ���?
			
			for(int x=0; x< obj3.length; x++) {
				String s = (String) obj3[x]; // ���� �� ��ȯ�ؾ���.
				
				if(s.equals("����")) {
					System.out.println(x);
				}
			}
			
			
		}
	
	}
}
