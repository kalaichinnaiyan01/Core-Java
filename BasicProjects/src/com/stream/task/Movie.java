package com.stream.task;


public class Movie {

	private String movieName;
	
	private Integer releaseYear;
	
	private String actor;

	public Movie(String movieName, Integer releaseYear, String actor) {
		super();
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.actor = actor;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
	
}
