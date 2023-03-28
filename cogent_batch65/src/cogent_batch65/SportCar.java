package cogent_batch65;

public class SportCar extends Car{
	
	String color;
	
	public void AirBalloonType() {
		System.out.println("AirBalloonType");
		System.out.println("The speed is: "+speed);
		System.out.println("The number of gears is: "+noOfGear);
	}
	
	public void display() {
		System.out.println("SportCar Display");
		System.out.println("The speed is: "+speed);
		System.out.println("The number of gears is: "+noOfGear);
		System.out.println("The color is: "+color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
