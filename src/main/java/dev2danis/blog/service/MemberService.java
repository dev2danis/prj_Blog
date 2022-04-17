package dev2danis.blog.service;

import dev2danis.blog.domain.Member;

public interface MemberService {
    public boolean join(Member member);
    public boolean idCheck(String id);
}
