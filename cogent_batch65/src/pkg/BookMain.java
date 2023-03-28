package pkg;

public class BookMain {
	
	public static void main(String[] args) {
		
		BookDAO dao = new BookDAO();
		
		dao.createBooks(5);
		dao.showBooks();
	}

}
