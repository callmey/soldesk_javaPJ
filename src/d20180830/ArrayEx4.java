package d20180830;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 생성 - char형 배열 9칸짜리 변수 ch
		// JavaWorld라는 글자를 대입한 후 화면에 출력해보세요
		
		char[] ch = {'J','a','v','a','W','o','r','l','d'}; //char 형은 작은따옴표 주의!
		
		for(int i =0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
		String str = "JavaWorld";
		System.out.println(str);
		
	}

}
