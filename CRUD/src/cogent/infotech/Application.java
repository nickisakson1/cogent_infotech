package cogent.infotech;

public class Application {
	
	public static void main(String[] args) {
		
		Bank b = new SBIBank();
		System.out.println(b.getRateOfInterest());
		
		b = new HDFCBank();
		System.out.println(b.getRateOfInterest());
		
		b = new HSBCBank();
		System.out.println(b.getRateOfInterest());
	}

}
