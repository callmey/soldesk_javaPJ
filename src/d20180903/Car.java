package d20180903;
/*
 * 
 * OOP(Object Oriented Programming) = ��ü ���� ���α׷�
 * : �繰, ����� ���� Ư��, ������ �� �ൿ���� �״��
 * ��üȭ�ϰ��� �ϴ� ������ ���� ���α׷�
 * 
 * 
 */

//Ŭ����
//: �ϳ��� Ŭ������ �޸� �Ҵ� �� �پ��� ���� ������ �Ǹ� ��ü��� �θ��ϴ�
//: �ϳ��� ��ü�� ���������� ���˴ϴ�
public class Car {
		// TODO Auto-generated method stub
		//1.member ����
		String manf = "����";
		String engine = "8����";
		String name = "����";
		String wheel = "15��ġ";
		
		//2. ������
		Car(){
	
		}
		
		//3.member method
		void go() {
			System.out.println("�� ������...");
		}
		
		void stop() {
			System.out.println("�� �� ����");
		}
		
		void back() {
			System.out.println("�ĸ� ī�޶�");
		}
		
		
		public static void main(String[] args) {
			Car c = new Car(); //�޸� �ø� => �ν��Ͻ�ȭ
			
			String carManf = c.manf;
			
			System.out.println("������:" + carManf);
			
			
	}
}
