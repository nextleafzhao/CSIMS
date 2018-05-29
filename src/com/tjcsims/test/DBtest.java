package com.tjcsims.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.tjcsims.dao.BaseHibernateDAO;
import com.tjcsims.dao.HibernateSessionFactory;
import com.tjcsims.entity.Teachers;

public class DBtest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DBtest dBtest=new DBtest();
		dBtest.test1();
		dBtest.test2();
		dBtest.test3();
		dBtest.test4();
	}
	@Test
	public void test1() {
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery("from Teachers where teachersId=123");
		List<Teachers> list=query.list();
		Iterator i=list.iterator();
		if(i.hasNext()){
			Teachers t=(Teachers)i.next();  
			System.out.print("用户名："+t.getTeachersName()+"存在");
		}else{
			System.out.println("用户不存在");
			}
		session.close();
	}
	public void test2() {
		// TODO 自动生成的方法存根
		
	}
	public void test3() {
		// TODO 自动生成的方法存根
		
	}
	public void test4() {
		// TODO 自动生成的方法存根
		
	}
	public DBtest() {}
	
}
