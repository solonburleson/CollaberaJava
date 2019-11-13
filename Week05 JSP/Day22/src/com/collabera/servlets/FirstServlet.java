package com.collabera.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="FirstServlet", urlPatterns = "/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String n = request.getParameter("userName");
			out.print("Welcome " + n);
//			out.print("<form action='servlet2'>");
//			out.print("<input type='hidden' name='uname' value='" + n + "' />");
//			out.print("<input type='submit' value='GO' />");
//			out.print("</form>");
			
			out.print("<a href='servlet2?uname="+ n + "'>Visit</a>");
			
			out.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
