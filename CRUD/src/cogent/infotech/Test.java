package cogent.infotech;

public class Test {
	
	public static void main(String[] args) {
		
		ACMEBicycle b = new ACMEBicycle();
		b.changeCadence(10);
		b.applyBrakes(1);
		b.changeCadence(2);
		b.speedUp(5);
		b.printStates();
	}

}
