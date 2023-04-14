package cogent.infotech.com.movielibrary.service;

import java.util.List;
import java.util.Optional;

import cogent.infotech.com.movielibrary.entity.Movie;

public interface MovieService {

	public void createMovie(Movie movie);
	public void updateMovieRelease(int movieId, String Release);
	public void updateFavorites(int movieId, boolean favorite);
	public void deleteMovie(int movieId);
	public Optional<Movie> searchMovie(int movieId);
	public List<Movie> searchMovieName(String movieName);
	public List<Movie> getFavorites();
	public List<Movie> searchMovie(String movieGenre);
	public List<Movie> searchMovie();
	public void start();

}
