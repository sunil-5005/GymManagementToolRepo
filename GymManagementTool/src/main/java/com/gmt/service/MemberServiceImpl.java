package com.gmt.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.gmt.entity.Member;
import com.gmt.member.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	@Qualifier("com.gmt.member.dao.MemberDAOImpl")
	private MemberDAO memberDAO;
	
	@Override
	public Member getMemberDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int registerMember(Member member) {
		member = new Member();
		
		member.setFname("Sunil");
		member.setLname("Shekade");
		member.setJoinDate(LocalDate.now());
		member.setMobile("9762380704");
		
		return memberDAO.registerMember(member);
	}
	
	
}
