package com.tjcsims.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;/*用于控制事务*/
import org.hibernate.cfg.Configuration;


/**
 * 
 * @author SPL
 * 使用Hibernate获取连接的工具类
 *
 */
public class HibernateUtil {
       private static SessionFactory sf;
       private static ThreadLocal<Session> tl=new ThreadLocal<Session>();
       static{
    		//加载主配置文件及映射关系文件（只需加载一次）
   		    Configuration conf=new Configuration();
   		    conf.configure("/hibernate.cfg.xml");
   		    //获取session工厂
   		    sf=conf.buildSessionFactory();
       }
       /**
        * 获取连接
        * @return
        */
       public static Session getSession(){
    	   //取出当前线程的session
    	   Session session=tl.get();
    	   if(session==null){
    		  //如果取到的session为空，则初始化
    		  session=sf.openSession();
    		  //将初始化的session放入ThreadLocal中
    		  //key默认是当前的线程名，value是session
    		  tl.set(session);
    	  }
    	  return session;
       }
       /**
        * 关闭连接
        */
       public static void close(){
    	   //取出当前线程的session
    	   Session session=tl.get();
    	   if(session!=null){
    		   //关闭连接
    		   session.close();
    		   //将连接从ThreadLocal中移除
    		   tl.remove();
    	   }
       }
       public static void main(String[] args) {
	       Session session=HibernateUtil.getSession();
	       System.out.println(session);
	       HibernateUtil.close();
	}
}
