package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iiht.model.Multiplex;
import com.iiht.service.MultiplexService;

@Controller
public class MultiplexController {

	@Autowired
	private MultiplexService multiplexService;
	
	@RequestMapping("/addmultiplex")
	public ModelAndView addNewMultiplex(){
		return null;
	}
	
	@RequestMapping(value="/savemultiplex",method = RequestMethod.POST)
	public ModelAndView addMultiplex(@ModelAttribute("multiplex") Multiplex multiplex){
		return null;
	}
		
	@RequestMapping("/viewmultiplex")
	public ModelAndView searchByMultiplex(){
		return null;
	}
	
}
