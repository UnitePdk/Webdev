package day23.mvc.model;

import java.util.ArrayList;

public class BoardDao {
    ArrayList<BoardDto> boardDB=new ArrayList<>();
    // 게시물 등록 접근 함수
    public boolean boardWrite(BoardDto boardDto){
        boardDB.add(boardDto);
        return true;
    } // boardWrite end
    // 게시물 출력 접근 함수
    public void boardPrint(){

    } // boardPrint end
}
