package com.demo.student.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.student.dao.ContactUsDao;
import com.demo.student.dto.StatusDto;
import com.demo.student.entity.ContactUs;

@Repository
public class ContactUsDaoImpl implements ContactUsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(ContactUs contactUs) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(contactUs);
		tx.commit();
		session.close();
	}

	@Override
	public List<ContactUs> findAll() {
		Session session = sessionFactory.openSession();
		List<ContactUs> contactUsList = (List<ContactUs>) session.createQuery("from ContactUs").list();
		session.close();
		return contactUsList;
	}

	@Override
	public void updateStatus(StatusDto sDto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query setParameter = session.createQuery("update ContactUs set status=:status where id=:id")
				.setParameter("status", sDto.getStatus()).setParameter("id", sDto.getId());

		setParameter.executeUpdate();
		tx.commit();
		session.close();

	}

	@Override
	public void saveOrUpdate(ContactUs contactUs) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(contactUs);
		tx.commit();
		session.close();
	}

	@Override
	public void deleteEnquiry(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(id);	
		tx.commit();
		session.close();

	}

}
