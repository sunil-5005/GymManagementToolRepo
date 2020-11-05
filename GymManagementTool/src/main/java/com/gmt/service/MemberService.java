package com.gmt.service;

import com.gmt.entity.Member;

public interface MemberService {
	
	Member getMemberDetails(int id);
	int registerMember(Member member);
}
