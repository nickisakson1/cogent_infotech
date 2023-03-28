package cogent.infotech;

import java.util.concurrent.ThreadLocalRandom;

public class InstrumentMain {
	
	public static void main(String[] args) {
		
		Instrument[] instruments = new Instrument[10];
		
		for(int i=0;i<instruments.length;i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			if (randomNum==1) {
				Piano p = new Piano();
				instruments[i]= p;
			}
			else if(randomNum==2) {
				Guitar g = new Guitar();
				instruments[i]= g;
			}
			else if(randomNum==3) {
				Flute f = new Flute();
				instruments[i]= f;
			}
		}
		
		for(int i=0;i<instruments.length;i++) {
			if(instruments[i] instanceof Flute) {
				System.out.println("Instrument "+(i+1)+" is a Flute.");
			}
			else if(instruments[i] instanceof Piano) {
				System.out.println("Instrument "+(i+1)+" is a Piano.");
			}
			else if(instruments[i] instanceof Guitar) {
				System.out.println("Instrument "+(i+1)+" is a Guitar.");
			}
			instruments[i].play();
		}
	}

}
