package dev2danis.blog.repository;

import dev2danis.blog.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class MemoryMemberRepositoryTest {
    @Test
    public void memoryRepositoryTest(){
        MemoryMemberRepository memoryMemberRepository = new MemoryMemberRepository();

        Member memberA = new Member();
        memberA.setId("test");

        memoryMemberRepository.save(memberA);
        Optional<Member> findMember = memoryMemberRepository.findById(memberA.getId());

        System.out.println(findMember);
        Assertions.assertThat(findMember.get().getId()).isEqualTo(memberA.getId());
    }

}
