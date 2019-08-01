package com.shell.resource;


import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shell.bean.Movie;


	@Path("/movie-service")
	public class MovieResource {
		ArrayList<Movie> movies=new ArrayList<>();

		
		public MovieResource()
		{
			Movie movie1=new Movie();
			movie1.setMovieId(101);
			movie1.setTitle("Bahubali");
			Movie movie2=new Movie();
			movie2.setMovieId(102);
			movie2.setTitle("Avengers");
			Movie movie3=new Movie();
			movie3.setMovieId(103);
			movie3.setTitle("Super30");
			movie1.setBudget(100);
			movie2.setBudget(200);
			movie3.setBudget(300);
			movies.add(movie1);
			movies.add(movie2);

			movies.add(movie3);
		}
		
		
		@Path("/movies")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Movie> getMovie(){
			
			return movies;
			

			
			
			
		}
		@Path("/movies/{moviename}")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Movie getMovieDetails(@PathParam("moviename")String title)
		{
			for(Movie m: movies)
				if(m.getTitle().equals(title))
					return m;
			return null;
		}
		@Path("/movies/budget")
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public int getBudget()
		{
			int s=0;
			for(Movie m:movies)
				s+=m.getBudget();
			return s;
				
		}
		@Path("add-movie")
		@POST
		//@Produces(MediaType.TEXT_PLAIN)

		@Consumes(MediaType.APPLICATION_JSON)
		public ArrayList<Movie> addMovie(Movie m)
		{
			movies.add(m);
			return movies;
		}
		

	}



