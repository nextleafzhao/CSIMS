package com.tjcsims.dao;
/*
 * 
 *定义异常，用于封装DAO抛出的异常信息，便于团队合作，识别是自己抛出的异常，还是
 * 系统抛出的异常)
 */
public class DaoException extends Exception {

    /*
     * 实例化时，要求提供明确的异常信息以及原始的异常堆栈信息
     */
	public DaoException(String message, Throwable cause) {
		super(message, cause);
		
	}

	

}
