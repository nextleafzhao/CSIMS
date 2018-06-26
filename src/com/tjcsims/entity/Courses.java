package com.tjcsims.entity;

import java.util.HashSet;
import java.util.Set;

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
	private Set scoreses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Courses() {
	}

	/** full constructor */
	public Courses(Classes classes, Majors majors, String coursesName, short coursesType, short coursesCredit,
			Set scoreses) {
		this.classes = classes;
		this.majors = majors;
		this.coursesName = coursesName;
		this.coursesType = coursesType;
		this.coursesCredit = coursesCredit;
		this.scoreses = scoreses;
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

	public Set getScoreses() {
		return this.scoreses;
	}

	public void setScoreses(Set scoreses) {
		this.scoreses = scoreses;
	}

}