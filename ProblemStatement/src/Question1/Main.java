package Question1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Product[] pArray = null;
		ProductDAO dao = new ProductDAO();
		int choice = 0;
	
		do {
			System.out.println("*************Menu*************");
			System.out.println("1-Create Record");
			System.out.println("2-Read Record");
			System.out.println("3-Update Record");
			System.out.println("4-Delete Record");
			System.out.println("5-Exit");
			System.out.println("Please Enter Your Choice: ");
		
			choice = sc.nextInt();	
		
			switch(choice) {
		
			case 1:
				pArray = new Product[10];
				for (int i=0;i<pArray.length;i++) {
					dao.create(pArray,i);
				}
				break;
			
			case 2:
				if(pArray!=null) {
					dao.read(pArray);
				}
				else {
					System.out.println("Please create the record first");
				}
				break;
			
			case 3:
				if(pArray!= null) {
					System.out.println("Which Product ID would you like to update?");
					int id = sc.nextInt();
					System.out.println("Please enter the new product ID: ");
					int newid = sc.nextInt();
					System.out.println("Please enter the new product name: ");
					String newname = sc.next();
					System.out.println("Please enter the new product price: ");
					String newprice = sc.next();
					dao.update(pArray, id, newid, newname,newprice);
				}
				else {
					System.out.println("Please create the record first");
				}
				break;
			
			case 4:
				if(pArray!= null) {
					System.out.println("Which product ID do you want to delete?");
					int del = sc.nextInt();
					dao.delete(pArray, del);
				}
				else {
					System.out.println("Please create the record first");
				}
				break;
		
			case 5:
				System.exit(0);
			}
		}while(choice!=5);
	}
}
