package com.nri.jdbc.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nri.jdbc.hibernate.entity.Student;
import com.nri.jdbc.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Raktim", "Ghosh", "raktim@gmail.com");
		Student student1 = new Student("Tarun", "Das", "tarun@gmail.com");
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			transaction = session.beginTransaction();
			// save the student objects
			session.save(student);
			session.save(student1);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query<Student> q1 = session.createQuery("from Student", Student.class);
		q1.setFirstResult(0);
		q1.setMaxResults(4);
		
		List<Student> l1 = q1.list();
		
		l1.stream().forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		
		Query<Student> q2 = session.createQuery("from Student where id=:id", Student.class);
		q2.setParameter("id", 1);
		
		List<Student> l2 = q2.list();		
		l2.stream().forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		
		Query<Student> q3 = session.createQuery("from Student where id<:id and firstName=:name", Student.class);
		q3.setParameter("id", 4);
		q3.setParameter("name", "Raktim");
		
		
		List<Student> l3 = q3.list();		
		l3.stream().forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		
		Transaction tx = session.beginTransaction();
		
		Query<Student> q4 = session.createQuery("update Student set firstName=:fName, lastName=:lName, email=:email where id=:id");
//		Query<Student> q4 = session.createQuery("update Student set firstName='?1', lastName='?2', email='?3' where id='?4'");
		q4.setParameter("fName", "Akashdeep");
		q4.setParameter("lName", "Bhattacharya");
		q4.setParameter("email", "akashdeep@gmail.com");
		q4.setParameter("id", 3);
		
		System.out.println("Number of rows updated: "+q4.executeUpdate());
		
		tx.commit();
		
	}

}
