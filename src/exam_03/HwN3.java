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
		
		System.out.println("국어,영어,수학,총점,평균");
		
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
			} // 내부 for문
		
			System.out.println();
			
		} // 외부 for문 
		
		System.out.println("-----------------------------");
		System.out.println();
		
		
		// 선택정렬
		// 주어진 리스트 중에 최솟값을 찾는다.
		// 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
		// 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다. 
		
	
		int[] data  = { 100,20,5,2,3,34,65,23,66,200};
		
		int min; 
		
		for(int i = 0; i < data.length-1; i++) {
			if(data[i] < data[i+1]) {
				min = data[i];
			}
			
					
			/*
				    int indexMin, temp; //최솟값 
	
				    for (int i = 0; i < list.length - 1; i++) {
				        indexMin = i; // 최소값은 0.
				        for (int j = i + 1; j < list.length; j++) { // index 1 <= j< 10 반복
				            if (list[j] < list[indexMin]) { // 앞자리 하나를 비운 다음 자리 숫자가 맨 앞자리보다 작으면
				                indexMin = j; // 최솟값 변수는 j(맨 앞자리 수보다 작은 것)
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
