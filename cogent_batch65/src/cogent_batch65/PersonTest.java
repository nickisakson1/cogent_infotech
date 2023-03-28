package cogent_batch65;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		person p1 = new person();
		
		person p2 = new person(1001, "Nicholas", "Isakson", "Texas", 24);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a person ID: ");
		p1.setPersonId(sc.nextInt());
		System.out.println("Please enter a person first name: ");
		p1.setFirstName(sc.next());
		System.out.println("Please enter a person last name: ");
		p1.setLastname(sc.next());
		System.out.println("Please enter a person age: ");
		p1.setAge(sc.nextInt());
		System.out.println("Please enter a person address: ");
		p1.setAddress(sc.next());
		
		// p1.setPersonId(1001);
		// p1.setFirstName("Nicholas");
		// p1.setLastname("Isakson");
		// p1.setAge(24);
		// p1.setAddress("Texas");
		
		System.out.println("Person Details: ");
		System.out.println("First Name: "+p1.getFirstName());
		System.out.println("Last Name: "+p1.getLastname());
		System.out.println("Age: "+p1.getAge());
		System.out.println("Address: "+p1.getAddress());
	}
}
