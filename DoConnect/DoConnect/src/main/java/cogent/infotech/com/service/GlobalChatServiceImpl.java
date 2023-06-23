package cogent.infotech.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Chat;
import cogent.infotech.com.entity.GlobalChat;
import cogent.infotech.com.repository.ChatRepository;
import cogent.infotech.com.repository.GlobalChatRepository;

@Service
public class GlobalChatServiceImpl implements GlobalChatService{

	@Autowired
	private GlobalChatRepository globalChatRepository;
	
	@Override
	public void addChat(GlobalChat globalChat) {
		globalChatRepository.save(globalChat);
	}

	@Override
	public List<GlobalChat> getAllChat() {
		return (List<GlobalChat>)globalChatRepository.findAll();
	}
	
}
