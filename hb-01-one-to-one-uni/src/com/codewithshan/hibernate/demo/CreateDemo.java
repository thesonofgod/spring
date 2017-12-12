package com.codewithshan.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codewithshan.hibernate.demo.entity.Instructor;
import com.codewithshan.hibernate.demo.entity.InstructorDetail;
import com.codewithshan.hibernate.demo.entity.Student;

public class CreateDemo {

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
			//Create Objects
			Instructor tempInstructor = 
					new Instructor(0, "Chad","Darby","darby@codewithshan.com", null);
			
			InstructorDetail tempInstructorDetail = 
					new InstructorDetail(0, "http://www.luv2code.com/youtube","luv 2 code!!!");
			
			
			
			//Associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//start a transaction
			session.beginTransaction();
			
			System.out.println("Saving Instructor:" +tempInstructor);
			session.save(tempInstructor);
		
			//commit transaction
		session.getTransaction().commit();
		System.out.println("Done!");
		
		}
		
		finally{
			factory.close();
		}

	}

}