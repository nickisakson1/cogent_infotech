package cogent.infotech.com.service;

import java.util.List;

import cogent.infotech.com.entity.Chat;
import cogent.infotech.com.entity.GlobalChat;

public interface GlobalChatService {
	public void addChat(GlobalChat globalChat);
	public List<GlobalChat> getAllChat();


}
