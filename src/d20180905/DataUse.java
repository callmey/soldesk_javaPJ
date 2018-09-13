package d20180905;

public class DataUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		//data.name= "È«±æµ¿";
		//The field Data.name is not visible
		
		data.setName("È«±æµ¿");
		String name = data.getName();
		System.out.println(name);
		
		//¿¬ºÀÀº 70000000
		data.setAnnual(70000000);
		int annual = data.getAnnual();
		System.out.println(annual);
		
	}

}
