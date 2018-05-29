package com.tjcsims.dao;

import com.tjcsims.entity.Teachers;

/*
 * 登录模块DAO接口
 */
public interface ILoginDao {
	
	/*
	 * 根据编号查询管教师(登录等)
	 */
	public Teachers findByCode(Integer TeacherCode)throws DaoException;
	
	

}