package cogent_batch65;

public class ErrorDemo {
	
	public void message() {
		System.out.println("Happy Birthday!");
	}
	
	public static void main(String[] args) {
		
		ErrorDemo demo = new ErrorDemo();
		
		demo.message();
		System.out.println("After Exception");
		
	}

}
