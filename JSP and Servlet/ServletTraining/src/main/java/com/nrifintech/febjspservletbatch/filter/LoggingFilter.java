package com.nrifintech.febjspservletbatch.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggingFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Initializing LoggingFilter...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		
		// execute something on the way of request
		System.out.println("execute something in request flow");
		
		filterChain.doFilter(request, response); // forward request to next resource waiting in the chain
		
		// execute something on the way of response
		System.out.println("execute something in response flow");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroying LoggingFilter...");
	}

}
