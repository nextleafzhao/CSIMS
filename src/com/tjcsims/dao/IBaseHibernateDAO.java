package com.tjcsims.dao;

import org.hibernate.Session;


/**
 * Data access interface for domain model
 * 领域模型的数据访问接口
 * @author MyEclipse Persistence Tools
 */
public interface IBaseHibernateDAO {
	public Session getSession();
	/*学生成绩维护*/
	public void queryScore();
	
	
}
/*
 * 修改个人信息
 * 学生成绩维护 * 学生成绩的录入、修改 * 查看学生各项考核内容的成绩，也可将成绩列表打印	学生分项成绩	查看学生测验的平均分，出勤
 * 查看选课学生信息	*所选课程名称的学生姓名、学号、年级等
 * 查看授课课程	内容包括课程名称、学院、校区、课程简介、课上时间、上课地点等
 * 查看学生评价	查看学生评价，含主题，内容
 * */

/*使用：
 * IBaseHibernateDAO dbdao = new BaseHibernateDAO();
 * Session session=dbdao.getSession();
 * */