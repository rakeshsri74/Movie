package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iiht.model.Movie;
import com.iiht.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value= {"index.html","/"},method=RequestMethod.GET)
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping("/addmovie")
	public ModelAndView addNewMovie(){
		return null;
	}
	
	@RequestMapping(value="/savemovie",method = RequestMethod.POST)
	public ModelAndView addMovie(@ModelAttribute("movie") Movie movie){
		return null;
	}
	@RequestMapping("/allotmovie")
	public ModelAndView allotNewMovie(){
		return null;
	}
	
	@RequestMapping(value="/saveallot",method = RequestMethod.POST)
	public ModelAndView allotMovie(@ModelAttribute("movie") Movie movie){
		return null;
	
	}
	
	@RequestMapping("/viewmovie")
	public ModelAndView searchByMovie(){
		return null;
	}
}
