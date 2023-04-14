package cogent.infotech.com.movielibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/user")
	public String welcomeUser() {
		return "Welcome user!";
	}
	
	@GetMapping("/admin")
	public String welcomeAdmin() {
		return "Welcome admin!";
	}

}
