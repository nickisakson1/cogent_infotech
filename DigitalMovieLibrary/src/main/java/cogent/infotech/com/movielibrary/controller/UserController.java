package cogent.infotech.com.movielibrary.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.movielibrary.entity.Movie;
import cogent.infotech.com.movielibrary.entity.User;
import cogent.infotech.com.movielibrary.service.MovieService;
import cogent.infotech.com.movielibrary.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public void saveMovie(@Validated @RequestBody User user) {
		userService.createUser(user);
	}
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}

}
