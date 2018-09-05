package d20180905;

public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Parent p = new Parent();
		 Child c = new Child();
		 
		 System.out.println("p.a: " + p.a);
		 p.method();
		 
		 System.out.println("----------------------------");
		 System.out.println("c.a: " + c.a);
		 c.method();
		 
		 System.out.println("----------------------------");
		 System.out.println("c.b: " + c.b);
		 c.c_method();
		 
		 
	}

}
