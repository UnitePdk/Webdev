package day23.mvc.contorller;

import day23.mvc.model.BoardDao;
import day23.mvc.model.BoardDto;

public class BoardController {
    // 게시물 등록 제어 함수
    public boolean boardWrite(String content, String writer, int password){
        // 유효성 검사

        // 통과했으면 데이터를 하나의 객체로 만들기
        BoardDto boardDto=new BoardDto(content,writer,password);

        // 응답 보내기
        BoardDao boardDao=new BoardDao();
        return boardDao.boardWrite(boardDto);
    } // boardWrite end
    // 게시물 출력 제어 함수
    public void boardPrint(){

    } // boardPrint end
} // class end
