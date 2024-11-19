package day25_assign.controller;
import day25_assign.model.BoardDao;
import day25_assign.model.BoardDto;

import java.util.ArrayList;

public class BoardController {

    // 싱글톤
    private static BoardController boardController = new BoardController();

    private BoardController() {
    }

    public static BoardController getInstance() {
        return boardController;
    }

    // 게시물 등록 제어 함수
    public boolean boardWrite(String content, String writer, int pwd) {
        // 유효성 검사

        // 유효성검사 통과 했으면 서로다른 데이터를 하나(객체)로 만들기
        BoardDto boardDto = new BoardDto(content, writer, pwd);
        // 입력받은 객체를 저장하기 위해 Dao 전달하고 결과를 응답 받기
        return BoardDao.getInstance().boardWrite(boardDto);
    } // boardWrite end

    // 게시물 출력 제어 함수
    public ArrayList<BoardDto> boardPrint() {
        // dao 에게 게시물 전체출력 함수를 호출해서 결과를 받는다.
        ArrayList<BoardDto> result = BoardDao.getInstance().boardPrint();
        // 3. dao 에게 응답받은 결과를 view에 응답하기
        return result;
    } // boardPrint end
}