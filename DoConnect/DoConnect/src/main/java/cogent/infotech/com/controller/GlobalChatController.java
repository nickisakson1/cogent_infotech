package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Chat;
import cogent.infotech.com.entity.GlobalChat;
import cogent.infotech.com.service.GlobalChatService;
import cogent.infotech.com.service.GlobalChatServiceImpl;
import cogent.infotech.com.service.QuestionServiceImpl;


@CrossOrigin()
@RestController
public class GlobalChatController {
	@Autowired
	private GlobalChatServiceImpl globalChatService;
	
	@PostMapping("/globalchat/addchat")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public void addChat(@Validated @RequestBody GlobalChat chat) {
		globalChatService.addChat(chat);
	}
	
	@GetMapping("/globalchat/getchat")
	@PreAuthorize("hasRole('user') || hasRole('admin')")
	public List<GlobalChat> getAllChat() {
		return globalChatService.getAllChat();
	}
}
