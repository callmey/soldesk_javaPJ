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
		
		int min; 
		
		for(int i = 0; i < data.length-1; i++) {
			if(data[i] < data[i+1]) {
				min = data[i];
			}
			
					
			/*
				    int indexMin, temp; //�ּڰ� 
	
				    for (int i = 0; i < list.length - 1; i++) {
				        indexMin = i; // �ּҰ��� 0.
				        for (int j = i + 1; j < list.length; j++) { // index 1 <= j< 10 �ݺ�
				            if (list[j] < list[indexMin]) { // ���ڸ� �ϳ��� ��� ���� �ڸ� ���ڰ� �� ���ڸ����� ������
				                indexMin = j; // �ּڰ� ������ j(�� ���ڸ� ������ ���� ��)
				            }
				        }
				        temp = list[indexMin];
				        list[indexMin] = list[i];
				        list[i] = temp;
				    }
			*/
			
			System.out.print(data[i+1] + " ");
		}
	
	}
	
	

}
