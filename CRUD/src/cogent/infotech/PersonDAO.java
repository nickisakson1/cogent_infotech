package cogent.infotech;

import java.util.Scanner;

public class PersonDAO {
	
	Scanner sc = new Scanner(System.in);
	
	public void create(Person[] person, int i) {
		
		Person p = new Person();
		person[i] = p;
		System.out.println("Please enter the person ID");
		person[i].setPersonId(sc.nextInt());
		System.out.println("Please enter the person name");
		person[i].setPersonName(sc.next());
		System.out.println("Please enter the person address");
		person[i].setPersonAddress(sc.next());
		
	}
	
	public void read(Person[] person) {
		
		for(Person p:person) {
			System.out.println("Person ID is: "+p.getPersonId());
			System.out.println("Person Name is: "+p.getPersonName());
			System.out.println("Person Address is: "+p.getPersonAddress());
		}
	}

	public void update() {
	
	}

	public void delete() {
	
	}

}
