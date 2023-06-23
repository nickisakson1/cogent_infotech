package cogent.infotech.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.entity.Chat;
import cogent.infotech.com.entity.GlobalChat;

@Repository
public interface GlobalChatRepository extends JpaRepository<GlobalChat, Integer>{
	void deleteByFromuser(String name);
}
