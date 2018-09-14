package d20180914;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Map - HashMap
// ���� X, value �� �ߺ� ����. Key�� �����ؾ���.

public class CollectionEx4 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("��", "�ٴ�");
		hm.put("«��", 8000);
		hm.put("�ܹ���", "�ݶ�");
		hm.put("�ܹ���", "���̴�");
		hm.put("��������", 12000);
		
		System.out.println("hm : " + hm);
		System.out.println(hm.get("«��"));
		
		if(hm.containsKey("��")) {
			System.out.println("������");
		}
		
		if(hm.containsKey("���̴�")) {
			System.out.println("������");
		}
		
		System.out.println("------------------------");
		
		// ���� key�� ù���ڸ� �ֿܼ� ����غ�����
			Set s = hm.keySet(); 
			
			Iterator it = s.iterator();
			
			while(it.hasNext()) { // true�� ���� �������� ���� �ݺ�
				Object obj = it.next();
				String str = (String)obj;
				System.out.println(str.substring(0,1));
			}
	}
}
