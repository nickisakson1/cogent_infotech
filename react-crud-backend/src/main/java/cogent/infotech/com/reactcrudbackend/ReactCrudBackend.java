package cogent.infotech.com.reactcrudbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.reactcrudbackend.entity.User;
import cogent.infotech.com.reactcrudbackend.repository.UserRepository;

@SpringBootApplication
public class ReactCrudBackend implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(ReactCrudBackend.class, args);
    }
    
    @Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("First1", "Last1", "Email1", "https://www.w3schools.com/images/w3schools_green.jpg"));
		this.userRepository.save(new User("First2", "Last2", "Email2", "https://www.w3schools.com/images/w3schools_green.jpg"));
		this.userRepository.save(new User("First3", "Last3", "Email3", "https://www.w3schools.com/images/w3schools_green.jpg"));
		
	}
    
}