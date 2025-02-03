//package io.goorm.mybatis.api.board.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import io.goorm.mybatis.board.model.Board;
//import io.goorm.mybatis.api.board.service.BoardService;
//
//@Controller
//@RequestMapping("/board")
//public class BoardController {
//
//	@Autowired
//	BoardService boardService;
//
//	@GetMapping("/list")
//	public String list(Model model) {
//
//		List<Board> boards = boardService.list();
//
//		model.addAttribute("title", "게시판");
//		model.addAttribute("message", "게시판 리스트");
//		model.addAttribute("boards", boards);
//
//		return "/board/list";
//	}
//}
