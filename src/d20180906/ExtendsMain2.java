package d20180906;

public class ExtendsMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man = new Man("hong");
		man.tellName();
		
		System.out.println("------------------------");
		BusinessMan bm = new BusinessMan("lee", "SanGun", "General");
		bm.tellInfo();
		
	}

}
