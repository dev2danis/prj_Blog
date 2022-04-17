package dev2danis.blog.controller;

import dev2danis.blog.domain.Member;
import dev2danis.blog.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public String joinPage(){
        return "/join";
    }

    @PostMapping("/member/idCheck")
    @ResponseBody
    public boolean idCheck(@RequestParam("userid") String id){
        return memberService.idCheck(id);
    }

    @PostMapping("/member/join")
    public String join(Model model, Member member){
        model.addAttribute("result", memberService.join(member));
        return "/afterJoin";
    }
}
