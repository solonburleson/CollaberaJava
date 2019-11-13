package com.collabera.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="LoginServlet", urlPatterns="/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if(password.equals("admin123")) {
			out.print("You are successfully logged in!");
			out.print("<br>Welcome, " + name);
			
//			Cookie ck = new Cookie("name",name);
//			res.addCookie(ck);
			
			HttpSession session = req.getSession();
			session.setAttribute("name", name);
		} else {
			out.print("Sorry, username or password error!");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		out.close();
	}	
}
