package io.library.librarymanager.members;

import io.library.librarymanager.books.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        List<Member> members = new ArrayList<>();
        memberRepository.findAll().forEach(members::add);
        return members;
    }

    public Member getMemberById(String id) {
        return memberRepository.findById(id).orElse(null);
    }

    public void addMember(Member member) {
        memberRepository.save(member);
    }

    public void updateMember(Member member) {
        memberRepository.save(member);
    }

    public void deleteMember(Member member) {
        memberRepository.delete(member);
    }

}
