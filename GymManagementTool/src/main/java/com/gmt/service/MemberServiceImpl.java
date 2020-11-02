package com.gmt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gmt.dao.MemberDAO;
import com.gmt.dto.Member;

public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public Member getMemberDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
