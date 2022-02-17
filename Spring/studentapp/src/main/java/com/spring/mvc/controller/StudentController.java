package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.bean.CountryBean;
import com.spring.mvc.bean.SkillBean;
import com.spring.mvc.bean.Student;
import com.spring.mvc.bean.Students;

@Controller
public class StudentController {
	
	@Autowired
	CountryBean countryBean;
	@Autowired
	SkillBean skillBean;
	@Autowired
	Students students;
	
	@ModelAttribute
	public Student student() {
		return new Student();
	}
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("home");
		
//		List<String> countries = new ArrayList<String>();
//		countries.add("India");
//		countries.add("Canada");
//		countries.add("Russia");
//		
//		
//		List<String> skillSet = new ArrayList<String>();
//		skillSet.add("SQL");
//		skillSet.add("Java");
//		skillSet.add("DB");
//		skillSet.add("Spring");
		
		modelAndView.addObject("skillSet", skillBean.getSkills());
		modelAndView.addObject("countries", countryBean.getCountries());
		//modelAndView.addObject("student",new Student());
		
		return modelAndView;
	}
	
	@PostMapping("/saveStudent")
	public ModelAndView saveStudentData(@ModelAttribute("student") Student student) {
		
		System.out.println(student);
		
		ModelAndView modelAndView = new ModelAndView("allStudents");
		students.addValue(student);
		System.out.print(students.getStudentMap());
		modelAndView.addObject("allStudents", students.getStudentMap());
		return modelAndView;
	}
	@RequestMapping("/allStudents")
	public ModelAndView  allSttudents() {
		Map<Integer, Student> studentsMap= students.getStudentMap();
		System.out.println(studentsMap);
		ModelAndView mView = new ModelAndView("allStudents");
		mView.addObject("allStudents", studentsMap);
		return mView;
	}
}
