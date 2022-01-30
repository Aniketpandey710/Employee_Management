package com.web.spring.Reposistery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.web.spring.model.Registration;

@Repository
public class RRepposistery {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void add(Registration reg) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(reg);
		tx.commit();
		s.close();
		
	}


	public List<Registration> listPro() {
		Session s = sessionFactory.openSession();
		List<Registration> plsit = s.createCriteria(Registration.class).list();
		s.close();
		return plsit;
	}

}
