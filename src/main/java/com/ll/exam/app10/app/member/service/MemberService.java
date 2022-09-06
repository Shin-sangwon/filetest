package com.ll.exam.app10.app.member.service;

import com.ll.exam.app10.app.member.dto.MemberJoinRequestDto;
import com.ll.exam.app10.app.member.dto.MemberResponseDto;
import com.ll.exam.app10.app.member.repository.Member;
import com.ll.exam.app10.app.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    public Long save(MemberJoinRequestDto memberJoinRequestDto) {

        return memberRepository.save(memberJoinRequestDto.toEntity()).getId();
    }

    public MemberResponseDto findById(Long id) {

        Member entity = memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 회원이 없습니다."));

        return new MemberResponseDto(entity);
    }
}
