package cogent_batch65;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
//		Book book1 = new Book();
//		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a Book Number: ");
//		book1.setBookNo(sc.nextLine());
//		System.out.println("Please enter a Book Name: ");
//		book1.setBookName(sc.nextLine());
//		System.out.println("Please enter a Book Price: ");
//		book1.setBookPrice(sc.nextLine());
//		System.out.println("Please enter an Author Name: ");
//		book1.setAuthorName(sc.nextLine());
//		
//		System.out.println("Book Details: ");
//		System.out.println("Book Number: "+book1.getBookNo());
//		System.out.println("Book Name: "+book1.getBookName());
//		System.out.println("Price: "+book1.getBookPrice());
//		System.out.println("Author Name: "+book1.getAuthorName());
		
		Book[] bookshelf = new Book[2];
		for(int i=0;i<bookshelf.length;i++) {
			
			Book b1 = new Book();
			
			System.out.println("Please enter a Book Number: ");
			b1.setBookNo(sc.nextLine());
			System.out.println("Please enter a Book Name: ");
			b1.setBookName(sc.nextLine());
			System.out.println("Please enter a Book Price: ");
			b1.setBookPrice(sc.nextLine());
			System.out.println("Please enter an Author Name: ");
			b1.setAuthorName(sc.nextLine());
			
			bookshelf[i] = b1;
		}
		for(int j=0;j<bookshelf.length;j++) {
			System.out.println("Book "+(j+1)+" Name is: "+bookshelf[j].getBookNo());
			System.out.println("Book "+(j+1)+" Number is: "+bookshelf[j].getBookName());
			System.out.println("Book "+(j+1)+" Price is: "+bookshelf[j].getBookPrice());
			System.out.println("Book "+(j+1)+" Author is: "+bookshelf[j].getAuthorName());
		}
	}
}
