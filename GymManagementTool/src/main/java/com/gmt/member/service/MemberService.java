package com.gmt.member.service;

import java.util.List;

import com.gmt.entity.Member;

public interface MemberService {

	Member registerMember(Member member);

	Member getMemberDetails(int memberid);

	List<Member> getGymMembers(int gymid);

	int deleteMember(Member member);

	Member updateMember(int memberid);

}
