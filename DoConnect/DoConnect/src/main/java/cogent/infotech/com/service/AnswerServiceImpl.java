package cogent.infotech.com.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.*;
import cogent.infotech.com.repository.AnswerRepository;
import cogent.infotech.com.repository.UserRepository;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private EmailService emailService;

	@Override
	public List<Answer> getAllAnswersFalse() {
		return (List)answerRepository.findByStatus("false");
	}
	
	@Override
	public List<Answer> getAllAnswersTrue() {
		return (List)answerRepository.findByStatus("true");
	}
	
	@Override
	public void updateAnswerStatus(int id, String newStatus, int userid) {
		answerRepository.updateAnswerStatus(id , newStatus, userid);
	}

	@Override
	public List<Answer> getAllAnswers() {
		return (List)answerRepository.findAll();
	}
	
	@Override
	public List<Answer> getAllAnswersById(int id) {
		return (List)answerRepository.findById(id);
	}
	
	@Override
	public void addAnswer(Answer answer) {
		ArrayList<User> admins = (ArrayList<User>)userService.getAllUsersByUserType("admin");
		for(int i = 0; i < admins.size(); i++) {
			emailService.sendEmail(admins.get(i).getEmail(),
					"Dear "+ admins.get(i).getUsername()+",\n\n"
					+"A new answer needs to be approved.\n\n"
					+ "Answer Description: " + answer.getDescription_answer() + "\n"
					+"\nThank you,\nFrom DoConnect Email Service.",
					"A new answer needs to be approved");
		}
		answerRepository.save(answer);
	}
	
	@Override
	public void updateAnswer(Answer answer) {
		answerRepository.save(answer);
	}
	
	@Override
	public void deleteAnswerById(int id) {
		answerRepository.deleteById(id);
	}
	
	@Override
	public List<Answer> getAllAnswersByQuestionId(int questionId) {
		return answerRepository.getAllByQuestionId(questionId);
	}

}