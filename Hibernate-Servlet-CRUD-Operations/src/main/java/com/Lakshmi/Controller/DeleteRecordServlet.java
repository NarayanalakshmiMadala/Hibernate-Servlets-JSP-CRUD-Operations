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

@WebServlet("/DeleteRecordServlet")
public class DeleteRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String username;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	    username=request.getParameter("uname");
		HibernateUtility hu=new HibernateUtility();
		hu.open_connection();
		Student std=hu.reading(username);
		request.setAttribute("student",std);
		hu.close_connection();
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/RetrivedDataToDelete.jsp");
		rd.forward(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HibernateUtility hu=new HibernateUtility();
		hu.open_connection();
		int result=hu.deleting(username);
		hu.close_connection();
		request.setAttribute("result",result);
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/DeletedRecord.jsp");
		rd.forward(request, response);
	}

}
