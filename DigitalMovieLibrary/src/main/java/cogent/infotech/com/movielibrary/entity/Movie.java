package cogent.infotech.com.movielibrary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private int movieId;
	private String movieReleaseDate;
	private String movieName;
	private String movieGenre;
	private boolean favorite;
	
	public Movie() {
		
	}
	public Movie(int movieId, String movieReleaseDate, String movieName, String movieGenre, boolean favorite) {
		super();
		this.movieId = movieId;
		this.movieReleaseDate = movieReleaseDate;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.favorite = favorite;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(String movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public boolean getFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

}
