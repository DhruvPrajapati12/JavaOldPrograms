package inheritance;

public class Teacher extends Person{
	public Teacher(String name) {
		super(name);
		System.out.println("inside teacher constructor");
	}
	public void teach() {
		System.out.println(name + " is teaching");
	}

	public void eat() {
		super.eat();
		System.out.println("Teacher" + name + " is eating");
	}
	
	public static void laugh() {
		System.out.println("Teacher is laughing");
	}
}
