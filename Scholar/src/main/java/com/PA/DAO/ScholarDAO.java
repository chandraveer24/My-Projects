package com.PA.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.PA.Domain.Scholar;

@Repository
public class ScholarDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public void addOrUpdate(Scholar scholar)
	{
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(scholar);
		session.close();
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Scholar> loadAll()
	{
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Scholar.class);
		List<Scholar> list = criteria.list();
		session.close();
		return list;
	}
	
	public void delete(Integer id)
	{
		Session session = sessionFactory.openSession();
		Scholar scholar = session.load(Scholar.class, id);
		org.hibernate.Transaction tran=session.beginTransaction();
		session.delete(scholar);
		session.flush();
		tran.commit();
		session.close();
	}
	
	public Scholar getById(Integer id)
	{
		Session session = sessionFactory.openSession();
		Scholar scholar = session.load(Scholar.class, id);
		return scholar;
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public List<Scholar> loaddAllScholars(String lastName)
	{
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Scholar.class);
		criteria.add(Restrictions.eq("lastName", lastName));
		List list = criteria.list();
		return list;
	}
	
	public void updateScholar(Scholar scholar)
	{
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction tran=session.beginTransaction();
		session.update(scholar);
		session.flush();
		tran.commit();
		session.close();
	}
}
