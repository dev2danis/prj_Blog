package dev2danis.blog.service;

import dev2danis.blog.domain.Member;
import dev2danis.blog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    @Override
    public boolean join(Member member) {

        Member newMember = memberRepository.save(member);
        if (newMember.getId() == member.getId())
            return true;
        else
            return false;
    }

    @Override
    public boolean idCheck(String id) {
        Optional<Member> findMember = memberRepository.findById(id);
        if(findMember.isEmpty())
            return true;
        else
            return false;
    }
}
