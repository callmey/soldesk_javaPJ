package d20180906;
/*
 * 
 * 
 * 
 * ����̿� �������� ����Ư���� �����Ͽ� �����̶�� Ŭ������ �����
 * ����̿� ���������� ����ϱ�� �ߴ�
 * 
 * ��� ---------------
 * (����� �̸�)�� ����⸦ �Դ´�. ��ݻ�� �ȴ´�. (�̸�)�� �ִ�. ȣ���Ѵ�.
 * (������ �̸�)�� ��Ḧ �Դ´�. �͹��͹� �ȴ´�. (�̸�)�� �ִ�. ȣ���Ѵ�.
 * 
 * ���� : name, food
 * �Լ� : eat(), walking(), breath()
 * 
 * 
 * 
 * 
 * 

 */
public class ExtendsMain3 {
	 public static void main(String[] args) {
		 Cat cat = new Cat("�Ŀ���", "�����");
		 cat.eat();
		 cat.walking(" ��ݻ��");
		 cat.breath();
		 
		 Dog dog = new Dog("�۸���", "���");
		 dog.eat();
		 dog.walking(" �͹��͹�");
		 dog.breath();
		 
		 
	}
	
	
	
	
	
	
	
	

	

}
