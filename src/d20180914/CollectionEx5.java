package d20180914;

import java.util.ArrayList;

public class CollectionEx5 {
	public static void main(String[] args) {
		
		String[] str = {"우유", "콩", "빨간 약병","파란 약병","두부","딸기", "포도"};
		
		// 위 데이터를 ArrayList에 담고 한개씩 꺼내서 출력
		// 이 ArrayList에 String 만 담아서 쓰도록 하자
		// JCF 끝에 <String> 붙임 -> generic : (권장사항)
		
		// 컴파일 전에 에러를 미리 찾을 수 있음
		ArrayList<String> al = new ArrayList<String>();
		/*al.add(str[0]);
		al.add(str[1]);*/
		
		for(int i =0; i<str.length; i++) {
			al.add(str[i]);
		}
		
		/*int a = 100;
		al.add(a);*/
		
		System.out.println("al : " + al);
		
		System.out.println("------------------");
		// 첫글자만 출력
		int size = al.size();
		
 	}
}
