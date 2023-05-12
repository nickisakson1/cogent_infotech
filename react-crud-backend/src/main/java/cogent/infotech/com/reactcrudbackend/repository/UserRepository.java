package cogent.infotech.com.reactcrudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.reactcrudbackend.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}