package com.ll.exam.app10.app.member.dto;

import com.ll.exam.app10.app.member.repository.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberJoinRequestDto {

    private String loginId;

    private String password;

    private String email;

    @Builder
    public MemberJoinRequestDto(String loginId, String password, String email) {
        this.loginId = loginId;
        this.password = password;
        this.email = email;
    }

    public Member toEntity() {
        return Member.builder()
                .loginId(loginId)
                .email(email)
                .password(password)
                .build();
    }
}
