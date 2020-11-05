package com.gmt.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gmt.entity.Member;
import com.gmt.member.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public Member getMemberDetails(int id) {
		return memberRepository.findById(id).orElse(null);
	}
	
	@Override
	public Member registerMember(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public int deleteMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Member> getGymMembers(int gymid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember(int memberid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
