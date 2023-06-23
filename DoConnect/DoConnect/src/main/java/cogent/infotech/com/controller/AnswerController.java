package cogent.infotech.com.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

import cogent.infotech.com.service.AnswerService;
import cogent.infotech.com.entity.Answer;
import cogent.infotech.com.entity.User;

@CrossOrigin()
@RestController
public class AnswerController {
	
	@Autowired
	private AnswerService answerService;
	
	@PostMapping("/addanswer")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public void addAnswer(@Validated @RequestBody Answer answer) {
		answerService.addAnswer(answer);
	}
	
//	@PutMapping("/updateanswer")
//	@PreAuthorize("hasRole('user') || hasRole('admin')")
//	public void updateAnswerStatus(@Validated @RequestBody updateAnswerStatusContent uasc) {
//		answerService.updateAnswerStatus(uasc.getId(), uasc.getStatus());
//	}
//	
	@PutMapping("/updateanswer/{id}/{status}")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public void updateAnswerStatusPath(@Validated @PathVariable("id") int id, 
			@Validated @PathVariable("status") String status,
			@Validated @RequestBody User user) {
		answerService.updateAnswerStatus(id, status, user.getId());
	}
	
	
	@DeleteMapping("/deleteanswerbyid/{id}")
	@PreAuthorize("hasRole('admin')")
	public void deleteAnswerById(@Validated @PathVariable("id") int id) {
		answerService.deleteAnswerById(id);
	}
	
	@GetMapping("/getallanswers")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public List<Answer> getAllAnswers() {
		return answerService.getAllAnswers();
	}
	
	@GetMapping("/getallanswerfalse")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public List<Answer> getAllAnswersFalse() {
		return answerService.getAllAnswersFalse();
	}
	
	@GetMapping("/getallanswertrue")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public List<Answer> getAllAnswersTrue() {
		return answerService.getAllAnswersTrue();
	}
	
	@GetMapping("/getallanswerbyquestionid/{id}")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public List<Answer> getAllAnswersByQuestionId(@Validated @PathVariable("id") int questionid) {
		return answerService.getAllAnswersByQuestionId(questionid);
	}
	
	@GetMapping("/getallanswerbyid")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public List<Answer> getAllAnswersById(@Validated @RequestBody int id) {
		return answerService.getAllAnswersById(id);
	}

}

class updateAnswerStatusContent {
	
	int id;
	String status;
	
	public updateAnswerStatusContent(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}