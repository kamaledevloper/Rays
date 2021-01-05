package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginControl
 */
@WebServlet("/LoginControl")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("user_name");
		String password = request.getParameter("password");
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();
	    System.out.println(name);
	    System.out.println(password);
	
	    if (name == " "  &&  password == " " ) {
						out.println("<h1>enter user name or password</h1>");
			System.out.println("Blank User Name and Password");
			RequestDispatcher rd = request.getRequestDispatcher("ViewLogin.jsp");
			rd.forward(request, response);
		}
		    else {
		    	out.println("<h1>Login Sucessfull</h1>");
			System.out.println("Login Sucessfull");
	    	
			RequestDispatcher rd = request.getRequestDispatcher("ViewWelcome.jsp");
			rd.forward(request, response);
	    	
	    }    	
	    
	/*if( password == null || password == " "){
		out.println("enter password");
		System.out.println("BLAnk PASSWORD");
		RequestDispatcher rd = request.getRequestDispatcher("/ViewLogin.jsp");
		rd.include(request, response);
	}
		if (name.equalsIgnoreCase("kamal") && password.equalsIgnoreCase("Rathod") ) {
			System.out.println("Sucessfull Login");
			RequestDispatcher rd = request.getRequestDispatcher("ViewWelcome.jsp");
			rd.forward(request, response);
				}*/

	/*	else {
			out.print("Sucessfully Login");
			RequestDispatcher rd = request.getRequestDispatcher("ViewLogin");
			rd.include(request, response);
			
		}*/
//		System.out.println(10000);
		//RequestDispatcher rd = request.getRequestDispatcher("ViewLogin");
		//rd.forward(request, response);	
	
}
}
