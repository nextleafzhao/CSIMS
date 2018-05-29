package com.tjcsims.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.tjcsims.dao.BaseHibernateDAO;
import com.tjcsims.dao.DaoException;//都加上
import com.tjcsims.dao.ILoginDao;
import com.tjcsims.entity.Teachers;
/*登录接口的实现*/
public class LoginDaoImpl implements ILoginDao {

	public Teachers findByCode(Integer TeacherCode) throws DaoException {
		if(TeacherCode==null){
			return null;
		}
		
		//IBaseHibernateDAO dbdao = new BaseHibernateDAO();
		Session session=new BaseHibernateDAO().getSession();
		/*或者Session session=HibernateSessionFactory.getSession();*/
		try {
			String hql="from Teachers where teachersId=?";
			Query query=session.createQuery(hql);
			query.setInteger(0, TeacherCode);
			List<Teachers> list=query.list();
			Iterator i=list.iterator();
			if(i.hasNext()){
				Teachers t=(Teachers)i.next();  
				System.out.println(t.getTeachersName()+"存在数据库中");
				return t;
			}else{System.out.println(TeacherCode+"用户不存在");}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException("查询失败!", e);
		}finally{
			session.close();
		}
		return null;
	}

/*
	private Teachers createAdmin(ResultSet rs) throws SQLException {
		Teachers a=new Teachers();
		a.setId(rs.getInt("id"));
		a.setAdminCode(rs.getString("admin_code"));
		a.setPassword(rs.getString("password"));
		a.setName(rs.getString("name"));
		a.setTelephone(rs.getString("telephone"));
		a.setEmail(rs.getString("email"));
		a.setEnrollDate(rs.getDate("enrolldate"));
		return a;
	}
*/
/*	
	public static void main(String[] args) throws DaoException {
		Teachers a=new LoginDaoImpl().findByCode(124);
		System.out.println("用户标识:"+a.getTeachersId()+"用户名:"+a.getTeachersName()+"密码:"+a.getTeachersPasswd());

	}*/
	

}
