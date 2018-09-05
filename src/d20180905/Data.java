package d20180905;
//캡슐화 - CRUD 작업의 기본 (Create Read Update Delete) => 따라서 객체로 만듬.

public class Data {
	// 멤버 변수 - private
	private String name = "";
	private int annual = 0;
	
	//setter : 멤버 변수에 값을 지정
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAnnual(int annual) {
		this.annual = annual;
	}	
	
	// getter : 멤버 변수의 값을 가져오는 메소드
	public String getName() {
		return "* " + this.name + " *";
	}
	
	public int getAnnual() {
		return this.annual + (int)(this.annual*0.05);
	}
	

}
