package d20180910;

/*
 * 
 * 
 * �ڹٿ��� ������ ������ �͵�
 * 1. import java.lang.*
 * 2. �⺻������
 * 3. extends Object
 * 4. this <- Ȯ���� ���еǸ� ���� ����
 * 5. super()
 * 
 */
//Object : �ڹ� �ְ� Ŭ����

public class ObjectBasic extends Object {
	
	// ��𿡼��� - new ���� �ʰ� - ���ϰ��� �ʿ� X
	// - main �̸��� ���� - �Ű������� String �迭�� ���� - �̸��� args
	public static void main(String[] args) {
		//System.out.println();
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 " + obj2);
		
		// obj1 == obj ����? 
		if(obj1==obj2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
		
		System.out.println("-------------------");
		if(obj1.equals(obj2)) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
		
		System.out.println("-------------------");
		System.out.println("obj1 : " + obj1);
		System.out.println("obj1.toString() : " + obj1.toString());
		//toString() : ������Ʈ ���� ���ڿ��� ǥ��
	}
}
