package com.tjcsims.dao;

import com.tjcsims.impl.LoginDaoImpl;

/*
 * DAO工厂，用于创建DAO实例
 */
public class DaoFactory {
	private static ILoginDao logindao=new LoginDaoImpl();
	//返回登录DAO接口实例
	public static ILoginDao getLoginDao(){
		return logindao;
	}
	
	
	

}
