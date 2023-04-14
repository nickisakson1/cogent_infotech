package cogent.infotech.com.movielibrary.service;

import java.util.List;
import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.movielibrary.entity.User;
import cogent.infotech.com.movielibrary.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return (List)userRepository.findAll();
	}

}
