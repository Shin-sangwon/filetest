package com.ll.exam.app10.app.member.controller;

import com.ll.exam.app10.app.member.dto.MemberJoinRequestDto;
import com.ll.exam.app10.app.member.dto.MemberResponseDto;
import com.ll.exam.app10.app.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/member")
@Controller
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String joinForm(MemberJoinRequestDto memberJoinRequestDto) {

        return "/member/joinForm";
    }

    @PostMapping("/join")
    public String join(MemberJoinRequestDto memberJoinRequestDto) {
        memberService.save(memberJoinRequestDto);

        return "/member/profile";
    }

    @GetMapping("/profile/{id}")
    public String getProfile(Model model, @PathVariable Long id) {

        model.addAttribute("member", memberService.findById(id));

        return "/member/profile";
    }
}
