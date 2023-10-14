package com.Lakshmi.Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Lakshmi.Model.Student;
import com.Lakshmi.Utility.HibernateUtility;


@WebServlet("/RetriveRecordServlet")
public class RetriveRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname=request.getParameter("uname");
		HibernateUtility hu=new HibernateUtility();
		hu.open_connection();
		Student std=hu.reading(uname);
		
		request.setAttribute("student", std);
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/RetrivedData.jsp");
		rd.forward(request, response);
		hu.close_connection();
	}

}
