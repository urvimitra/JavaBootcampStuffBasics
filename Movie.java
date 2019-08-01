package com.shell.bean;

public class Movie {
	

		private int movieId;
		private String title;
		private int budget;
		public int getMovieId() {
			return movieId;
		}
		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setBudget(int b)
		{
			budget=b;
		}
	
		public int getBudget() { return budget; }


}
