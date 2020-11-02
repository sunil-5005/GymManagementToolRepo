package com.gmt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gmt.dto.Member;

public class MemberDAOImpl implements MemberDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Member getMemberDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int registerMember(Member member) {
		int result = jdbcTemplate.update("insert into gymmembers(fname, lname, joindate, mobile) values(?,?,?,?)", member.getFname(), member.getLname(), member.getJoinDate(), member.getMobile());

		return result;
	}

}
