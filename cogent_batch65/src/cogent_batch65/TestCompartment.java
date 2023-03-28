package cogent_batch65;

import java.util.concurrent.ThreadLocalRandom;

public class TestCompartment {
	
	public static void main(String[] args) {
		
	Compartment[] compartments = new Compartment[10];
	
	for(int i=0;i<compartments.length;i++) {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
		if (randomNum==1) {
			FirstClass fc = new FirstClass();
			compartments[i]= fc;
		}
		else if(randomNum==2) {
			Ladies l = new Ladies();
			compartments[i]= l;
		}
		else if(randomNum==3) {
			General g = new General();
			compartments[i]= g;
		}
		else if(randomNum==4) {
			Luggage lg = new Luggage();
			compartments[i]= lg;
		}
	}
	for(int i=0;i<compartments.length;i++) {
		compartments[i].notice();
	}
	}

}
