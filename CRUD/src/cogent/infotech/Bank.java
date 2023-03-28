package cogent.infotech;

public abstract class Bank {
	
	abstract float getRateOfInterest();

}

class SBIBank extends Bank {
	
	float rateOfInterest = 7.25f;
	
	float getRateOfInterest() {
		return rateOfInterest;
	}
}

class HDFCBank extends Bank {
	
	float rateOfInterest = 7.00f;
	
	float getRateOfInterest() {
		return rateOfInterest;
	}
}

class HSBCBank extends Bank {
	
	float rateOfInterest = 8.00f;
	
	float getRateOfInterest() {
		return rateOfInterest;
	}
}
