package d20180910;

public class Gun implements Weapon{

	int ÃÑ¾Ë;
	
	Gun() {
		this.ÃÑ¾Ë = 6;
	}
	
	Gun(int ÃÑ¾Ë) {
		this.ÃÑ¾Ë = ÃÑ¾Ë;
	}
	
	public void ÀçÀåÀü() {
		ÃÑ¾Ë = 6;
	}
	
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("»§!");
		ÃÑ¾Ë --;
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("¶Òµü ¶Òµü");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("¹İµ¿ÀÌ ¾ø¾îÁü");
	}
	
}
