package com.gmt.gym.dao;

import java.util.List;

import com.gmt.entity.Member;

public interface GymDAO {

	int registerMember(Member member);

	Member getMemberDetails(int id);

	List<Member> getAllMemberDetails(int gymId);

	List<Member> getAllGymMembers();
}
