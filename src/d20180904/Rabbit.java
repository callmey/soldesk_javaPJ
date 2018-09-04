package d20180904;

public class Rabbit {
	String eye;
	String hair;
	int ear;
	int leg;
	
	// »ı¼ºÀÚ
	Rabbit(){
		eye = "red";
		hair = "white";
		ear = 2;
		leg = 4;
		
	}
	
	void Á¡ÇÁÇÏ±â() {
		System.out.println("±øÃÑ±øÃÑ");
	}
	
	void ¸Ô±â() {
		System.out.println("¾ÆÀÛ¾ÆÀÛ");
	}
	
	public static void main(String[] args) {
		Rabbit rb = new Rabbit();
		rb.¸Ô±â();
		System.out.println(rb.ear);
	}
}
