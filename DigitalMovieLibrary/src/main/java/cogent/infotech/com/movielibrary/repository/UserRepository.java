package cogent.infotech.com.movielibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import cogent.infotech.com.movielibrary.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>, CrudRepository<User, Integer>{
	
	User findByUsername(String name);

}
