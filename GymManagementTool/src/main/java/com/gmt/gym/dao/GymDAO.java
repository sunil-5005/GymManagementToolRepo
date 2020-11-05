package com.gmt.gym.dao;

import java.util.List;

import com.gmt.entity.Gym;
import com.gmt.entity.Member;

public interface GymDAO {

	int registerGym(Gym gym);

	Member getMemberDetails(int id);

	List<Member> getAllMemberDetails(int gymId);

	List<Member> getAllGymMembers();
}
