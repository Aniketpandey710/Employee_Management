package com.web.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.spring.model.Registration;
import com.web.spring.service.RService;


@Controller
@RequestMapping("emp")
public class RController {

	@Autowired
	RService service;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView employee() 
	{ 	
		return new ModelAndView("input", "registration",  new Registration() );   
	}
	
	
	@RequestMapping(value = "/addemp")
	public ModelAndView createEmployee(@Valid Registration reg) 
	{ 	
		service.addProduct(reg);
		return new ModelAndView("redirect:/emp/getAllEmp");
		
	}
	
	
	@RequestMapping(value = "/getAllEmp", method = RequestMethod.GET)
	public ModelAndView listEmp() 
	{ 

		ModelAndView model = new ModelAndView();
	model.addObject("Emp", service.list());
	model.setViewName("display"); 
	return model;
	

	}
	
	
	
	
}
