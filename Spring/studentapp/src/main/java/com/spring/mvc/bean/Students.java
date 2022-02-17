package com.spring.mvc.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

// Create a jsp page and show all students 
// create a controller to list the students /students
// the controller method will populate the data in the jsp called allStudents.jsp

@Component
public class Students {
	
	private static Integer key = 1;
	private Map<Integer,Student> studentMap = new  HashMap<Integer, Student>();

	public Map<Integer,Student> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer,Student> studentMap) {
		this.studentMap = studentMap;
	}
	
	public void addValue(Student s)
	{
		studentMap.put(key, s);
		key++;
	}
}
