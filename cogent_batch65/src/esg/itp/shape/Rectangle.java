package esg.itp.shape;

public class Rectangle implements Polygon{
	
	private float length;
	private float breadth;
	private float area;
	private float perimeter;
	
	Rectangle(float l, float b) {
		this.length = l;
		this.breadth = b;
	}
	
	public void calcPeri() {
		this.perimeter = 2*this.length+2*this.breadth;
	}
	
	public void calcArea() {
		this.area = this.length*this.breadth;
	}
	
	public void display() {
		System.out.println("The rectangle's perimeter is: "+this.perimeter);
		System.out.println("The rectangle's area is: "+this.area);
	}

}
