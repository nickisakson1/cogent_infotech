package gl.itp.hyd65.cs65.Nicholas;

import java.util.concurrent.ThreadLocalRandom;

public class Advisor {
	
	String[] message;
	
	public Advisor() {
		message = new String[5];
		message[0] = "Advice 1";
		message[1] = "Advice 2";
		message[2] = "Advice 3";
		message[3] = "Advice 4";
		message[4] = "Advice 5";
	}
	
	public String getAdvice() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		return message[randomNum-1];
	}

}
