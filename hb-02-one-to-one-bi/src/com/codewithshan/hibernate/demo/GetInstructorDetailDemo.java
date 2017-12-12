package com.codewithshan.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codewithshan.hibernate.demo.entity.Instructor;
import com.codewithshan.hibernate.demo.entity.InstructorDetail;
import com.codewithshan.hibernate.demo.entity.Student;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//begin transaction
			session.beginTransaction();
			
			//get the instructor detail object
			int theId=2;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class,theId);
			
			//print the instructor detail
			System.out.println(tempInstructorDetail);
			
			//print the associated instructor
			System.out.println(tempInstructorDetail.getInstructor());

			//commit transaction
		session.getTransaction().commit();
		System.out.println("Done!");
		
		}
		
		finally{
			factory.close();
		}

	}

}