package com.tjcsims.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.tjcsims.dao.BaseHibernateDAO;
import com.tjcsims.dao.HibernateSessionFactory;
import com.tjcsims.entity.Scores;
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
	@Test
	public void test2() {
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery("from Scores");
		List<Scores> list=query.list();
		Iterator i=list.iterator();
		if(i.hasNext()){
			Scores t=(Scores)i.next();  
			System.out.println(
					"学号"
					+t.getStudents().getStudentsId()
					+"，姓名"
					+t.getStudents().getStudentsName()
					+ "，性别"
					+t.getStudents().getStudentsSex()
					+ "，班级编号"
					+t.getStudents().getClasses().getClassesId()
					+ "，专业编号"
					+t.getStudents().getMajors().getMajorsId()
					+ "，课程代码"
					+t.getCourses().getCoursesId()
					+ "，课程名"
					+t.getCourses().getCoursesName()
					+ "，课程性质"
					+t.getCourses().getCoursesType()
					+ "，学分"
					+t.getCourses().getCoursesCredit()
					+ "，学期"
					+t.getScoresTerm()
					+"，总分："
					+t.getScoresTotal());
			
		}else{
			System.out.println("不存在");
			}
		session.close();
	}
	public void test3() {
		// TODO 自动生成的方法存根
		
	}
	public void test4() {
		// TODO 自动生成的方法存根
		
	}
	public DBtest() {}
	
}
