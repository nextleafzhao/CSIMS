package com.tjcsims.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Classes entity. @author MyEclipse Persistence Tools
 */

public class Classes implements java.io.Serializable {

	// Fields

	private Integer classesId;
	private Set studentses = new HashSet(0);
	private Set courseses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Classes() {
	}

	/** full constructor */
	public Classes(Set studentses, Set courseses) {
		this.studentses = studentses;
		this.courseses = courseses;
	}

	// Property accessors

	public Integer getClassesId() {
		return this.classesId;
	}

	public void setClassesId(Integer classesId) {
		this.classesId = classesId;
	}

	public Set getStudentses() {
		return this.studentses;
	}

	public void setStudentses(Set studentses) {
		this.studentses = studentses;
	}

	public Set getCourseses() {
		return this.courseses;
	}

	public void setCourseses(Set courseses) {
		this.courseses = courseses;
	}

}