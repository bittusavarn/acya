package com.acya.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.acya.dao.TestDao;
import com.acya.pojo.Test;
import com.acya.pojo.TestRole;
import com.acya.user.pojo.User;

/**
 * 
 * @author Nilamber Kumar
 * Config Test Dao
 */
public class TestDaoImpl implements TestDao{

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void saveTest(Test test)
	{
		//TestRole testRole=new TestRole();
		//testRole.setDes("fshfgjhkg");
		//test.setTestRole(testRole);
		
		//sessionFactory.getCurrentSession().save(new User());
		//sessionFactory.getCurrentSession().save(test);
	}
}
