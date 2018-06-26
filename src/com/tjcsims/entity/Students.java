package com.tjcsims.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Students entity. @author MyEclipse Persistence Tools
 */

public class Students implements java.io.Serializable {

	// Fields

	private Integer studentsId;
	private Classes classes;
	private Majors majors;
	private String studentsPasswd;
	private String studentsName;
	private short studentsSex;
	private String studentsBirthday;
	private String studentsAddress;
	private String studentsTel;
	private String studentsBeginYear;
	private Set assessmentses = new HashSet(0);
	private Set scoreses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Students() {
	}

	/** full constructor */
	public Students(Classes classes, Majors majors, String studentsPasswd, String studentsName, short studentsSex,
			String studentsBirthday, String studentsAddress, String studentsTel, String studentsBeginYear,
			Set assessmentses, Set scoreses) {
		this.classes = classes;
		this.majors = majors;
		this.studentsPasswd = studentsPasswd;
		this.studentsName = studentsName;
		this.studentsSex = studentsSex;
		this.studentsBirthday = studentsBirthday;
		this.studentsAddress = studentsAddress;
		this.studentsTel = studentsTel;
		this.studentsBeginYear = studentsBeginYear;
		this.assessmentses = assessmentses;
		this.scoreses = scoreses;
	}

	// Property accessors

	public Integer getStudentsId() {
		return this.studentsId;
	}

	public void setStudentsId(Integer studentsId) {
		this.studentsId = studentsId;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Majors getMajors() {
		return this.majors;
	}

	public void setMajors(Majors majors) {
		this.majors = majors;
	}

	public String getStudentsPasswd() {
		return this.studentsPasswd;
	}

	public void setStudentsPasswd(String studentsPasswd) {
		this.studentsPasswd = studentsPasswd;
	}

	public String getStudentsName() {
		return this.studentsName;
	}

	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}

	public short getStudentsSex() {
		return this.studentsSex;
	}

	public void setStudentsSex(short studentsSex) {
		this.studentsSex = studentsSex;
	}

	public String getStudentsBirthday() {
		return this.studentsBirthday;
	}

	public void setStudentsBirthday(String studentsBirthday) {
		this.studentsBirthday = studentsBirthday;
	}

	public String getStudentsAddress() {
		return this.studentsAddress;
	}

	public void setStudentsAddress(String studentsAddress) {
		this.studentsAddress = studentsAddress;
	}

	public String getStudentsTel() {
		return this.studentsTel;
	}

	public void setStudentsTel(String studentsTel) {
		this.studentsTel = studentsTel;
	}

	public String getStudentsBeginYear() {
		return this.studentsBeginYear;
	}

	public void setStudentsBeginYear(String studentsBeginYear) {
		this.studentsBeginYear = studentsBeginYear;
	}

	public Set getAssessmentses() {
		return this.assessmentses;
	}

	public void setAssessmentses(Set assessmentses) {
		this.assessmentses = assessmentses;
	}

	public Set getScoreses() {
		return this.scoreses;
	}

	public void setScoreses(Set scoreses) {
		this.scoreses = scoreses;
	}

}