package com.gmt.member.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("com.gmt.member.Repository.MemberRepositoryImpl")
@ComponentScan(basePackages = "org.springframework.*")
public class MemberRepositoryImpl {
//
//	@Autowired
//	HibernateTemplate hibernateTemplate;
//
//	public int registerMember(Member member) {
//	//	int result = hibernateTemplate.update("insert into gymmembers(fname, lname, joindate, mobile) values(?,?,?,?)", member.getFname(), member.getLname(), member.getJoinDate(), member.getMobile());
//		hibernateTemplate.save(member);
//		return 0;
//	}
//	
//	@Override
//	public Member getMemberDetails(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	@Override
//	public List<Member> getAllMemberDetails(int gymId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	@Override
//	public List<Member>	 getAllGymMembers() {
//		// TODO Auto-generated method stub
//		return null;
//	}



}
