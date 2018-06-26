package com.tjcsims.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Teachers entity. @author MyEclipse Persistence Tools
 */

public class Teachers implements java.io.Serializable {

	// Fields

	private Integer teachersId;
	private Faculties faculties;
	private String teachersPasswd;
	private String teachersName;
	private short teachersSex;
	private String teachersBirthday;
	private String teachersEmail;
	private Set assessmentses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teachers() {
	}

	/** full constructor */
	public Teachers(Faculties faculties, String teachersPasswd, String teachersName, short teachersSex,
			String teachersBirthday, String teachersEmail, Set assessmentses) {
		this.faculties = faculties;
		this.teachersPasswd = teachersPasswd;
		this.teachersName = teachersName;
		this.teachersSex = teachersSex;
		this.teachersBirthday = teachersBirthday;
		this.teachersEmail = teachersEmail;
		this.assessmentses = assessmentses;
	}

	// Property accessors

	public Integer getTeachersId() {
		return this.teachersId;
	}

	public void setTeachersId(Integer teachersId) {
		this.teachersId = teachersId;
	}

	public Faculties getFaculties() {
		return this.faculties;
	}

	public void setFaculties(Faculties faculties) {
		this.faculties = faculties;
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

	public Set getAssessmentses() {
		return this.assessmentses;
	}

	public void setAssessmentses(Set assessmentses) {
		this.assessmentses = assessmentses;
	}

}