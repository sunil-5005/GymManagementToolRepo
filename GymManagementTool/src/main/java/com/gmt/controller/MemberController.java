package com.gmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gmt.entity.Member;
import com.gmt.service.MemberService;

@RestController			
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@PutMapping("/register")
	@ResponseBody
	public String registerMember() {

		System.out.println("Hey there..");
		
		int result = memberService.registerMember(new Member());

		return "Member Registration Successful";
	}
	
	@GetMapping("/get")
	public String getMemberDetails(@RequestParam int id) {
		
		Member gymMember = memberService.getMemberDetails(id);
		
		if(gymMember == null) {
			
		}
		
		System.out.println("Hey there..getMemberDetails");
		
		return gymMember.toString();
	}
}
