package com.gmt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController			
public class MemberController {

	@PutMapping("register")
	public String registerMember() {

		System.out.println("Hey there..");

		return null;
	}
	
	@GetMapping("get/{name}")
	public String getMemberDetails(@RequestParam String name) {
		
		
		System.out.println("Hey there..getMemberDetails");
		
		return null;
	}
}
