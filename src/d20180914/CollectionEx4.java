package d20180914;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Map - HashMap
// 순서 X, value 만 중복 가능. Key는 유일해야함.

public class CollectionEx4 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("실", "바늘");
		hm.put("짬뽕", 8000);
		hm.put("햄버거", "콜라");
		hm.put("햄버거", "사이다");
		hm.put("낙지볶음", 12000);
		
		System.out.println("hm : " + hm);
		System.out.println(hm.get("짬뽕"));
		
		if(hm.containsKey("실")) {
			System.out.println("존재함");
		}
		
		if(hm.containsKey("사이다")) {
			System.out.println("존재함");
		}
		
		System.out.println("------------------------");
		
		// 현재 key의 첫글자만 콘솔에 출력해보세요
			Set s = hm.keySet(); 
			
			Iterator it = s.iterator();
			
			while(it.hasNext()) { // true면 값을 가져오는 것을 반복
				Object obj = it.next();
				String str = (String)obj;
				System.out.println(str.substring(0,1));
			}
	}
}
