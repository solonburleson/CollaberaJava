package com.collabera.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.print("filter is invoked before");
		
		chain.doFilter(req, res);
		
		out.print("filter is invoked after");
		out.close();
	}
	
	public void destroy() {}
}
