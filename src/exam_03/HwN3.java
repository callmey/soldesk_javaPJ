package exam_03;

public class HwN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] score = {
			     {80,80,80,0,0}, // 0 1 2 3 4
			     {60,50,80,0,0}, 
			     {50,90,90,0,0}, 
			     {40,50,60,0,0},
			     {90,90,95,0,0},
			     {85,95,100,0,0},//5
			};
		
		System.out.println("����,����,����,����,���");
		
		int sum = 0;
		for(int i=0; i< 6; i++) {
			for(int j =0; j <5; j++) {
				sum += score[i][j];
				if(j == 3) {
					score[i][j] = sum;
				}
				else if(j == 4) {
					score[i][j] = sum/3;
				}
				System.out.print(score[i][j] + " ");
			} // ���� for��
		
			System.out.println();
			
		} // �ܺ� for�� 
		
		System.out.println("-----------------------------");
		System.out.println();
		
		
		// ��������
		// �־��� ����Ʈ �߿� �ּڰ��� ã�´�.
		// �� ���� �� �տ� ��ġ�� ���� ��ü�Ѵ�(�н�(pass)).
		// �� ó�� ��ġ�� �� ������ ����Ʈ�� ���� ������� ��ü�Ѵ�. 
		
	
		int[] data  = { 100,20,5,2,3,34,65,23,66,200};
		
		int min, temp; 
		
		for(int i = 0; i < data.length-1; i++) {
			min = i;
			for(int j = i + 1; j< data.length; j++) {
				if(data[j] < data[min]) {
					min = j;
					System.out.print(min + " ");
					System.out.print(data[j] + " ");
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
			//System.out.print(data[i] + " ");
		}
		
	}

}
