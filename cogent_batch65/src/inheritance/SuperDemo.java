package inheritance;

class Shape {
	
	final int length = 50;
	final int width = 20;
	
}

class A {
	
	int a;
	
	public A(int a) {
		this.a=a;
	}
}

class B extends A{
	
	int b;
	
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public void show() {
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
	}
}

class Dad {
	
	int dAge = 50;
	
	public final void display() {
		System.out.println("Parent age is: "+dAge);
	}
}

class child extends Dad {
	
	int cAge = 25;
	
	public void show() {
		super.display();
		System.out.println("Child age is: "+cAge);
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		child ch = new child();
		ch.display();
		
		B b = new B(10,20);
		b.show();
	}
}
