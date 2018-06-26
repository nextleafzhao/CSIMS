package com.tjcsims.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Majors entity. @author MyEclipse Persistence Tools
 */

public class Majors implements java.io.Serializable {

	// Fields

	private Integer majorsId;
	private Set studentses = new HashSet(0);
	private Set courseses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Majors() {
	}

	/** full constructor */
	public Majors(Set studentses, Set courseses) {
		this.studentses = studentses;
		this.courseses = courseses;
	}

	// Property accessors

	public Integer getMajorsId() {
		return this.majorsId;
	}

	public void setMajorsId(Integer majorsId) {
		this.majorsId = majorsId;
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