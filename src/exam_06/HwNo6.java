package exam_06;


public class HwNo6{
	
	public static void main(String[] args){
        // 3 일때 3개 출력 , 5일때는 5개 출력
        Lotto lt = new Lotto(5);
        lt.select();
        lt.print();
    }   
}