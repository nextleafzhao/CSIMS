package com.tjcsims.dao;

import org.hibernate.Session;


/**
 * Data access object (DAO) for domain model
 * 域模型的数据访问对象（DAO）
 * 域模型的数据访问接口的实现类
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}

	@Override
	public void queryScore() {
		// TODO 自动生成的方法存根
		
	}
	
}

/*使用
 * IBaseHibernateDAO dbdao = new BaseHibernateDAO();
 * Session session=dbdao.getSession();
 * 
 * */