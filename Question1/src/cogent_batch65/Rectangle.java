package cogent_batch65;

public class Rectangle {
	
	int length;
	int breadth;
	int area;
	
	Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}
	
	Rectangle(int l, int b) {
		this.length = l;
		this.breadth = b;
	}
	
	public void calcArea() {
		this.area = this.length*this.breadth;
	}
	
	public void display() {
		System.out.println("The Rectangle's length is: "+this.length);
		System.out.println("The Rectangle's breadth is: "+this.breadth);
		System.out.println("The Rectangle's area is: "+this.area);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

}
