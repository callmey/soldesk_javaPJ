package d20180905;
import d20180905.Human;
public class Society {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.�Ա�();
//		System.out.println(" h1 : " + h1);
		System.out.println(h1.�̸�);
		System.out.println(h1.����);
		
		System.out.println("------------------------------");
		
		/*Human h2 = new Human();
//		System.out.println(" h2 : " + h2);
		h2.�Ա�();
		
		h2.�̸� = "������";
		h2.���� = "����";  
		
		System.out.println(h2.�̸�);*/
		
		Human h2 = new Human("������");
		System.out.println("h2 �̸� : " + h2.�̸�);
		System.out.println("h2 ���� : " + h2.����);
		
		System.out.println("------------------------------");
		
		Human h3 = new Human("������", "����");
		System.out.println("h3 �̸� : " + h3.�̸�);
		System.out.println("h3 ���� : " + h3.����);
		
		System.out.println("------------------------------");
		
		Human h4 = new Human("ȫ�浿", "����", 180.5); 
		System.out.println("h4 �̸� : " + h4.�̸�);
		System.out.println("h4 IQ : " + h4.iq);
		
		System.out.println("------------------------------");
		
		Human h5 = new Human("�Ż��Ӵ�", "����", 160.1, 60, 40); 		
		System.out.println("h5 �̸� : " + h5.�̸�);
		System.out.println("h5 �� : " + h5.��);
		System.out.println("h5 Ű : " + h5.Ű);
		System.out.println("h5 ������ :" + h5.������);
		System.out.println("h5 ���� :" + h5.����);
		
	
	}
}
