package d20180907;

public class InterfaceMain {
	public static void main(String[] args) {
		
		말 h1 = new 말();
		h1.먹기();
		h1.비행();
		
		System.out.println("------------------------");
		// 마린 하나 생성해서 이동(100, 200) 이동 시킨 후
		// 비행시켜 보세요
		
		Marine m = new Marine();
		m.이동하기(100, 200);
		m.비행();
		
		System.out.println("------------------------");
		// 인터페이스를 통해 배열 사용가능
		
		Flyable[] fList = new Flyable[2];
		
		Flyable f = h1; // 말은 flyable을 상속받고 있으므로  Flyable >(포함) h1  => 할당 가능
		fList[0] = f;
		System.out.println(f);
		System.out.println("d20180907.말@7852e922");
		f = m;
		fList[1] = f;
		System.out.println(f);
		System.out.println("d20180907.Marine@4e25154f");
		
		for(int i=0; i<fList.length; i++) {
			fList[i].비행();
		}
		
		
	
	}
}
