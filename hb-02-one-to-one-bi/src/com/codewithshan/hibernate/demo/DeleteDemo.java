package com.codewithshan.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codewithshan.hibernate.demo.entity.Instructor;
import com.codewithshan.hibernate.demo.entity.InstructorDetail;
import com.codewithshan.hibernate.demo.entity.Student;

public class DeleteDemo {

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
			session.beginTransaction();
			
			int theId=1;
			Instructor tempInstructor = session.get(Instructor.class,theId);
	
			//delete the instructor
			if(tempInstructor!= null){
				System.out.println("Deleting:" + tempInstructor);
			
				//Note: the details object will also be deleted cascaded!!
			session.delete(tempInstructor);
			}
			
			//Associate the objects
		//	tempInstructor.setInstructorDetail(tempInstructorDetail);	
			//start a transaction
		//	session.beginTransaction();
		//	System.out.println("Saving Instructor:" +tempInstructor);
			//session.save(tempInstructor);
		
			//commit transaction
		session.getTransaction().commit();
		System.out.println("Done!");
		
		}
		
		finally{
			factory.close();
		}

	}

}