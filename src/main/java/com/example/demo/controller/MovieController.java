package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.model.MovieList;


public class MovieController {
	
	
	MovieList movielist;
	Movie movie;
	public MovieController (){
		movielist = new MovieList();
	}
	public ArrayList<String> getmovies(){
		return this.movielist.list();
	}
	
	public void addnewMovie(String t) {
		movielist.addMovie(new Movie(t));
	}
	
	public String  Seatsavail(String title) {
			Movie m= movielist.getMovieobj(title);
		if(m!=null)
			return m.seats();
		else
			return "Provided Movie is Not In our List";
	}
	public String selectseat(String title,int[] seatno) {
		Movie m= movielist.getMovieobj(title);
		for(int s : seatno)
			if(m.check(s)==false||s<0||s>100)
				return "NA";
		for(int s : seatno)
		m.Book(s);
		return "Seat Booked";
	}
}
