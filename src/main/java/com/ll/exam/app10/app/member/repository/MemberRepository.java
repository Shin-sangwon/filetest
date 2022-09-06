package com.ll.exam.app10.app.member.repository;

import com.ll.exam.app10.app.base.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {

    Member findByUsername(String username);
}
