package dev2danis.blog.repository;

import dev2danis.blog.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemoryMemberRepository implements MemberRepository{
    private static final Map<Long, Member> store = new HashMap<>();
    private long sequence = 0l;

    @Override
    public Member save(Member member) {
        member.setUid(++sequence);
        store.put(member.getUid(), member);
        return store.get(member.getUid());
    }

    @Override
    public Optional<Member> findById(String id) {
        return store.values().stream()
                .filter(member -> member.getId().equals(id))
                .findAny();
    }
}
