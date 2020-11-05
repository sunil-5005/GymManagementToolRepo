package com.gmt.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gymmembers")
public class Member {

	@Id
	private int id;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String mobile;
	@Column
	private int gymid;
	@Column
	private int membership_plan_id;
	@Column
	private LocalDate joinDate;
	@Column
	private LocalDate membership_enddate;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getGymid() {
		return gymid;
	}

	public void setGymid(int gymid) {
		this.gymid = gymid;
	}

	public int getMembership_plan_id() {
		return membership_plan_id;
	}

	public void setMembership_plan_id(int membership_plan_id) {
		this.membership_plan_id = membership_plan_id;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public LocalDate getMembership_enddate() {
		return membership_enddate;
	}

	public void setMembership_enddate(LocalDate membership_enddate) {
		this.membership_enddate = membership_enddate;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + ", gymid=" + gymid
				+ ", membership_plan_id=" + membership_plan_id + ", joinDate=" + joinDate + ", endDate="
				+ membership_enddate + "]";
	}

}
