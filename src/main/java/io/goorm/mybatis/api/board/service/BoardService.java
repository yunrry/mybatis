package io.goorm.mybatis.api.board.service;

import io.goorm.mybatis.mapper.BoardMapper;
import io.goorm.mybatis.board.model.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public List<Board> getBoards (){
        return boardMapper.selectAll();
    }
}
