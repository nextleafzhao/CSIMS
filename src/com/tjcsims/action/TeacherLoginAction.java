package com.tjcsims.action;
//import java.util.HashSet;
import java.util.Map;
//import java.util.Set;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;
import com.tjcsims.dao.DaoException;
import com.tjcsims.entity.Faculties;
import com.tjcsims.entity.Teachers;
import com.tjcsims.entity.TeachersCopy;
import com.tjcsims.entity.TeachersCopyDAO;
import com.tjcsims.entity.TeachersDAO;
//import com.tjcsims.entity.TeachersDAO;
import com.tjcsims.impl.LoginDaoImpl;
import com.tjcsims.utils.RandomNum;

public class TeacherLoginAction extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 1L;

    private Integer username;//页面参数，教师编号
    private String teachersName;//页面参数，教师名字
    private Faculties facultie;//学院 FK
    private Integer faculties;//页面参数，学院id FK
    private short teachersSex;//页面参数，教师性别
    private String teachersEmail;//页面参数，电子邮箱
    private String teachersBirthday;//页面参数，出生日期
    private String remarks;//页面参数，备注
    
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
        			session.put("username", teacher);/*若登陆成功则将该user记录在当前会话中*/
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
		/*Tomcat中Session的默认失效时间为30分钟*/
		((SessionMap<String, Object>)session).invalidate();
		return "logout";
		}
	}
	
	public String register() {
/*
 *
	Faculties faculties;//所属院系	FK
	String teachersPasswd;
	String teachersName;
	short teachersSex;
	String teachersBirthday;
	String teachersEmail;
*/
/*		try {
			new TeachersDAO().save(new Teachers(RandomNum.returnCard(),facultie,password, teachersName, teachersSex, teachersBirthday, teachersEmail));
		} catch (NumberFormatException e) {e.printStackTrace();} catch (DaoException e) {e.printStackTrace();}
*/
		/*审核通过的插入语句*/
		new TeachersDAO().save(new Teachers(facultie,password, teachersName, teachersSex, teachersBirthday, teachersEmail));
		
		/*插入临时表*/
		new TeachersCopyDAO().save(new TeachersCopy(faculties, password, teachersName, teachersSex, teachersBirthday, teachersEmail));
		
		
		System.out.println("注册的--性别："+teachersSex+"学院："+facultie.getFacultiesId());
		
		return SUCCESS;
	}
	
    public Integer getUsername() {return username;}
    public void setUsername(Integer username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public Map<String, Object> getSession() {return session;}
    public void setSession(Map<String, Object> session) {this.session = session;}
	public Map<String, Object> getApplication() {return application;}
	public void setApplication(Map<String, Object> application) {this.application = application;}
	public String getName() {return teachersName;}
	public void setName(String name) {this.teachersName = name;}
	public String getTeachersName() {return teachersName;}
	public void setTeachersName(String teachersName) {this.teachersName = teachersName;}
	public short getTeachersSex() {return teachersSex;}
	public void setTeachersSex(short teachersSex) {this.teachersSex = teachersSex;}
	public String getTeachersEmail() {return teachersEmail;}
	public void setTeachersEmail(String teachersEmail) {this.teachersEmail = teachersEmail;}
	
	public String getTeachersBirthday() {return teachersBirthday;}
	
	public void setTeachersBirthday(String teachersBirthday) {this.teachersBirthday = teachersBirthday;}
	
	public String getRemarks() {return remarks;}
	public void setRemarks(String remarks) {this.remarks = remarks;}
	
	
	public Faculties getFacultie() {return facultie;}
	public void setFacultie(Faculties facultie) {
		//Set<Teachers> teacherses = new HashSet<Teachers>(0);
		//Teachers newteacher=new Teachers(password, teachersName, teachersSex, teachersBirthday, teachersEmail);
		//teacherses.add(newteacher);
		facultie.setFacultiesId(faculties);
		//facultie.setTeacherses(teacherses);
		this.facultie = facultie;
		}
	
	public Integer getFaculties() {return faculties;}
	public void setFaculties(Integer faculties) {
		this.faculties = faculties;
		setFacultie(new Faculties());
		}

}