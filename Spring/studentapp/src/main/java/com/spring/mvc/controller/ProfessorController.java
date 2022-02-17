package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.bean.CountryBean;

@Controller
public class ProfessorController {
	
	@Autowired
	CountryBean countryBean;
	
	@RequestMapping("/professors")
	public ModelAndView homePage() {
		
		ModelAndView modelAndView = new ModelAndView("professors");
		
		
		
		modelAndView.addObject("countries", countryBean.getCountries());
		return modelAndView;
	}
}
