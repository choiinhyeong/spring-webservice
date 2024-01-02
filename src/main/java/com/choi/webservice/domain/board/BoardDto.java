package com.choi.webservice.domain.board;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class BoardDto {

    private Long boardSeq;
    private String title;
    private String content;
    private String author;
    private String status;
    private String regId;
    private Timestamp regDt;
    private String mdfId;
    private Timestamp mdfDt;

}
