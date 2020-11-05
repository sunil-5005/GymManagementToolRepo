package com.gmt.member.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gmt.entity.Member;

@Repository
@Qualifier("com.gmt.member.dao.MemberDAOImpl")
@ComponentScan(basePackages = "org.springframework.*")
public class MemberDAOImpl implements MemberDAO {

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
