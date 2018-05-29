package com.tjcsims.entity;

/**
 * TeachersCopy entity. @author MyEclipse Persistence Tools
 */

public class TeachersCopy implements java.io.Serializable {

	// Fields

	private Integer teachersId;
	private Integer facultiesId;
	private String teachersPasswd;
	private String teachersName;
	private short teachersSex;
	private String teachersBirthday;
	private String teachersEmail;

	// Constructors

	/** default constructor */
	public TeachersCopy() {
	}

	/** full constructor */
	public TeachersCopy(Integer facultiesId, String teachersPasswd, String teachersName, short teachersSex,
			String teachersBirthday, String teachersEmail) {
		this.facultiesId = facultiesId;
		this.teachersPasswd = teachersPasswd;
		this.teachersName = teachersName;
		this.teachersSex = teachersSex;
		this.teachersBirthday = teachersBirthday;
		this.teachersEmail = teachersEmail;
	}

	// Property accessors

	public Integer getTeachersId() {
		return this.teachersId;
	}

	public void setTeachersId(Integer teachersId) {
		this.teachersId = teachersId;
	}

	public Integer getFacultiesId() {
		return this.facultiesId;
	}

	public void setFacultiesId(Integer facultiesId) {
		this.facultiesId = facultiesId;
	}

	public String getTeachersPasswd() {
		return this.teachersPasswd;
	}

	public void setTeachersPasswd(String teachersPasswd) {
		this.teachersPasswd = teachersPasswd;
	}

	public String getTeachersName() {
		return this.teachersName;
	}

	public void setTeachersName(String teachersName) {
		this.teachersName = teachersName;
	}

	public short getTeachersSex() {
		return this.teachersSex;
	}

	public void setTeachersSex(short teachersSex) {
		this.teachersSex = teachersSex;
	}

	public String getTeachersBirthday() {
		return this.teachersBirthday;
	}

	public void setTeachersBirthday(String teachersBirthday) {
		this.teachersBirthday = teachersBirthday;
	}

	public String getTeachersEmail() {
		return this.teachersEmail;
	}

	public void setTeachersEmail(String teachersEmail) {
		this.teachersEmail = teachersEmail;
	}

}