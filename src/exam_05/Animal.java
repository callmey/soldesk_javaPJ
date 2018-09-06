package exam_05;

public class Animal {
	private String name;
	private int age;
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println(name + "님은 " + age + "살 입니다");
	}
	
	
}
