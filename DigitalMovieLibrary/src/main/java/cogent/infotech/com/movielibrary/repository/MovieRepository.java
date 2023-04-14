package cogent.infotech.com.movielibrary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.movielibrary.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
