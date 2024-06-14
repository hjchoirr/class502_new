package services;

import entities.BoardData;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

public class BoardListService {
    public List<BoardData> getList(){
        List<BoardData> items = IntStream.rangeClosed(1, 10).mapToObj(i -> BoardData.builder()
                .seq(i)
                .subject("제목" + i)
                .content("내용" + i)
                .poster("작성자" + i)
                .redDt(LocalDateTime.now())
                .build()).toList();
        return items;
    }
}
