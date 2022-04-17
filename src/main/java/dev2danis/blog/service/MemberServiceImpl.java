package dev2danis.blog.service;

import dev2danis.blog.domain.Member;
import dev2danis.blog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    //TODO
    @Override
    public boolean join(Member member) {
        return false;
    }

    @Override
    public boolean idCheck(String id) {
        return false;
    }
}
