package com.nrifintech.febjspservletbatch.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterToTestOrder implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Some msg from FilterToTestOrder in request flow");
		chain.doFilter(request, response);
		System.out.println("Some msg from FilterToTestOrder in response flow");
		
	}

}
