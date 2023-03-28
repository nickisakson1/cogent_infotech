package cogent_batch65;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		try {
			int z = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println("Wrong number");
		}
		System.out.println("Welcome");
		
		String input = "";
		int output = 0;
		try {
			input = args[0];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter an arg");
		} catch(NumberFormatException e) {
			System.out.println("Please enter an arg with the correct format");
		} finally {
			System.out.println("Finally will be executed whether an exception is triggered or not");
		}
		System.out.println("Input is: "+input);
		try {
			output = Integer.parseInt(input);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Output is: "+output);
		
	}

}
