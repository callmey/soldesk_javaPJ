package d20180904;
/*
 * 
 * ������ ���� ������ ������ ����
 * ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ� ����
 * ���� �ѷ��� ����ؼ� ��ȯ�ϴ� �޼ҵ� ����
 * �����Լ����� �� ����� ����غ�����
 * 
 * ���� ���� : x*x*3.14
 * ���� �ѷ� : x*2*3.14
 * 
 */
public class MethodEx5 {
	double circum(double radius) {
		return radius*2*3.14;
	}
	
	
	double area(double radius) {
		return radius*radius*3.14;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx5 me5 = new MethodEx5();
		System.out.println("���� �ѷ� : " + me5.circum(84));
		System.out.println("���� ���� : " + me5.area(840));
	}

}
