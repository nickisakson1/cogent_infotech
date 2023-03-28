package cogent_batch65;

public class CarMain {
	
	public static void main(String[] args) {
		
		
		Car c =  new Car();
		c.drive(5, 10);
		c.display();

		SportCar sc = new SportCar();
		sc.drive(15, 20);
		sc.setColor("Red");
		sc.AirBalloonType();
		sc.display();
	}

}
