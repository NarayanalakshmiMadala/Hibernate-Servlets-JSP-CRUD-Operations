package com.Lakshmi.Utility;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Lakshmi.Model.Student;
public class HibernateUtility 
{
	Configuration configuration=null;
	SessionFactory sf=null;
	Session session=null;
	Transaction transaction=null;
	
	public void open_connection()
	{
		try 
		{
			configuration=new Configuration();
			configuration.configure("com/Lakshmi/Utility/Hibernate.config.xml");
			sf=configuration.buildSessionFactory();
			session=sf.openSession();
			transaction=session.beginTransaction();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void close_connection()
	{
		try 
		{
			if(transaction!=null)
				transaction.commit();
			if(session!=null)
				session.close();
			if(sf!=null)
				sf.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void saving(Student s)
	{
		session.save(s);
	}
	public Student reading(String uname)
	{
		String hql="FROM Student s WHERE s.username = :uname";
		Query<Student> q=session.createQuery(hql,Student.class);
		q.setParameter("uname",uname);
		Student std=(Student)q.uniqueResult();
		return std;	
	}
	@SuppressWarnings("rawtypes")
	public int deleting(String username)
	{
		String hql="DELETE FROM Student s where s.username = :username";
		Query q=session.createQuery(hql);
		q.setParameter("username",username);
		int executeUpdate=q.executeUpdate();
		return executeUpdate;
	}
	public List<Student> allStudents() 
	{
		String hql="FROM Student";
		Query<Student> q=session.createQuery(hql,Student.class);
		List<Student> std=q.getResultList();
		return std;	
	}
	@SuppressWarnings("rawtypes")
	public int updating(Student std)
	{
		String hql="UPDATE Student s SET s.firstname=:firstname,s.lastname=:lastname,s.dob=:dob,s.email=:email,s.contact=:contact,s.course=:course,s.password=:password WHERE s.username=:username";
		Query q=session.createQuery(hql);
		q.setParameter("firstname",std.getFirstname());
		q.setParameter("lastname",std.getLastname());
		q.setParameter("dob",std.getDob());
		q.setParameter("email",std.getEmail());
		q.setParameter("contact",std.getContact());
		q.setParameter("course",std.getCourse());
		q.setParameter("password",std.getPassword());
		q.setParameter("username",std.getUsername());
		int executeUpdate=q.executeUpdate();
		return executeUpdate;
	}
}
