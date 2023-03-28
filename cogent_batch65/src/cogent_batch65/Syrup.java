package cogent_batch65;

public class Syrup extends Medicine{
	
	String color;
	
	public Syrup(String name, String address, String color) {
		super(name, address);
		this.color = color;
	}
	
	public void displayLabel() {
		System.out.println("Syrup Name: "+this.name);
		System.out.println("Syrup Address: "+this.address);
		System.out.println("Syrup Color: "+this.color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
