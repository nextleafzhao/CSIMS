package com.tjcsims.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Teachers entity.
 */

public class Teachers implements java.io.Serializable {

	// 领域

	private Integer teachersId;
	private Faculties faculties;//所属院系	FK
	private String teachersPasswd;
	private String teachersName;
	private short teachersSex;
	private String teachersBirthday;
	private String teachersEmail;
	private Set<Assessments> assessmentses = new HashSet<Assessments>(0);

	// 构造函数

	/** default 构造函数 */
	public Teachers() {}

	/** full 构造函数 */
	public Teachers(Faculties faculties, String teachersPasswd, String teachersName, short teachersSex,
			String teachersBirthday, String teachersEmail, Set<Assessments> assessmentses) {
		this.faculties = faculties;
		this.teachersPasswd = teachersPasswd;
		this.teachersName = teachersName;
		this.teachersSex = teachersSex;
		this.teachersBirthday = teachersBirthday;
		this.teachersEmail = teachersEmail;
		this.assessmentses = assessmentses;
	}
	/** 自定义构造函数，用于教师注册 */
	public Teachers(String teachersPasswd, String teachersName, short teachersSex,String teachersBirthday, String teachersEmail) {
		this.teachersPasswd = teachersPasswd;
		this.teachersName = teachersName;
		this.teachersSex = teachersSex;
		this.teachersBirthday = teachersBirthday;
		this.teachersEmail = teachersEmail;
	}
	/** 自定义构造函数，用于教师注册 */
	public Teachers(Integer teachersId,Faculties faculties,String teachersPasswd, String teachersName, short teachersSex,String teachersBirthday, String teachersEmail) {
		this.teachersId = teachersId;
		this.faculties = faculties;
		this.teachersPasswd = teachersPasswd;
		this.teachersName = teachersName;
		this.teachersSex = teachersSex;
		this.teachersBirthday = teachersBirthday;
		this.teachersEmail = teachersEmail;
	}
	/** 自定义构造函数，用于教师注册 */
	public Teachers(Faculties faculties,String teachersPasswd, String teachersName, short teachersSex,String teachersBirthday, String teachersEmail) {
		this.faculties = faculties;
		this.teachersPasswd = teachersPasswd;
		this.teachersName = teachersName;
		this.teachersSex = teachersSex;
		this.teachersBirthday = teachersBirthday;
		this.teachersEmail = teachersEmail;
	}

	// 属性访问器

	public Integer getTeachersId() {return this.teachersId;}
	public void setTeachersId(Integer teachersId) {this.teachersId = teachersId;}
	public Faculties getFaculties() {return this.faculties;}
	public void setFaculties(Faculties faculties) {this.faculties = faculties;}
	public String getTeachersPasswd() {return this.teachersPasswd;}
	public void setTeachersPasswd(String teachersPasswd) {this.teachersPasswd = teachersPasswd;}
	public String getTeachersName() {return this.teachersName;}
	public void setTeachersName(String teachersName) {this.teachersName = teachersName;}
	public short getTeachersSex() {return this.teachersSex;}
	public void setTeachersSex(short teachersSex) {this.teachersSex = teachersSex;}
	public String getTeachersBirthday() {return this.teachersBirthday;}
	public void setTeachersBirthday(String teachersBirthday) {this.teachersBirthday = teachersBirthday;}
	public String getTeachersEmail() {return this.teachersEmail;}
	public void setTeachersEmail(String teachersEmail) {this.teachersEmail = teachersEmail;}
	public Set<Assessments> getAssessmentses() {return this.assessmentses;}
	public void setAssessmentses(Set<Assessments> assessmentses) {this.assessmentses = assessmentses;}
	/*
	public String execute(){
		//校验验证码
		
		ILoginDao dao=DaoFactory.getLoginDao();
		//查询管理员
		Admin admin=null;
		try {
			admin=dao.findByCode(adminCode);//查出用户名和哈希码
		} catch (DaoException e) {e.printStackTrace();
			//报错了，跳转到错误页面
			return "error";
		}
		//校验账号
		if(admin==null){
			//账号不存在
			errorMsg="账号不存在";
			//失败了，跳转回登录页面
			return "fail";
		}else{
			//账号正确，再校验密码
			if(!admin.getHash().equals(HashUtils.getHash1(password))){
				//密码不一致
				errorMsg="密码错误";
				//失败了，跳转回登录页面
				return "fail";
			}
			
		}	
				
		//登录成功时，将登录信息记录到session中
		//Map<String,Object> session1=ActionContext.getContext().getSession();
		//HttpSession session2=ServletActionContext.getRequest().getSession();
		session.put("admin", admin);
		//如果校验未失败，则登录成功
		return "success";
		
	}*/
}