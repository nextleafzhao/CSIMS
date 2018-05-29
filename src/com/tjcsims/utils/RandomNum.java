package com.tjcsims.utils;

import java.util.Random;

import com.tjcsims.dao.DaoException;
import com.tjcsims.entity.Teachers;
import com.tjcsims.impl.LoginDaoImpl;
/*用于生成8位教师编号*/
public class RandomNum {
	public static Integer returnCard() throws NumberFormatException, DaoException{
		/*调用生成随机数的方法：这里以8位为例*/
		Integer cardNnumer=Integer.valueOf(getCard(8));
		//生成的随机数进入数据库中查询一下
		Teachers eCard= new LoginDaoImpl().findByCode(cardNnumer);
		if(eCard != null){
			/*如果有相同的数据*/
			return returnCard();//再次调用方法，生成一个随机数
		}else{
			return cardNnumer;
		}
	}
	/*生成n位随机数*/
	public static String getCard(int n){
		Random rand=new Random();//生成随机数
		String num="";
		for(int a=0;a<n;a++){
			/*int,范围：[0,n)*/
			num+=rand.nextInt(10);
		}
		return num;
	}
	
	
/*	
	public static void main(String[] args) throws NumberFormatException, DaoException {
		Integer cardNumber=returnCard();
	}
	*/
}