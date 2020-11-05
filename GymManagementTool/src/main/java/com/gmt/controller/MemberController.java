package com.gmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gmt.entity.Member;
import com.gmt.member.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("/register")
	public Member registerMember(@RequestBody Member member) {

		return memberService.registerMember(member);

	}

	@GetMapping("/gymmembers/{gymid}")
	public List<Member> getGymMembersList(@PathVariable int gymid) {

		List<Member> gymMembers = memberService.getGymMembers(gymid);

		return gymMembers;
	}

	@GetMapping("/member/{memberid}")
	public Member getMemberDetails(@PathVariable int memberid) {

		Member gymMember = memberService.getMemberDetails(memberid);

		return gymMember;
	}

	@PutMapping("/update/{memberid}")
	public Member updateMember(@PathVariable int memberid) {

		return memberService.updateMember(memberid);

	}

	@DeleteMapping("/delete/{memberid}")
	public String deleteMember(@PathVariable int memberid) {

		return "redirect:/update/" + memberid;

	}

}
