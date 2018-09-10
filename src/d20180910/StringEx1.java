package d20180910;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("java");
		String str2 = new String("java");
		// 아주 예외적으로 String 클래스만 new를 생략하여
		// primitive type처럼 쓰도록 허용

		/*String str3 = new String("java");
		
		String str4 = "java";*/
		
		
		System.out.println("str1 : " + str1);
		
		System.out.println("-------------------------------");
		
		// hashcode : 해당 객체의 고유한 값을 return
		// 일반적으로 객체 내부 주소를 정수값으로 변환 - 16진수
		System.out.println("str1 : " + 
				str1.getClass().getName()+'@'+
				Integer.toHexString(str1.hashCode())
				);
		
		System.out.println("str1.toString() : " + str1.toString());
		System.out.println("---------------------------------");
		
		// str1 - str2 관계?
		if(str1 == str2) { // 주소 비교
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}
		
		System.out.println("---------------------------------");
		
		if(str1.equals(str2) ) {  //내용 비교
			System.out.println("내용 동일");
			System.out.println("str1 : " + 
				str1.getClass().getName()+'@'+
				Integer.toHexString(str1.hashCode()));
			System.out.println("str2 : " + 
				str2.getClass().getName()+'@'+
				Integer.toHexString(str2.hashCode()));
		}else {
			System.out.println("내용 다름");
			System.out.println(str1);
			System.out.println(str2);
		}
		
		/*
		 * 
		 * 
		 * 						Object				String
		 * 	toString			 참조값				자기 자신의 문자열
		 *  equals()			 주소동일여부			내용동일여부
		 */
		
		
		System.out.println("-------------------------------");
		// 내용이 같으면 같은 주소를 쓰자(성능 개선을 위해)
		String str3 = "java";
		String str4 = "java";
		
		if(str3==str4) System.out.println("같다"); // == 은 주소가 같은지 묻는 것
	}

}
