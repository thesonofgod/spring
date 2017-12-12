package com.codewithshan.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.codewithshan.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	
	public static void main(String[] args){
		
					//create session factory
				SessionFactory factory = new Configuration()
											.configure("hibernate.cfg")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
				
					//create session
				Session session = factory.getCurrentSession();
				
				try {
					//create 3 student object
				System.out.println("Creating 3 new student object...");
				Student tempStudent1 = new Student("Paul","Wall","paul@codewuthshan.com");
				Student tempStudent2 = new Student("dom","nick","dom@codewuthshan.com");
				Student tempStudent3 = new Student("Rog","Fed","Rog@codewuthshan.com");
				
					//start a transaction
				session.beginTransaction();
				
					//save the student object
				System.out.println("Saving the student");
				session.save(tempStudent1);
				session.save(tempStudent2);
				session.save(tempStudent3);
				
					//commit transaction
				session.getTransaction().commit();
				System.out.println("Done!");
				}
				
				finally{
					factory.close();
				}

	}

}
