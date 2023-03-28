package cogent_batch65;

import java.util.concurrent.ThreadLocalRandom;

public class TestMedicine {
	
	public static void main(String[] args) {
		
		Medicine[] medarray = new Medicine[10];
		
		for (int i=0;i<medarray.length;i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			if(randomNum==1) {
				Ointment temp = new Ointment("Aloe","Address1","Oily");
				medarray[i] = temp;
			}
			else if(randomNum==2) {
				Tablet temp = new Tablet("Tylenol","Address2","1.25g");
				temp.setWeight("1.25 g");
				medarray[i] = temp;
			}
			else if(randomNum==3) {
				Syrup temp = new Syrup("Cough Syrup","Address3","Red");
				medarray[i] = temp;
			}
		}
		for (int i=0;i<medarray.length;i++) {
			System.out.println("The Medicine at position "+i+" is: ");
			medarray[i].displayLabel();
		}
		
	}

}
