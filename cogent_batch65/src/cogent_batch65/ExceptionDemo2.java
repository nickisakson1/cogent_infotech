package cogent_batch65;

class Arithmetic {
	
	public void division(int x, int y) throws ArithmeticException {
		int z = x/y;
		System.out.println(z);
	}
	
}

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		
		String[] names = {"Shiva","John", "Anthony", "Sophia"};
		
		try {
			System.out.println(names[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayOutOfBounds");
		}
		System.out.println("After Exception");
		
		try {
			new Arithmetic().division(500,0);
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

}
