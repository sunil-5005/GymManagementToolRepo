package com.gmt.gym.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gmt.entity.Member;

@Repository
public class GymDAOImpl implements GymDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public int registerMember(Member member) {
	//	int result = hibernateTemplate.update("insert into gymmembers(fname, lname, joindate, mobile) values(?,?,?,?)", member.getFname(), member.getLname(), member.getJoinDate(), member.getMobile());
		hibernateTemplate.save(member);
		return 0;
	}
	
	@Override
	public Member getMemberDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Member> getAllMemberDetails(int gymId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Member>	 getAllGymMembers() {
		// TODO Auto-generated method stub
		return null;
	}



}
