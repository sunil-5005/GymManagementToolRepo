package com.gmt.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "gymdetails")
public class Gym {
	@Id
	private int id;
	@Column
	private String name;
	@OneToMany
	List<Member> gymmembers;
}
