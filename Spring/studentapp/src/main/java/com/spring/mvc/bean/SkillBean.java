package com.spring.mvc.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SkillBean {
	private List<String> skills =  new ArrayList<String>();
	public SkillBean() {
		populateSkills();
	}
	
	public List<String> getSkills() {
		return skills;
	}

	private void populateSkills() {
		// TODO Auto-generated method stub
		
		skills.add("SQL");
		skills.add("Java");
		skills.add("DB");
		skills.add("Spring");
	}
}
