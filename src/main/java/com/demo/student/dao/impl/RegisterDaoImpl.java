package com.demo.student.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.student.dao.RegisterDao;
import com.demo.student.dto.UserDto;
import com.demo.student.entity.User;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void registerUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		
	}

}
