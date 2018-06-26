package com.tjcsims.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.tjcsims.entity.Classes;
import com.tjcsims.entity.Majors;
import com.tjcsims.entity.StudentsDAO;
/*import com.tjcsims.entity.TeachersCopy;
import com.tjcsims.entity.TeachersCopyDAO;*/

public class ScoreAction extends ActionSupport implements SessionAware {
	/*成绩表
	 * coursesId
	 * studentsId
	 * scoresTerm
	 * scoresTotal
	 * 级联学生表，通过 studentsId
	 * studentsName
	 * studentsSex
	 * classes
	 * majors
	 * 级联课程表，通过coursesId
	 * coursesName
	 * coursesType
	 * coursesCredit
	 * */
	private Map<String,Object> session;
	/*成绩表属性*/
	private String scoresTerm;/*学期*/
	/*private float scoresPeacetime;*/
	/*private float scoresExamination;*/
	private float scoresTotal;
	
	/*学生表属性*/
	private Integer studentsId;
	private String studentsName;
	private short studentsSex;
	private Classes classes;
	private Majors majors;
	
	/*课程表属性*/
	private Integer coursesId;
	private String coursesName;
	private short coursesType;
	private short coursesCredit;/*学分*/
	
/*
<th>学生编号</th>
<th>姓名</th>
<th>性别</th>
<th>班级</th>
<th>专业</th>

<th>课程编号</th>
<th>课程名</th>
<th>课程性质</th>
<th>学分</th>
<th>学期</th>
<th>成绩</th>
*/
	@Override
	public String execute() throws Exception {
		//Students s =new Students(classes, majors, studentsPasswd, studentsName, studentsSex, studentsBirthday, studentsAddress, studentsTel, studentsBeginYear, assessmentses, scoreses);
		new StudentsDAO().save(null);
		//new TeachersCopyDAO().save(new TeachersCopy(faculties, password, teachersName, teachersSex, teachersBirthday, teachersEmail,remarks));
		return SUCCESS;
	}
	public Map<String, Object> getSession() {return session;}
	/**
	 * @return studentsId
	 */
	public Integer getStudentsId() {
		return studentsId;
	}
	/**
	 * @param studentsId 要设置的 studentsId
	 */
	public void setStudentsId(Integer studentsId) {
		this.studentsId = studentsId;
	}
	/**
	 * @return classes
	 */
	public Classes getClasses() {
		return classes;
	}
	/**
	 * @param classes 要设置的 classes
	 */
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	/**
	 * @return majors
	 */
	public Majors getMajors() {
		return majors;
	}
	/**
	 * @param majors 要设置的 majors
	 */
	public void setMajors(Majors majors) {
		this.majors = majors;
	}
	/**
	 * @return studentsName
	 */
	public String getStudentsName() {
		return studentsName;
	}
	/**
	 * @param studentsName 要设置的 studentsName
	 */
	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}
	/**
	 * @return studentsSex
	 */
	public short getStudentsSex() {
		return studentsSex;
	}
	/**
	 * @param studentsSex 要设置的 studentsSex
	 */
	public void setStudentsSex(short studentsSex) {
		this.studentsSex = studentsSex;
	}

	/**
	 * @param session 要设置的 session
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	

	
}
