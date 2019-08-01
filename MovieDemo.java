package com.shell.demo;
class Movie {
	private int movieID;
	private String title;
	Movie() { }
	Movie(String m,int id)
	{
		title=m;
		movieID=id;
		
	}
	void setMovieID(int movieID)
	{
		this.movieID=movieID;
	}
	void settitle(String title)
	{
		this.title=title;
	}
	int getMovieID()
	{
		return movieID;
	}
	String gettitle()
	{
		return title;
	}
}

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie=new Movie("abc",1);
		//movie.settitle("abc");
		//movie.setMovieID(1);
		System.out.println(movie.getMovieID()+" "+movie.gettitle());
		
		

	}

}
