package d20181004;

public class MathEx {
	public static void main(String[] args) {
		System.out.println("������ : "+Math.PI);
		System.out.println("4�� ������ : "+Math.sqrt(4));
		
		System.out.println("������ ���ʺй� : "+Math.toDegrees(Math.PI));
		
		//���α׷��ֿ����� ������ ���� ��
		double radian = Math.toRadians(45);
		
		System.out.println("���� 45 : "+Math.sin(radian));
		System.out.println("�ڽ��� 45 : "+Math.cos(radian));
		System.out.println("ź��Ʈ 45 : "+Math.tan(radian));
		
		//�α�, �� 
		System.out.println("�α� 90 : "+Math.log(90));
		System.out.println("2�� �� : " + Math.pow(2, 4));
	}
}
