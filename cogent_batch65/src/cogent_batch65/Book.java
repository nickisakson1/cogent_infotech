package cogent_batch65;

public class Book {

	// data members
		String BookNo;
		String BookName;
		String BookPrice;
		String AuthorName;
		
		// default constructor
		public Book() {
			
		}

		public Book(String bookNo, String bookName, String bookPrice,
				String authorName) {
			super();
			BookNo = bookNo;
			BookName = bookName;
			BookPrice = bookPrice;
			AuthorName = authorName;
		}

		public String getBookNo() {
			return BookNo;
		}

		public void setBookNo(String bookNo) {
			BookNo = bookNo;
		}

		public String getBookName() {
			return BookName;
		}

		public void setBookName(String bookName) {
			BookName = bookName;
		}

		public String getBookPrice() {
			return BookPrice;
		}

		public void setBookPrice(String bookPrice) {
			BookPrice = bookPrice;
		}

		public String getAuthorName() {
			return AuthorName;
		}

		public void setAuthorName(String authorName) {
			AuthorName = authorName;
		}
}
