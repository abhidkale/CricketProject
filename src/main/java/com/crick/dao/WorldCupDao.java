package com.crick.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crick.entity.CricketStaff;

@Repository
public class WorldCupDao {
	
	@Autowired
	SessionFactory factory;

	public List<CricketStaff> allInsdianCricketstaffList() {
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(CricketStaff.class);
		List<CricketStaff> stafflist = criteria.list();
		
	
	
		return stafflist;
	}
	
	

	public void insertstaffdetails(CricketStaff staff) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(staff);
		tx.commit();		
	
		
	}

	public void updatestaffdetails(CricketStaff staff) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(staff);
		tx.commit();		
	}
	public void deleteCricketStaffasperId(Integer id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		CricketStaff c = session.load(CricketStaff.class,id);
		
		session.delete(c);
		tx.commit();
	}


	
	}


