package com.Lakshmi.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Lakshmi.Model.Student;
import com.Lakshmi.Utility.HibernateUtility;

@WebServlet("/AllStudentRecords")
public class AllStudentRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HibernateUtility hu=new HibernateUtility();
		 hu.open_connection();
		 List<Student> stds=hu.allStudents();
		 hu.close_connection();
		 request.setAttribute("stds",stds);
		 RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/AllRecords.jsp");
		 rd.forward(request, response);
		
	}

}
