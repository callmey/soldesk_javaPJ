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
		int[] data1  = { 100,20,5,2,3,34,65,23,66,200};
		int[] data2  = { 100,20,5,2,3,34,65,23,66,200};
		
		
		int min, temp; 
		
		for(int i = 0; i < data.length-1; i++) {
			min = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[j] < data[min]) { // 앞자리 하나를 비운 다음 자리 숫자가 맨 앞자리보다 작으면
					min = j; // 최솟값 변수는 그 자리로 다시 세팅 (결국 가장 작은 값을 차례로 찾은 다음에 맨 앞자리와 나중에 비교함.)
				}
			}
			
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
			
		}
		System.out.println("선택 정렬 후 : ");
		for(int i = 0; i<data.length; i++) {

			System.out.print(data[i] + " ");
			
		}
		
		System.out.println();
			
		
			 /* 
				     버블 정렬(Bubble Sort)은 인접한 두개의 원소를 비교하여 자리를 교환하는 방식으로 정렬
				     첫번째 원소부터 인접한 원소끼리 계속 자리를 교환하면서 맨 마지막자리로 이동하는 모습이
				     물속에서 물 위로 올라오는 물방울 모양과 같다고 해서 버블 정렬이라고 한다.
		     */
		
		
		for(int i = data1.length-1; i > 0 ; i--) {
			for(int j = 0; j < i; j++) {
				if(data1[j] > data1[j+1]) {
					temp = data1[j];
					data1[j] = data1[j+1];
					data1[j+1] = temp;
				}
				//System.out.print(data[j] + " ");
			}
			
		}
		
		System.out.println();
		
		System.out.println("버블 정렬 후 : ");
		for(int i = 0; i<data1.length; i++) {

			System.out.print(data1[i] + " ");
			
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("삽인 정렬 후 : ");
		
		int j = 0;
        for(int i=1; i<data2.length; i++){
            temp = data2[i]; // 삽입대상 임시 저장.
            j = i; //index 임시저장
            while(j > 0 && temp < data2[j-1]){ //삽입대상이 정렬된 대상들보다 작은 경우가 있는 경우 
                data2[j] = data2[j-1]; //밀기
                j--; //다음 비교를 위해 인덱스 이동
            }
            data2[j] = temp; //최종으로 삽입될 위치에 삽입대상 삽입 
             
        }
        
        for(int i = 0; i<data2.length; i++) {
			System.out.print(data2[i] + " ");
			
		}
		
    }
	
}
