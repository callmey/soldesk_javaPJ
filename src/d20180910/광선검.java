package d20180910;
// 
public class 광선검 implements Weapon{
	int 내구도;
	String 레이저색;
		
	광선검() {
		내구도 = 100;
		레이저색 = "orange";
	}
	
	광선검(String color) {
		this.레이저색 = color;
	}

	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("주왕");
		내구도 -= 5;
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("뚝딱 뚝딱");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("공격력+50");
		System.out.println("레이저 색이 변경됨");
	}
	
}
