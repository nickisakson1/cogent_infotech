package cogent.infotech.AngularAssessmentBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.AngularAssessmentBackEnd.entity.User;
import cogent.infotech.AngularAssessmentBackEnd.repository.UserRepository;

@SpringBootApplication
public class AngularAssessmentBackEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AngularAssessmentBackEndApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("User One", 20, 2000));
		this.userRepository.save(new User("User Two", 30, 3000));
		this.userRepository.save(new User("User Three", 40, 4000));
		
	}

}
