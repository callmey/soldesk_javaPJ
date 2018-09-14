package d20180914;

import java.util.HashSet;
import java.util.Iterator;

// set - HashSet
//: 순서 X, 중복 X ex) HashSet, TreeSet...

public class CollectionEx3 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("파전");
		hs.add("오징어불고기");
		hs.add("부대찌개");
		hs.add("부대찌개");
		hs.add("부대찌개");
		hs.add("부대찌개");
		hs.add("부대찌개");
		hs.add("부대찌개");
		hs.add("간장게장 정식");
		hs.add("순대국");
		hs.add("커피");
		
		// ArrayList처럼 용량이 늘어나면 한 칸 씩 늘어남
		// 중복값을 제거하려고 할 때 유용
		System.out.println("hs : " + hs );
		
		/*for(int i =0; i<hs.size(); i++) {
			System.out.println(hs.get); // 순서대로 대입하지 않으므로 get() 지원 X
		}*/
		
		// 반복자
		Iterator it = hs.iterator();
		// 다음값이 존재하면 true, 아니면 false
		while(it.hasNext()) { // true면 값을 가져옴
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
