package com.tjcsims.dao;

import org.hibernate.Session;


/**
 * Data access interface for domain model
 * 领域模型的数据访问接口
 * @author MyEclipse Persistence Tools
 */
public interface IBaseHibernateDAO {
	public Session getSession();
}
/*使用：
 * IBaseHibernateDAO dbdao = new BaseHibernateDAO();
 * Session session=dbdao.getSession();
 * */