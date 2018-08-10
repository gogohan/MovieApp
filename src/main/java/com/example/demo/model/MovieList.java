package com.example.demo.model;

import java.util.ArrayList;

public class MovieList {
	ArrayList<Movie> Movies;
	
	public MovieList(){
		Movies=new ArrayList<Movie>();
	}
	public void addMovie(Movie m) {
		Movies.add(m);
	}
	public ArrayList<String> list(){
		 ArrayList<String> temp = new  ArrayList<String>();
		 for(int i=0;i<Movies.size();i++) {
			 temp.add(Movies.get(i).title);
		 }
		 return temp;
	}
	public Movie getMovieobj(String t) {
		System.out.println("To get movie "+t + " "+Movies.size());
		for(int i=0;i<Movies.size();i++) {
			if(Movies.get(i).title.equals(t))
				return Movies.get(i);
		}
		return null;
	}	
}
