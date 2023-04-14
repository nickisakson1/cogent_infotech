package cogent.infotech.com.movielibrary.service;

import java.util.List;
import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.movielibrary.entity.Movie;
import cogent.infotech.com.movielibrary.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepository movieRepository;
	
	public void start() {
		movieRepository.findAll();
		System.out.println("Started");
	}

	@Override
	public void createMovie(Movie movie) {
		movieRepository.save(movie);
	}

	@Override
	public void updateMovieRelease(int id, String releaseDate) {
		Optional<Movie> m = searchMovie(id);
		Movie movie = m.get();
		movie.setMovieReleaseDate(releaseDate);
		movieRepository.save(movie);
		
	}
	
	@Override
	public void updateFavorites(int id, boolean favorite) {
		Optional<Movie> m = searchMovie(id);
		Movie movie = m.get();
		movie.setFavorite(favorite);
		movieRepository.save(movie);
		
	}

	@Override
	public void deleteMovie(int movieId) {
		movieRepository.deleteById(movieId);
		
	}

	@Override
	public Optional<Movie> searchMovie(int movieId) {
		return (Optional)movieRepository.findById(movieId);
	}
	
	@Override
	public List<Movie> searchMovie(String movieGenre) {
		List<Movie> list = (List)movieRepository.findAll();
		List<Movie> movies = new ArrayList<Movie>();
		for(Movie m:list) {
			if(m.getMovieGenre().equals(movieGenre)) {
				movies.add(m);
			}
		}
		return (List)movies;
	}
	
	@Override
	public List<Movie> searchMovieName(String movieName) {
		List<Movie> list = (List)movieRepository.findAll();
		List<Movie> movies = new ArrayList<Movie>();
		for(Movie m:list) {
			if(m.getMovieName().equals(movieName)) {
				movies.add(m);
			}
		}
		return (List)movies;
	}
	
	@Override
	public List<Movie> getFavorites() {
		List<Movie> list = (List)movieRepository.findAll();
		List<Movie> movies = new ArrayList<Movie>();
		for(Movie m:list) {
			if(m.getFavorite()==true) {
				movies.add(m);
			}
		}
		return (List)movies;
	}

	@Override
	public List<Movie> searchMovie() {
		return (List)movieRepository.findAll();
	}

}
