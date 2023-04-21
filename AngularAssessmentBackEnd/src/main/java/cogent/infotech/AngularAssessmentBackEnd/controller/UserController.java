package cogent.infotech.AngularAssessmentBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.AngularAssessmentBackEnd.entity.User;
import cogent.infotech.AngularAssessmentBackEnd.repository.UserRepository;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("api/")
public class UserController {
		
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("user")
	public List<User> getUsers() {
		return this.userRepository.findAll();
	}
	
	@PostMapping("user")
	public void updateUser(@RequestBody User user) {
		this.userRepository.save(user);
	}
	
	@DeleteMapping("user/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		this.userRepository.deleteById(id);
	}

}
