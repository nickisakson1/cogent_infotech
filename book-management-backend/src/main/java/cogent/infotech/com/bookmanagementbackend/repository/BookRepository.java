package cogent.infotech.com.bookmanagementbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.bookmanagementbackend.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}