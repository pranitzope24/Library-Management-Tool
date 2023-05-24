package io.library.librarymanager.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("/member")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @RequestMapping("/member/{id}")
    public Member getMemberById(@PathVariable("id") String id){
        return memberService.getMemberById(id);
    }

    @PostMapping("/member")
    public void addMember(@RequestBody Member member){
        memberService.addMember(member);
    }

    @PutMapping("/member/{id}")
    public void updateMember(@RequestBody Member member){
        memberService.updateMember(member);
    }

    @DeleteMapping("/member/{id}")
    public void deleteMember(@RequestBody Member member){
        memberService.deleteMember(member);
    }

}
