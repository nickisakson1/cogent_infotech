package cogent.infotech;

public class ACMEBicycle implements Bicycle{
	
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	public void changeCadence(int newValue) {
		this.cadence = newValue;
	}
	public void changeGear(int newValue) {
		this.gear = newValue;
	}
	public void speedUp(int increment) {
		this.speed += increment;
	}
	public void applyBrakes(int decrement) {
		this.speed -= decrement;
	}
	
	public void printStates() {
		System.out.println("Cadence: "+this.cadence);
		System.out.println("Speed: "+this.speed);
		System.out.println("Gear: "+this.gear);
	}

}
