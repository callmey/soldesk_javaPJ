package d20180914;

import java.util.Vector;

public class CollectionEx1 {
	public static void main(String[] args) {
		// Vector : 동적 성장형 Object 배열
		Vector v = new Vector();
		System.out.println(v.capacity()); // 배열 기본 10칸
		System.out.println(v.size());
		
		String s1 = "Java";
		Object obj = s1; 
		
		v.add(obj); // Object를 받을 수 있기 때문에 어떤 걸 넣어도 상관없음.
		
		v.add("오늘은"); 
		v.add("금요일");
		v.add("배");
		v.add("딸기");
		v.add("복숭아");
		v.add("오렌지");
		v.add("바나나");
		v.add("체리");
		v.add("밤");
		v.add("사과");
		
		System.out.println(v.capacity());
		System.out.println(v.size()); // 기본 10칸을 초과하면 자동으로 용량을 늘려줌.
		
		int[] i = new int[2];
		i[0] =10;
		i[1] = 20;
		System.out.println(i);
		
		System.out.println("v : " + v);
		for(int j =0; j<v.size(); j ++) {
			System.out.println(v.get(j));
			
			// 데이터 첫글자만 추출해서 출력해보세요
			
			Object obj2 = v.get(j);
			String str = (String)obj2;
			
			System.out.println("첫글자 : " + str.substring(0,1));
			
			// 딸기는 몇번째 위치에 있나요?
			System.out.println("위치1 : " + str.indexOf("딸기"));
			
			// 딸기가 있나요?
			if(v.contains("딸기")) {
				// 딸기가 있어요...
				for(int k =0; k<v.size(); k++) {
					String str1 = (String)v.get(k);
					if(str1.equals("딸기")) {
						System.out.println("위치2 :"  + k);
					}// 내부 if end
				}
			}else {
				System.out.println("딸기가 없어요");
			}
			
			System.out.println("--------------");
			
			Object[] obj3 = {"우유", "콩", "두부","빨간 약병","파란 약병","딸기", "포도", "홍시"};
			
			// 딸기가 몇번째 위치에 있나요?
			
			for(int x=0; x< obj3.length; x++) {
				String s = (String) obj3[x]; // 강제 형 변환해야함.
				
				if(s.equals("딸기")) {
					System.out.println(x);
				}
			}
			
			
		}
	
	}
}
