package cogent.infotech.com.movielibrary.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.movielibrary.entity.Movie;
import cogent.infotech.com.movielibrary.entity.Session;
import cogent.infotech.com.movielibrary.service.CustomUserDetailsService;
import cogent.infotech.com.movielibrary.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	CustomUserDetailsService cuds;
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/admin/movies/create")
	public void saveMovie(@Validated @RequestBody Movie movie) {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			movieService.createMovie(movie);
		}
	}
	
	@PostMapping("/admin/movies/updateRelease")
	public void updateMovie(@Validated @RequestBody Movie movie) {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			movieService.updateMovieRelease(movie.getMovieId(), movie.getMovieReleaseDate());
		}
	}
	
	@PostMapping("/admin/movies/updateFavorites")
	public void updateFavorites(@Validated @RequestBody Movie movie) {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			movieService.updateFavorites(movie.getMovieId(), movie.getFavorite());
		}
	}
	
	@PostMapping("/user/movies/updateFavorites")
	public void updateFavorites2(@Validated @RequestBody Movie movie) {
		cuds.loadUserByUsername("user1");
		if(Session.getAuth().equals("User")) {
			movieService.updateFavorites(movie.getMovieId(), movie.getFavorite());
		}
	}
	
	@DeleteMapping("/admin/movies")
	public void deleteMovie(@Validated @RequestBody Movie movie) {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			movieService.deleteMovie(movie.getMovieId());
		}
	}
	
	@GetMapping("/admin/movies/searchId")
	public Optional<Movie> searchMovieId(@Validated @RequestBody Movie movie) {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			return movieService.searchMovie(movie.getMovieId());
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/admin/movies/favorites")
	public List<Movie> getFavorites() {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			return movieService.getFavorites();
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/user/movies/favorites")
	public List<Movie> getFavorites2() {
		cuds.loadUserByUsername("user1");
		if(Session.getAuth().equals("User")) {
			return movieService.getFavorites();
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/admin/movies/searchGenre")
	public List<Movie> searchMovieGenre(@Validated @RequestBody Movie movie) {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			return movieService.searchMovie(movie.getMovieGenre());
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/admin/movies/searchName")
	public List<Movie> searchMovieName(@Validated @RequestBody Movie movie) {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			return movieService.searchMovie(movie.getMovieName());
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/admin/movies/searchAll")
	public List<Movie> searchMovie() throws NullPointerException {
		cuds.loadUserByUsername("user2");
		if(Session.getAuth().equals("Admin")) {
			return movieService.searchMovie();
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/user/movies/searchAll")
	public List<Movie> searchMovie2() throws NullPointerException {
		cuds.loadUserByUsername("user1");
		if(Session.getAuth().equals("User")) {
			return movieService.searchMovie();
		}
		else {
			return null;
		}
	}

}
