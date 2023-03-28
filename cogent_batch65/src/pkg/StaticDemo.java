package pkg;

class Student {
	
	private static int age;
	
	static {
		age = 20;
	}
	
	Student() {
		
	}
	
	Student(int age) {
		this.age = age;
	}
	
	public static void setAge(int a) {
		age = a;
	}
	
	public static int getAge() {
		return age;
	}
}
public class StaticDemo {

	private static int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public static void main(String[] args) {
		
		StaticDemo sd = new StaticDemo();
		sd.setAge(5);
		StaticDemo sd2 = new StaticDemo();

		System.out.println(StaticDemo.age);
		System.out.println(sd2.getAge());
		
		Student st = new Student();
//		st.setAge(20);
		System.out.println(st.getAge());
		System.out.println(Student.getAge());
	}
}
