package com.nri.training.jdbc.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.nri.training.jdbc.entity.Student;

public class Main {

	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeeProfile");
		EntityManager eManager = factory.createEntityManager();
		
		Student s1 = eManager.find(Student.class, 5);		
		System.out.println(s1);
		System.out.println("<<<<<<<<<<<<<<---------------------------->>>>>>>>>>>>>>>>>>>");
		
		CriteriaBuilder cb = eManager.getCriteriaBuilder();
		CriteriaQuery<Student> cr = cb.createQuery(Student.class);
		Root<Student> root = cr.from(Student.class);
		cr.select(root).where(cb.equal(root.get("id"), 8));
		
		Query q = eManager.createQuery(cr);
		List<Student> l1 = q.getResultList();
		
		System.out.println(l1);
		
		System.out.println("<<<<<<<<<<<<<<---------------------------->>>>>>>>>>>>>>>>>>>");
		List<Student> l2 = eManager.createNamedQuery("student.fetchall").getResultList();
		l2.stream().forEach(System.out::println);
		
		System.out.println("<<<<<<<<<<<<<<---------------------------->>>>>>>>>>>>>>>>>>>");
		List<Student> l3 = eManager.createNamedQuery("student.byfname").setParameter("fName", "Raktim").getResultList(); 
		l3.stream().forEach(System.out::println);
		
		eManager.close();
	}
	
}
