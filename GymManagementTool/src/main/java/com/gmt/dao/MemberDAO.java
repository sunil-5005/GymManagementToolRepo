package com.gmt.dao;

import com.gmt.dto.Member;

public interface MemberDAO {
	
	Member getMemberDetails(int id);
	int registerMember(Member member);
}
