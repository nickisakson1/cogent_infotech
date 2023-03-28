package pkg;

public class BookDAO extends Book{
	
	public void createBooks(int n) {
		bArray = new Book[n];
		
		for(int i=0;i<bArray.length;i++) {
			bArray[i] = new Book();
			bArray[i].setBook_title("Book "+i);
			bArray[i].setBook_price("$"+i);
		}
	}
	
	public void showBooks() {
		
		for(int j=0;j<bArray.length;j++) {
			System.out.println(bArray[j].getBook_title());
			System.out.println(bArray[j].getBook_price());
		}
	}

}
