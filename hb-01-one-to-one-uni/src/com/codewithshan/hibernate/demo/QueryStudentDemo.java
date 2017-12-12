package com.codewithshan.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codewithshan.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudents(theStudents);
			
			// query students: lastName='Doe'
			theStudents = session.createQuery("from Student s where s.lastName='babu'").getResultList();
			
			// display the students
			System.out.println("\n\nStudents who have last name of babu");
			displayStudents(theStudents);
			
			// query students: lastName='Doe' OR firstName='Daffy'
			theStudents =
					session.createQuery("from Student s where"
							+ " s.lastName='babu' OR s.firstName='dom'").getResultList();
			
			System.out.println("\n\nStudents who have last name of babu OR first name dom");
			displayStudents(theStudents);
			
			// query students where email LIKE '%codewithshan.com'
			theStudents = session.createQuery("from Student s where"
					+ " s.email LIKE '%codewuthshan.com'").getResultList();

			System.out.println("\n\nStudents whose email ends with codewithshan.com");			
			displayStudents(theStudents);
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}




