package com.choi.webservice.web;

import com.choi.webservice.domain.board.BoardDto;
import com.choi.webservice.domain.board.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class WebRestController {

    private final BoardService boardService;

    @GetMapping("/home")
    public String home() {
        log.info("/home");
        return "home";
    }

    @PostMapping("/posts")
    public void insertBoard(@RequestBody BoardDto boardDto) {
        int result = boardService.insertBoard(boardDto);
    }
}
