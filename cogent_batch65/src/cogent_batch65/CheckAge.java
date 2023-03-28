package cogent_batch65;

import java.util.Scanner;

public class CheckAge {

	public void ValidateAge(int age) throws InvalidAgeException {
		
		if(age<=100 && age>0) {
			System.out.println("Valid Age");
		}
		else {
			throw new InvalidAgeException("Age is not Valid");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the age: ");
		int age = sc.nextInt();
		
		CheckAge ck = new CheckAge();
		try {
			ck.ValidateAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Thrown: "+e.getMessage());
		}
		
	}
}
