package com.choi.webservice.domain.board;

import com.choi.webservice.common.CommonResponse;
import com.choi.webservice.common.CommonUtils;
import com.choi.webservice.common.annotation.TraceLog;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@TraceLog
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public CommonResponse selectBoardList(BoardDto boardDto) {
        List<BoardDto> items = boardService.selectBoardist(boardDto);
        return new CommonResponse.Builder().addItems(items).build();
    }

    @GetMapping("/{boardSeq}")
    public CommonResponse selectBoardList(@PathVariable("boardSeq") long boardSeq) {
        BoardDto item = boardService.selectBoard(boardSeq);
        return new CommonResponse.Builder().addData("item", item).build();
    }

    @PostMapping
    public CommonResponse insertBoard(BoardDto boardDto) {
        int result = boardService.insertBoard(boardDto);
        return new CommonResponse.Builder().addDataResultCode(CommonUtils.getCommonResultCode(result))
                .addData("boardSeq", boardDto.getBoardSeq())
                .build();
    }

    @PatchMapping("/{boardSeq}")
    public CommonResponse updateBoard(@PathVariable("boardSeq") long boardSeq) {
        int result = boardService.updateBoard(boardSeq);
        return new CommonResponse.Builder().addDataResultCode(CommonUtils.getCommonResultCode(result))
                .addData("boardSeq", boardSeq)
                .build();
    }

    @DeleteMapping("/{boardSeq}")
    public CommonResponse deleteBoard(@PathVariable("boardSeq") long boardSeq) {
        int result = boardService.deleteBoard(boardSeq);
        return new CommonResponse.Builder().addDataResultCode(CommonUtils.getCommonResultCode(result))
                .addData("boardSeq", boardSeq)
                .build();
    }

}

