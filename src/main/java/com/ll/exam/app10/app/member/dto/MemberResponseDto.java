package com.ll.exam.app10.app.member.dto;

import com.ll.exam.app10.app.member.repository.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberResponseDto {

    private String loginId;

    private String password;

    private String email;


    public MemberResponseDto(Member entity) {
        this.loginId = entity.getLoginId();
        this.password = entity.getPassword();
        this.email = entity.getEmail();
    }
}
