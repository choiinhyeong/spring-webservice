package com.choi.webservice.domain.board;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity // 테이블과 링크될 클래스임을 나타냄
public class BoardDto {

    @Id
    @GeneratedValue
    private Long boardNo;
    private String title;
    private String content;
    private String author;
    private String status;
    private String regId;
    private Timestamp regDt;
    private String mdfId;
    private Timestamp mdfDt;

}
