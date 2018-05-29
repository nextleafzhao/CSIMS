package com.tjcsims.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Faculties entity. @author MyEclipse Persistence Tools
 */

public class Faculties implements java.io.Serializable {

	// Fields

	private Integer facultiesId;
	private Set<Teachers> teacherses = new HashSet<Teachers>(0);

	// Constructors

	/** default constructor */
	public Faculties() {
	}

	/** full constructor */
	public Faculties(Set<Teachers> teacherses) {this.teacherses = teacherses;}

	// Property accessors

	public Integer getFacultiesId() {return this.facultiesId;}

	public void setFacultiesId(Integer facultiesId) {this.facultiesId = facultiesId;}

	public Set<Teachers> getTeacherses() {return this.teacherses;}

	public void setTeacherses(Set<Teachers> teacherses) {this.teacherses = teacherses;}

}