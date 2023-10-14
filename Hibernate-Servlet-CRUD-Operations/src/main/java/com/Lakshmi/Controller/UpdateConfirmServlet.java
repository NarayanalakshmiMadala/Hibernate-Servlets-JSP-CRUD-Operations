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

@WebServlet("/UpdateConfirmServlet")
public class UpdateConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String firstname=request.getParameter("fname");
		 String lastname=request.getParameter("lname");
		 String date_of_birth=request.getParameter("dob");
		 String email=request.getParameter("email");
		 String contact=request.getParameter("contact");
		 String course=request.getParameter("course");
		 String uname=request.getParameter("uname");
		 String passwd=request.getParameter("passwd");
		  
		 Student s=new Student();
		 s.setFirstname(firstname);
		 s.setLastname(lastname);
		 s.setDob(date_of_birth);
		 s.setEmail(email);
		 s.setContact(contact);
		 s.setCourse(course);
		 s.setUsername(uname);
		 s.setPassword(passwd);
		 
		 HibernateUtility hu=new HibernateUtility();
		 hu.open_connection();
		 int result=hu.updating(s);
		 hu.close_connection();
		 
		 //pw.println("Record Inserted Successfully...");
		 request.setAttribute("result",result);
		 RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/UpdateResult.jsp");
		 rd.forward(request, response);

	}

}
