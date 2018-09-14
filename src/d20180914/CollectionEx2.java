package d20180914;

import java.util.ArrayList;

// Vector : 동기적 성장형 Object 배열
// ArrayList : 비동기적 성장형 Object 배열(더 최신, 더 많이 사용)

public class CollectionEx2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // 중복 허용
		
		al.add("딸기");
		al.add("우유");
		al.add("딸기"); 
		al.add("바나나");
		al.add(10);
		
		System.out.println(al.get(2));
		System.out.println(al.indexOf("우유"));
		
		
	}
}
