package com.tjcsims.entity;

/**
 * Courses entity. @author MyEclipse Persistence Tools
 */

public class Courses implements java.io.Serializable {

	// Fields

	private Integer coursesId;
	private Classes classes;
	private Majors majors;
	private String coursesName;
	private short coursesType;
	private short coursesCredit;

	// Constructors

	/** default constructor */
	public Courses() {
	}

	/** full constructor */
	public Courses(Classes classes, Majors majors, String coursesName, short coursesType, short coursesCredit) {
		this.classes = classes;
		this.majors = majors;
		this.coursesName = coursesName;
		this.coursesType = coursesType;
		this.coursesCredit = coursesCredit;
	}

	// Property accessors

	public Integer getCoursesId() {
		return this.coursesId;
	}

	public void setCoursesId(Integer coursesId) {
		this.coursesId = coursesId;
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

	public String getCoursesName() {
		return this.coursesName;
	}

	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}

	public short getCoursesType() {
		return this.coursesType;
	}

	public void setCoursesType(short coursesType) {
		this.coursesType = coursesType;
	}

	public short getCoursesCredit() {
		return this.coursesCredit;
	}

	public void setCoursesCredit(short coursesCredit) {
		this.coursesCredit = coursesCredit;
	}

}