package d20180914;

import java.util.HashSet;
import java.util.Iterator;

// set - HashSet
//: ���� X, �ߺ� X ex) HashSet, TreeSet...

public class CollectionEx3 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("����");
		hs.add("��¡��Ұ��");
		hs.add("�δ��");
		hs.add("�δ��");
		hs.add("�δ��");
		hs.add("�δ��");
		hs.add("�δ��");
		hs.add("�δ��");
		hs.add("������� ����");
		hs.add("���뱹");
		hs.add("Ŀ��");
		
		// ArrayListó�� �뷮�� �þ�� �� ĭ �� �þ
		// �ߺ����� �����Ϸ��� �� �� ����
		System.out.println("hs : " + hs );
		
		/*for(int i =0; i<hs.size(); i++) {
			System.out.println(hs.get); // ������� �������� �����Ƿ� get() ���� X
		}*/
		
		// �ݺ���
		Iterator it = hs.iterator();
		// �������� �����ϸ� true, �ƴϸ� false
		while(it.hasNext()) { // true�� ���� ������
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
