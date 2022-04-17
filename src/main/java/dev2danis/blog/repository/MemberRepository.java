package dev2danis.blog.repository;

import dev2danis.blog.domain.Member;

import java.util.Optional;

public interface MemberRepository {
    public Member save(Member member);
    public Optional<Member> findById(String id);
}
