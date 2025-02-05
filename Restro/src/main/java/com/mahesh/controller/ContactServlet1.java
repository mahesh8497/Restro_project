package com.mahesh.controller;

import java.io.IOException;
import java.net.Authenticator.RequestorType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mahesh.service.ContactServiceImpl;

/**
 * Servlet implementation class ContactServlet1
 */
@WebServlet("/ContactServlet1")

public class ContactServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String subject=request.getParameter("subject");
		String message=request.getParameter("message");
		
		
		ContactServiceImpl contactServiceImpl=new ContactServiceImpl();
		result=contactServiceImpl.ContactService1(name, email, subject, message);
		  
		System.out.println(result);
//		//doGet(request, response);
		
		if(result.equals("VALID")) {
			result=contactServiceImpl.ContactService2(name, email, subject, message);
			session.setAttribute("msg", result);
			response.sendRedirect("contact.jsp");

		}
		else {
			session.setAttribute("msg", result);
			response.sendRedirect("contact.jsp");
		}
	}

}
