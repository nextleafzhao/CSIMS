package com.tjcsims.entity;

/**
 * Scores entity. @author MyEclipse Persistence Tools
 */

public class Scores implements java.io.Serializable {

	// Fields

	private Integer scoresId;
	private Students students;
	private Courses courses;
	private String scoresTerm;
	private float scoresPeacetime;
	private float scoresExamination;
	private float scoresTotal;

	// Constructors

	/** default constructor */
	public Scores() {
	}

	/** full constructor */
	public Scores(Students students, Courses courses, String scoresTerm, float scoresPeacetime, float scoresExamination,
			float scoresTotal) {
		this.students = students;
		this.courses = courses;
		this.scoresTerm = scoresTerm;
		this.scoresPeacetime = scoresPeacetime;
		this.scoresExamination = scoresExamination;
		this.scoresTotal = scoresTotal;
	}

	// Property accessors

	public Integer getScoresId() {
		return this.scoresId;
	}

	public void setScoresId(Integer scoresId) {
		this.scoresId = scoresId;
	}

	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public Courses getCourses() {
		return this.courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public String getScoresTerm() {
		return this.scoresTerm;
	}

	public void setScoresTerm(String scoresTerm) {
		this.scoresTerm = scoresTerm;
	}

	public float getScoresPeacetime() {
		return this.scoresPeacetime;
	}

	public void setScoresPeacetime(float scoresPeacetime) {
		this.scoresPeacetime = scoresPeacetime;
	}

	public float getScoresExamination() {
		return this.scoresExamination;
	}

	public void setScoresExamination(float scoresExamination) {
		this.scoresExamination = scoresExamination;
	}

	public float getScoresTotal() {
		return this.scoresTotal;
	}

	public void setScoresTotal(float scoresTotal) {
		this.scoresTotal = scoresTotal;
	}

}