package com.gmt.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
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
	
}
