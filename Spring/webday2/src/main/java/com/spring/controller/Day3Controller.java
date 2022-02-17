package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Student;

@Controller
public class Day3Controller {
	
	@RequestMapping("/")
	public ModelAndView mvcDay3() {
		System.out.println("master jsp");
		ModelAndView modelAndView = new ModelAndView("master");
		modelAndView.addObject(new Student(null, null, null));
		return modelAndView;
	}
	
	//@RequestMapping(value="/saveData",method = RequestMethod.POST)
	@PostMapping("/saveData")
	public ModelAndView saveStudentData(@ModelAttribute("student") Student student,Model model) {
		System.out.println("Inside save student data conrtoller");
//		System.out.println("name :"+name);
//		System.out.println("age :"+age);
//		System.out.println("gender :"+gender);
//		Student student = new Student(name, gender, age);
		
		// Call DB to persist
		System.out.println("students from request : "+ student);
		model.addAttribute("student", student);
		ModelAndView modelAndView = new ModelAndView("showStudent");
		return modelAndView;
	}
	
	
	@RequestMapping("/day3")
	public String DummyMethod(@RequestParam("name") String name,Model model) {
		System.out.println("Hello from spring MVC");
		
		String parameter = name;
		System.out.println("data from request "+parameter);
		
		List<Student> students = new ArrayList<>();
		Student student = new Student("Ankkan","M",29);
		Student student2 = new Student("Shrabani","F",23);
		Student student3 = new Student("Md Hossain","M",30);
		
		
		students.add(student);
		students.add(student2);
		students.add(student3);
		
		
		model.addAttribute("requestName", name);
		model.addAttribute("students", students);
		
		return "day3";
	}
}

