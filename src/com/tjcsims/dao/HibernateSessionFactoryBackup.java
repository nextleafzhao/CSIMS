package com.tjcsims.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * 使用Hibernate获取连接的工具类
 * 配置并提供对Hibernate会话的访问，绑定到当前的执行线程。遵循线程本地会话模式
 */
public class HibernateSessionFactoryBackup {

	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    private static org.hibernate.SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry; 

	static {
    	try {
    		Configuration configuration = new Configuration();
			configuration.configure("/hibernate.cfg.xml");/*配置文件*/
			serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
			
			try {
				sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
			} catch (Exception e) {
				StandardServiceRegistryBuilder.destroy(serviceRegistry);
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
    	
    	
//		//加载主配置文件及映射关系文件（只需加载一次）
//		    Configuration conf=new Configuration();
//		    conf.configure("/hibernate.cfg.xml");
//		    //获取session工厂
//		    sf=conf.buildSessionFactory();
//		    

    }
    private HibernateSessionFactoryBackup() {}
	
	/**
     * 返回线程本地会话实例。惰性初始化(Lazy initialize)
     *  @return Session
     *  @throws HibernateException
     */

    public static Session getSession() throws HibernateException {
        Session session = (Session) threadLocal.get();

		if (session == null || !session.isOpen()) {
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			session = (sessionFactory != null) ? sessionFactory.openSession(): null;
			threadLocal.set(session);
		}

        return session;
    }

	/**
     *重建hibernate会话工厂
     */
	public static void rebuildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("/hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
			try {
				sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
			} catch (Exception e) {
				StandardServiceRegistryBuilder.destroy(serviceRegistry);
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}

	/**
     *  Close the single hibernate session instance.
     *关闭单个Hibernate会话实例。
     *  @throws HibernateException
     */
    public static void closeSession() throws HibernateException {
        Session session = (Session) threadLocal.get();
        threadLocal.set(null);

        if (session != null) {
            session.close();
        }
    }

	/**
     *返回会话工厂
     */
	public static org.hibernate.SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	/**
     *  返回hibernate配置
     */
	public static Configuration getConfiguration() {
		return new Configuration();
	}

}