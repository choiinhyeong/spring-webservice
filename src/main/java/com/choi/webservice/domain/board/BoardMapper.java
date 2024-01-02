package com.choi.webservice.domain.board;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    List<BoardDto> selectBoardList(
            @Param("BoardDto") BoardDto boardDto
    );

    BoardDto selectBoard(
            @Param("boardSeq") long boardSeq
    );

    int insertBoard(
            @Param("BoardDto") BoardDto boardDto
    );

    int updateBoard(
            @Param("boardSeq") long boardSeq
    );

    int deleteBoard(
            @Param("boardSeq") long boardSeq
    );
}
