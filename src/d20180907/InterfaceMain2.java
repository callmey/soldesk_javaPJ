package d20180907;

public class InterfaceMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass ifc = new InterfaceClass();
		ifc.calculate();
		ifc.getStr();
		System.out.println(ifc.STR);
		
		System.out.println("------------------------------");
		// 인터페이스도 간접적인 상속 : has - a 관계  <-> 직접적인 상속관계 : is - a 관계 
		// 간접상속이므로 부모-자식 관계처럼 성립
		
		InterfaceEx1 ife1 = new InterfaceClass(); // InterfaceEx1 > InterfaceClass
		
		//InterfaceEx1 ife0 = new InterfaceEx1(); // 인터페이스도 new 사용불가
		
		ife1.calculate();
		
		InterfaceEx2 ife2 = new InterfaceClass();
		ife2.getStr();
	}

}
