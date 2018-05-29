package com.tjcsims.entity;

/**
 * Administrators entity. @author MyEclipse Persistence Tools
 */

public class Administrators implements java.io.Serializable {

	// Fields

	private String administratorsId;
	private String administratorsPasswd;
	private String administratorsRole;
	/*
	 * CDSM 所有院系专业管理的管理员
	 * CSM 所有班级课表管理的管理员
	 * CBM 所有课程和公告管理的管理员
	 * PIM 所有成绩信息管理的管理员
	 * TIM 所有教师信息管理的管理员
	 * SIMRM 所有学生信息管理的管理员
	 * */

	// Constructors

	/** default constructor */
	public Administrators() {
	}

	/** full constructor */
	public Administrators(String administratorsPasswd, String administratorsRole) {
		this.administratorsPasswd = administratorsPasswd;
		this.administratorsRole = administratorsRole;
	}

	// Property accessors

	public String getAdministratorsId() {
		return this.administratorsId;
	}

	public void setAdministratorsId(String administratorsId) {
		this.administratorsId = administratorsId;
	}

	public String getAdministratorsPasswd() {
		return this.administratorsPasswd;
	}

	public void setAdministratorsPasswd(String administratorsPasswd) {
		this.administratorsPasswd = administratorsPasswd;
	}

	public String getAdministratorsRole() {
		return this.administratorsRole;
	}

	public void setAdministratorsRole(String administratorsRole) {
		this.administratorsRole = administratorsRole;
	}

}