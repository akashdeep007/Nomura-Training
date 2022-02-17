package com.spring.mvc.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CountryBean {
	private List<String> countries =  new ArrayList<String>();
	private Map<Integer,String> dbCountries = new HashMap<>();
	
	public CountryBean() {
		populateCountries();
	}

	public List<String> getCountries() {
		return countries;
	}

	private void populateCountries() {
		
		countries.add("India");
		countries.add("Canada");
		countries.add("Russia");
		
		//Db call and iterate the result set and populate the collecttion
	}
	//TODO: Write a map implementation and use it in the UI
	private void populateCountryMap() {
		//TODO: home work for tomorrow
	}
}
