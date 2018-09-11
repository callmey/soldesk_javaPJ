package exam_07;

public class Object {
	public static void main(String[] args) {
		Object obj1= new Object();
		Object obj2= new Object();
		System.out.println(obj1.equals(obj2)); // 林家悼老咯何
		System.out.println(obj1.getClass());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.toString());
		System.out.println(obj2.getClass());
		System.out.println(obj2.hashCode());
		System.out.println(obj2.toString());
	}
}
