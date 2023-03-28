package cogent.infotech;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person[] personArray = null;
		PersonDAO dao = new PersonDAO();
		int choice = 0;
		
		do {
			System.out.println("*************Menu*************");
			System.out.println("1-Add Person");
			System.out.println("2-Print Person");
			System.out.println("3-Exit");
			System.out.println("Please Enter Your Choice: ");
			
			choice = sc.nextInt();	
			
			switch(choice) {
			
			case 1:
				System.out.println("How many persons do you want to add?");
				int count = sc.nextInt();
				personArray = new Person[count];
				for (int i=0;i<personArray.length;i++) {
					dao.create(personArray,i);
				}
				break;
				
			case 2:
				dao.read(personArray);
				break;
			
			case 3:
				System.exit(0);
			}
		}while(choice!=3);
	}
	
}
