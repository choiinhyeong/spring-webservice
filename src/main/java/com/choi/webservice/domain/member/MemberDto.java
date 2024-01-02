package com.choi.webservice.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {

    private long memberSeq;
    private String memberId;
    private String password;

}
