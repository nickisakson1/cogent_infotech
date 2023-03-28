package inheritance;

class Calculator {
	
	public void add(int a, int b) {
		int res = a+b;
		System.out.println("Sum of 2 ints is: "+res);
	}
	
	public void add(float a, float b) {
		float res = a+b;
		System.out.println("Sum of 2 floats is: "+res);
	}
	
	public void add(String a, String b) {
		String res = a+b;
		System.out.println("Sum of 2 Strings is: "+res);
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		c.add(1,2);
		c.add(1.15f,2.25f);
		c.add("He", "llo");
	}
}
