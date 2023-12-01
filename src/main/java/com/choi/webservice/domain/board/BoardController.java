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

    @GetMapping("/{boardNo}")
    public CommonResponse selectBoardList(@PathVariable("boardNo") long boardNo) {
        BoardDto item = boardService.selectBoard(boardNo);
        return new CommonResponse.Builder().addData("item", item).build();
    }

    @PostMapping
    public CommonResponse insertBoard(BoardDto boardDto) {
        int result = boardService.insertBoard(boardDto);
        return new CommonResponse.Builder().addDataResultCode(CommonUtils.getCommonResultCode(result))
                .addData("boardNo", boardDto.getBoardNo())
                .build();
    }

    @PatchMapping("/{boardNo}")
    public CommonResponse updateBoard(@PathVariable("boardNo") long boardNo) {
        int result = boardService.updateBoard(boardNo);
        return new CommonResponse.Builder().addDataResultCode(CommonUtils.getCommonResultCode(result))
                .addData("boardNo", boardNo)
                .build();
    }

    @DeleteMapping("/{boardNo}")
    public CommonResponse deleteBoard(@PathVariable("boardNo") long boardNo) {
        int result = boardService.deleteBoard(boardNo);
        return new CommonResponse.Builder().addDataResultCode(CommonUtils.getCommonResultCode(result))
                .addData("boardNo", boardNo)
                .build();
    }

}

