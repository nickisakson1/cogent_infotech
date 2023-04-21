package cogent.infotech.AngularAssessmentBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.AngularAssessmentBackEnd.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}