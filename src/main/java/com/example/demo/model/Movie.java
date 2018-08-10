package com.example.demo.model;

import java.util.ArrayList;

public class Movie {
	String title;
	ArrayList<Integer> seats= new ArrayList<Integer>();
	Movie(){
		
	}
	public Movie(String t){
		this.title=t;
		for(int i=0;i<100;i++) {
			seats.add(0);
		}
	}
	public String seats() {
		String st="";
		int j=0;
		for(int i : seats) {
			j++;
			if(i==0)
				st=st+j+",";
				
		}
		return st;
	}
	public boolean check(int seat) {
		if(seats.get(seat)!=1)
			return true;
		return false;
	}
	public void Book(int seat) {	
			seats.add(seat, 1);
			
	}
}
