package io.goorm.mybatis.board.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Board {

    private Long seq;
    private String title;
    private String contents;

    @JsonProperty("reguser")
    private String regUser;

    @JsonProperty("regdate")
    private LocalDateTime regDate;
}
