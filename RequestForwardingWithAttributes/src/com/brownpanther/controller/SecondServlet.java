package com.brownpanther.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Enumeration<String> attributeNames = request.getAttributeNames();
	  while(	attributeNames.hasMoreElements())
	  {
		  String attName= attributeNames.nextElement();
		  out.println(attName);
		  
		 out.println( request.getAttribute(attName));
	  }
		
		
		
		out.close();
		
	}

}
