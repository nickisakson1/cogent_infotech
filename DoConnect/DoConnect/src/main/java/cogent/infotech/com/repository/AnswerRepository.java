package cogent.infotech.com.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cogent.infotech.com.entity.Answer;
import cogent.infotech.com.entity.Question;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	@Query(value ="SELECT * From answer where status = ?1"
			,nativeQuery = true)
	List<Answer> findByStatus(String status);
	@Modifying
	@Transactional
	@Query(value ="UPDATE answer a set a.status = ?2, a.aapproved_by = ?3 where a.id = ?1"
			,nativeQuery = true)
	void updateAnswerStatus(int id, String status, int user);
	List<Answer> findById(int id);
	@Query(value ="SELECT * From answer a where a.status = 'true' AND a.question_by = ?1"
			,nativeQuery = true)
	List<Answer> getAllByQuestionId(int questionId);

}
