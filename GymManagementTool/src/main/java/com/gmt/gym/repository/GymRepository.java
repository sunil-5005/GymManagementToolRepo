package com.gmt.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmt.entity.Gym;


@Repository
public interface GymRepository extends JpaRepository<Gym, Integer>{

}
