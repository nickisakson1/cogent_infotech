package esg.itp.shape;

public class Square implements Polygon{
	
	private float side;
	private float area;
	private float perimeter;
	
	Square(float s) {
		this.side = s;
	}
	
	public void calcPeri() {
		this.perimeter = 4*this.side;
	}
	
	public void calcArea() {
		this.area = this.side*this.side;
	}
	
	public void display() {
		System.out.println("The square's perimeter is: "+this.perimeter);
		System.out.println("The square's area is: "+this.area);
	}
}
