package com.gmt.member.dao;

import java.util.List;

import com.gmt.entity.Member;

public interface MemberDAO {

	int registerMember(Member member);

	Member getMemberDetails(int id);

	List<Member> getAllMemberDetails(int gymId);

	List<Member> getAllGymMembers();
}
