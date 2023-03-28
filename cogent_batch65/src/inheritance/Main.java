package inheritance;

public class Main {
	
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Hamlet");
		book.setAuthor("William Shakespeare");
		book.setPrice(5.95);
		
		Magazine magazine = new Magazine();
		magazine.setTitle("Time");
		magazine.setIssue("Feb. 2 , 2023");
		magazine.setPrice(0.58);
		
		book.sell(3);
		magazine.sell(52);
	}

}
