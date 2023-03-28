package cogent_batch65;

public class Car {

	int speed;
	int noOfGear;
	
	public void drive(int a, int b) {
		speed = a;
		noOfGear = b;
	}
	
	public void display() {
		System.out.println("Car Display");
		System.out.println("The speed is: "+speed);
		System.out.println("The number of gears is: "+noOfGear);
	}
}
