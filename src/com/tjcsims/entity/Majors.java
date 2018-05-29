package com.tjcsims.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Majors entity. @author MyEclipse Persistence Tools
 */

public class Majors implements java.io.Serializable {

	// Fields

	private Integer majorsId;
	private Set<Students> studentses = new HashSet<Students>(0);
	private Set<Courses> courseses = new HashSet<Courses>(0);

	// Constructors

	/** default constructor */
	public Majors() {
	}

	/** full constructor */
	public Majors(Set<Students> studentses, Set<Courses> courseses) {
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

	public Set<Students> getStudentses() {
		return this.studentses;
	}

	public void setStudentses(Set<Students> studentses) {
		this.studentses = studentses;
	}

	public Set<Courses> getCourseses() {
		return this.courseses;
	}

	public void setCourseses(Set<Courses> courseses) {
		this.courseses = courseses;
	}

}