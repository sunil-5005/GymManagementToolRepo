package com.gmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gmt.dto.Member;
import com.gmt.service.MemberService;

@RestController			
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@PutMapping("register")
	public String registerMember() {

		System.out.println("Hey there..");

		return null;
	}
	
	@GetMapping("get")
	public String getMemberDetails(@RequestParam int id) {
		
		Member gymMember = memberService.getMemberDetails(id);
		
		if(gymMember == null) {
			
		}
		
		System.out.println("Hey there..getMemberDetails");
		
		return gymMember.toString();
	}
}
