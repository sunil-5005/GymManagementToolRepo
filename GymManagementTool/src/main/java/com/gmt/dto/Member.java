package com.gmt.dto;

import java.time.LocalDate;

public class Member {
	
	private int id;
	private String fname;
	private String lname;
	private LocalDate joinDate;
	private String mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", fname=" + fname + ", lname=" + lname + ", joinDate=" + joinDate + ", mobile="
				+ mobile + "]";
	}
	
	
}

