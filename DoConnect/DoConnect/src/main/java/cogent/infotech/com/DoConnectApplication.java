package cogent.infotech.com;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.repository.UserRepository;
import cogent.infotech.com.entity.User;

@SpringBootApplication
public class DoConnectApplication {
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DoConnectApplication.class, args);
	}

	@PostConstruct
	public void initUser() {
		List<User> user = userRepository.findAll();
        userRepository.saveAll(user);
	}
	
}
