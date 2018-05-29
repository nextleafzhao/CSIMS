/*package com.tjcsims.action;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;
import com.tjcsims.dao.DaoException;

import com.tjcsims.entity.Teachers;
//import com.tjcsims.entity.TeachersDAO;
import com.tjcsims.impl.LoginDaoImpl;

public class TeacherRegisterAction extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 1L;

    private Integer username;//页面参数，教师编号
    private String password;//页面参数，密码
    private Map<String,Object> application;
    private Map<String,Object> session;
    @Test
    public String execute() throws DaoException{
    	System.out.println("execute");
    	//将username和password传递到dao层交给hibernate判断
    	Teachers teacher = new LoginDaoImpl().findByCode(username);
            if(teacher!=null&&teacher.getTeachersPasswd().equals(password)){
            	System.out.println("登录验证成功");
        		if(session.get("username")==null){
        			session.put("username", teacher);若登陆成功则将该user记录在当前会话中
        			System.out.println(
        					"名字"+teacher.getTeachersName()
        					+"，密码"+teacher.getTeachersPasswd()
        					+"，性别"+teacher.getTeachersSex()
        					+"，联系方式"+teacher.getTeachersEmail()
        					+"，生日"+teacher.getTeachersBirthday()
        					//+"，评论"+teacher.getAssessmentses()
        					+"，院系"+teacher.getFaculties().getFacultiesId());
        			return "success";
        		}else if(username==((Teachers) session.get("username")).getTeachersId()){
        			System.out.println("你已登录当前会话");
        			return "success";
        		}else{
        			System.out.println("先退出当前用户"+((Teachers) session.get("username")).getTeachersName()+"才能登录新用户");
        			return "fail";
        		}
            }else{
                //addActionError("用户名或密码错误");
            	System.out.println("用户名或密码错误");
                //return INPUT;
                return ERROR;
            }
    }
	public String logout(){
		if(session.get("username")==null){
			System.out.println("当前无登录用户。。。");
			return "logout_error";
		}else{
		System.out.print("注销当前会话（"+((Teachers) session.get("username")).getTeachersName()+"）");
		Tomcat中Session的默认失效时间为30分钟
		((SessionMap<String, Object>)session).invalidate();
		return "logout";
		}
	}
    public Integer getUsername() {return username;}
    public void setUsername(Integer username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public Map<String, Object> getSession() {return session;}
    public void setSession(Map<String, Object> session) {this.session = session;}
	public Map<String, Object> getApplication() {return application;}
	public void setApplication(Map<String, Object> application) {this.application = application;}

}*/