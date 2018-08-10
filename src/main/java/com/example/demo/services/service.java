package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.MovieController;
@RestController
@EnableAutoConfiguration
@CrossOrigin(origins = "https://apitester.com/")
public class service {
	MovieController control= new MovieController();
	@RequestMapping("/check")
	String home() {
		return "Hello !";
	}
	@RequestMapping("/Movies")
	ArrayList<String> Listall(){
		return control.getmovies();
	}
	@RequestMapping("/addMovie")
	void AddMovie(@RequestParam String title){
		control.addnewMovie(title);
	}
	@RequestMapping("/seats")
	String availseats(@RequestParam String title) {
		return control.Seatsavail(title);
	}
	@RequestMapping(value="/selectseat",method = RequestMethod.POST )
	String Selectseat(@RequestBody String title,int[] seatno) {
		return control.selectseat(title,seatno);	
	}
	
}
