package com.ll.exam.app10.app.home.controller;

import com.ll.exam.app10.app.member.repository.Member;
import com.ll.exam.app10.app.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberService memberService;

    @GetMapping("/")
    public String showMain(Principal principal, Model model) {

        return "home/main";
    }


    @GetMapping("/about")
    public String showAbout(Principal principal, Model model) {

        return "home/main";
    }

    @RequestMapping("/test/upload")
    public String upload() {
        return "home/test/upload";
    }




}
