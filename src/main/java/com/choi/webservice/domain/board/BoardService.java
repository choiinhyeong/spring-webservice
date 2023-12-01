package com.choi.webservice.domain.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardMapper boardMapper;

    public List<BoardDto> selectBoardist(BoardDto boardDto) {
        return boardMapper.selectBoardList(boardDto);
    }

    public BoardDto selectBoard(long boardNo) {
        return boardMapper.selectBoard(boardNo);
    }

    public int insertBoard(BoardDto boardDto) {
        return boardMapper.insertBoard(boardDto);
    }

    public int updateBoard(long boardNo) {
        return boardMapper.updateBoard(boardNo);
    }

    public int deleteBoard(long boardNo) {
        return boardMapper.deleteBoard(boardNo);
    }
}
