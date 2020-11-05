package com.gmt.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmt.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

//	int registerMember(Member member);
//
//	Member getMemberDetails(int id);
//
//	List<Member> getAllMemberDetails(int gymId);
//
//	List<Member> getAllGymMembers();
}
