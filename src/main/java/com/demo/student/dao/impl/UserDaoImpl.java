package com.demo.student.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.student.dao.UserDao;
import com.demo.student.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> findAll() {
		Session session = sessionFactory.openSession();
		List<User> users = (List<User>)session.createQuery("from User").list();
		session.close();
		return users;
	}

	@Override
	public User findByEmail(String email) {
		Session session = sessionFactory.openSession();
		User user = (User) session.createQuery("from User where email=:email").setParameter("email", email).uniqueResult();
		session.close();
		return user;
	}

}
