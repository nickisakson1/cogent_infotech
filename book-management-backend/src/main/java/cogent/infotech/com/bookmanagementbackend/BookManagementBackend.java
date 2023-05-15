package cogent.infotech.com.bookmanagementbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.bookmanagementbackend.entity.Book;
import cogent.infotech.com.bookmanagementbackend.repository.BookRepository;

@SpringBootApplication
public class BookManagementBackend implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(BookManagementBackend.class, args);
    }
    
    @Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		
		this.bookRepository.save(new Book("Title1", "Price1"));
		this.bookRepository.save(new Book("Title2", "Price2"));
		this.bookRepository.save(new Book("Title3", "Price3"));
		this.bookRepository.save(new Book("Title4", "Price4"));
		this.bookRepository.save(new Book("Title5", "Price5"));
		
	}
    
}