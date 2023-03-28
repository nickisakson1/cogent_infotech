package cogent.infotech;

import java.util.Scanner;

public class BookDAO {
	
	Scanner sc = new Scanner(System.in);
	
	public void create(Book[] book, int i) {
		
		Book b = new Book();
		book[i] = b;
		System.out.println("Please enter the book ID");
		book[i].setBookId(sc.nextInt());
		System.out.println("Please enter the book name");
		book[i].setBookName(sc.next());
		System.out.println("Please enter the book price");
		book[i].setBookPrice(sc.next());
		
	}
	
	public void read(Book[] book) {
		
		for(Book b:book) {
			if(b!=null) {
				System.out.println("Book ID is: "+b.getBookId());
				System.out.println("Book Name is: "+b.getBookName());
				System.out.println("Book Price is: "+b.getBookPrice());
			}
		}
	}

	public void update(Book[] book, int id, int newid, String newname, String newprice) {
		
		for(int i=0;i<book.length;i++) {
			if(book[i].getBookId()==id) {
				book[i].setBookId(newid);
				book[i].setBookName(newname);
				book[i].setBookPrice(newprice);
			}
		}
	
	}

	public void delete(Book[] book, int del) {
		
		for(int i=0;i<book.length;i++) {
			if(book[i].getBookId()==del) {
				book[i] = null;
			}
		}
	}

}
