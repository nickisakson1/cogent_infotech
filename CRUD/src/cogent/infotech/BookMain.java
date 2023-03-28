package cogent.infotech;

import java.util.Scanner;

public class BookMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Book[] bookArray = null;
		BookDAO dao = new BookDAO();
		int choice = 0;
		
		do {
			System.out.println("*************Menu*************");
			System.out.println("1-Add Book");
			System.out.println("2-Print Book");
			System.out.println("3-Update Book");
			System.out.println("4-Delete Book");
			System.out.println("5-Exit");
			System.out.println("Please Enter Your Choice: ");
			
			choice = sc.nextInt();	
			
			switch(choice) {
			
			case 1:
				System.out.println("How many books do you want to add?");
				int count = sc.nextInt();
				bookArray = new Book[count];
				for (int i=0;i<bookArray.length;i++) {
					dao.create(bookArray,i);
				}
				break;
				
			case 2:
				if(bookArray!=null) {
					dao.read(bookArray);
				}
				else {
					System.out.println("Please add books.");
				}
				break;
				
			case 3:
				System.out.println("Which book ID would you like to update?");
				int id = sc.nextInt();
				System.out.println("Please enter the new book ID: ");
				int newid = sc.nextInt();
				System.out.println("Please enter the new book name: ");
				String newname = sc.next();
				System.out.println("Please enter the new book price: ");
				String newprice = sc.next();
				dao.update(bookArray, id, newid, newname,newprice);
				break;
				
			case 4:
				System.out.println("Which book ID do you want to delete?");
				int del = sc.nextInt();
				dao.delete(bookArray, del);
				break;
			
			case 5:
				System.exit(0);
			}
		}while(choice!=5);
	}

}
