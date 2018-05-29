package com.tjcsims.action;
//
//import java.util.Map;
//
//import org.apache.struts2.dispatcher.SessionMap;
//import org.apache.struts2.interceptor.ApplicationAware;
//import org.apache.struts2.interceptor.SessionAware;
//
//public class TestAction implements SessionAware,ApplicationAware {
//	private Map<String,Object> session;
//	private Map<String,Object> application;
//	private String username;
	/*可以统计在线人数但不能统计在线用户数量，即同一个用户可以同时存在于不同会话*/
//	public String execute(){
//
//		if(session.get("username")==null){
//			session.put("username", username);//当前会话
			//application.put("userid", username);
//			Integer count = (Integer) application.get("count");
//			if(count==null){count =0;}
//			count++;
//			application.put("count", count);
//			System.out.println(session.get("username").toString()+"已登录当前会话");
//			return "success";
//		}else if(username.equals(session.get("username"))){
//			System.out.println("你已登录当前会话");
//			return "success";
//		}else{
//			System.out.println("请先退出当前用户"+session.get("username").toString());
//			return "error";
//		}
//
//
//	}
//	public String logout(){
//		if(session.get("username")==null){
//			System.out.println("当前无登录用户。。。");
//			return "logout_error";
//		}else{
//		System.out.println("注销当前会话（"+session.get("username").toString()+"）。。。");
		/*Tomcat中Session的默认失效时间为30分钟*/
//		((SessionMap<String, Object>)session).invalidate();
//		Integer count = (Integer) application.get("count");
//		if(count!=null&&count>0){count--;}
//		System.out.println("count=="+count);
//		application.put("count", count);
//		return "logout";
//		}
//	}
//	
//	public void setApplication(Map<String, Object> application) {this.application = application;}
//	public void setSession(Map<String, Object> session) {this.session = session;}
//	public void setUsername(String username) {this.username = username.trim();}
//
//}
