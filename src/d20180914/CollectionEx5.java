package d20180914;

import java.util.ArrayList;

public class CollectionEx5 {
	public static void main(String[] args) {
		
		String[] str = {"����", "��", "���� �ິ","�Ķ� �ິ","�κ�","����", "����"};
		
		// �� �����͸� ArrayList�� ��� �Ѱ��� ������ ���
		// �� ArrayList�� String �� ��Ƽ� ������ ����
		// JCF ���� <String> ���� -> generic : (�������)
		
		// ������ ���� ������ �̸� ã�� �� ����
		ArrayList<String> al = new ArrayList<String>();
		/*al.add(str[0]);
		al.add(str[1]);*/
		
		for(int i =0; i<str.length; i++) {
			al.add(str[i]);
		}
		
		/*int a = 100;
		al.add(a);*/
		
		System.out.println("al : " + al);
		
		System.out.println("------------------");
		// ù���ڸ� ���
		int size = al.size();
		
 	}
}
