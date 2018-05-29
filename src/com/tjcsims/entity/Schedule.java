package com.tjcsims.entity;

/**
 * Schedule entity. @author MyEclipse Persistence Tools
 */

public class Schedule implements java.io.Serializable {

	// Fields

	private Integer scheduleId;
	private String scheduleCampus;
	private String scheduleClassroom;
	private String scheduleSchooltime;

	// Constructors

	/** default constructor */
	public Schedule() {
	}

	/** full constructor */
	public Schedule(String scheduleCampus, String scheduleClassroom, String scheduleSchooltime) {
		this.scheduleCampus = scheduleCampus;
		this.scheduleClassroom = scheduleClassroom;
		this.scheduleSchooltime = scheduleSchooltime;
	}

	// Property accessors

	public Integer getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getScheduleCampus() {
		return this.scheduleCampus;
	}

	public void setScheduleCampus(String scheduleCampus) {
		this.scheduleCampus = scheduleCampus;
	}

	public String getScheduleClassroom() {
		return this.scheduleClassroom;
	}

	public void setScheduleClassroom(String scheduleClassroom) {
		this.scheduleClassroom = scheduleClassroom;
	}

	public String getScheduleSchooltime() {
		return this.scheduleSchooltime;
	}

	public void setScheduleSchooltime(String scheduleSchooltime) {
		this.scheduleSchooltime = scheduleSchooltime;
	}

}