package cogent.infotech.com.movielibrary;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.movielibrary.entity.User;
import cogent.infotech.com.movielibrary.repository.UserRepository;

@SpringBootApplication
public class DigitalMovieLibraryApplication {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DigitalMovieLibraryApplication.class, args);
	}
	
	@PostConstruct
	public void initUser() {
		List<User> user = userRepository.findAll();
//		List<User> users = Stream.of(
//                new User(102, "user1", "pwd1", "admin"),
//                new User(103, "user2", "pwd2", "user")
//        ).collect(Collectors.toList());
        userRepository.saveAll(user);
	}

}
