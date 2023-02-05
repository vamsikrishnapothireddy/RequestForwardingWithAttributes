package com.brownpanther.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
         PrintWriter out = response.getWriter();
         
         
         request.setAttribute("Virta", "Cricketer");
         RequestDispatcher requestDispatcher = request.getRequestDispatcher("/second");
		
         requestDispatcher.forward(request, response);
         System.out.println("Control back in First Servlet");
         
         out.close();
		
	}

}
