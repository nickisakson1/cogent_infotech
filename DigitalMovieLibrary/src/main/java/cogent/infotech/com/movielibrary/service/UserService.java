package cogent.infotech.com.movielibrary.service;

import java.util.List;
import java.util.Optional;

import cogent.infotech.com.movielibrary.entity.User;

public interface UserService {
	
	public void createUser(User user);
	public List<User> getUsers();

}
