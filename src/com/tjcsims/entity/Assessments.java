package com.tjcsims.entity;

/**
 * Assessments entity. @author MyEclipse Persistence Tools
 */

public class Assessments implements java.io.Serializable {

	// Fields

	private Integer assessmentsId;
	private Students students;
	private Teachers teachers;
	private String assessmentsContent;
	private String assessmentsReply;
	private String assessmentsTime;

	// Constructors

	/** default constructor */
	public Assessments() {
	}

	/** full constructor */
	public Assessments(Students students, Teachers teachers, String assessmentsContent, String assessmentsReply,
			String assessmentsTime) {
		this.students = students;
		this.teachers = teachers;
		this.assessmentsContent = assessmentsContent;
		this.assessmentsReply = assessmentsReply;
		this.assessmentsTime = assessmentsTime;
	}

	// Property accessors

	public Integer getAssessmentsId() {
		return this.assessmentsId;
	}

	public void setAssessmentsId(Integer assessmentsId) {
		this.assessmentsId = assessmentsId;
	}

	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public Teachers getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}

	public String getAssessmentsContent() {
		return this.assessmentsContent;
	}

	public void setAssessmentsContent(String assessmentsContent) {
		this.assessmentsContent = assessmentsContent;
	}

	public String getAssessmentsReply() {
		return this.assessmentsReply;
	}

	public void setAssessmentsReply(String assessmentsReply) {
		this.assessmentsReply = assessmentsReply;
	}

	public String getAssessmentsTime() {
		return this.assessmentsTime;
	}

	public void setAssessmentsTime(String assessmentsTime) {
		this.assessmentsTime = assessmentsTime;
	}

}