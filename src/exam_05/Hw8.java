package exam_05;

public class Hw8 {
	public static void main(String[] args) {
		Animal a1 = new Animal("������", 26);
		a1.setName("���ڿ�����");
		a1.show();
	}
}

class Animal {
	String name;
	int age;

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
		System.out.println(name + "���� " + age + "�� �Դϴ�");
	}

}