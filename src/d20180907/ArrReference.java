package d20180907;

import d20180906.��;
import d20180906.�ٶ���;
import d20180906.�䳢;
import d20180906.������;

public class ArrReference {
	public static void main(String[] args) {
		
		�䳢 r = new �䳢();
		�� w = new ��();
		�ٶ��� s = new �ٶ���();
		
		// �迭
		//int[] m = new int[3];
		
		//int[] m = {,,};
		
		/*������[] moList = new ������[3];
		moList[0] = r;
		moList[1] = w;
		moList[2] = s;*/
		
		������[] moList = {new �䳢(), new �ٶ���(), new ��()}; 
		//reference�迭�� ����� ���ÿ� �ʱ�ȭ�� �� �Ҵ��ص� ��
		
		for(int i =0; i<moList.length; i++) {
			moList[i].�Ա�();
			moList[i].�ڱ�();
		}
		
		System.out.println("-----------------------------");
		
		// �������� ���� Ȯ���ϰ� ���� ��
		// �������� r�� �䳢 Ŭ������ ���������Դϱ�? t/f
		System.out.println(r instanceof �䳢);
		
		
	}
}
