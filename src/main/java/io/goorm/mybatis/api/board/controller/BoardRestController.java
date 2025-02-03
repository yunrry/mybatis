package io.goorm.mybatis.api.board.controller;

import io.goorm.mybatis.api.board.service.BoardService;
import io.goorm.mybatis.board.model.Board;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class BoardRestController {

    @Autowired
    private BoardService boardService;

    @GetMapping("")
    public String index() {
        return "api index";
    }

    @GetMapping("/boards")
    public List<Board> list() {

        List<Board> list = boardService.getBoards();

        log.debug("list size : " + list.size());
        log.debug("test");
        return list;
    }

//    @GetMapping("/boards/{seq}")
//    public Board get(@PathVariable Long seq) {
//        log.debug("seq : " + seq);
//        return boardService.getBoardById(seq);
//    }
//
//    @PostMapping("/boards")
//    public int post(@RequestBody Board board) {
//        log.debug("title : " + board.getTitle());
//        log.debug("contents : " + board.getContents());
//        log.debug("reguser : " + board.getRegUser());
//
//        return boardService.createBoard(board);
//    }
//
//    @PutMapping("/boards/{seq}")
//    public int put(@PathVariable Long seq, @RequestBody Board board) {
//        log.debug("seq : " + seq);
//        log.debug("title : " + board.getTitle());
//        log.debug("contents : " + board.getContents());
//        log.debug("reguser : " + board.getRegUser());
//
//        return boardService.updateBoard(board);
//    }
//
//    @DeleteMapping("/boards/{seq}")
//    public boolean delete(@PathVariable Long seq) {
//        log.debug("seq : " + seq);
//
//        return boardService.deleteBoard(seq);
//    }



}
