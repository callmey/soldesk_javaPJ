package d20180910;

public class ·¹ÀÌÀúÃÑ implements Weapon{
	int energy;
	
	·¹ÀÌÀúÃÑ() {
		this.energy = 200;
	}
	
	public void ÃæÀü() {
		this.energy =200;
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("ÁöÁöÁ÷");
		energy -= 20;
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("¶Òµü ¶Òµü");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("¸ÚÁ®Áü");
	}
	
}
