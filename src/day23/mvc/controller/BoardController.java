package day23.mvc.controller;

import day23.mvc.model.BoardDao;
import day23.mvc.model.BoardDto;

import java.util.ArrayList;

public class BoardController {
    // ---싱글톤
    private static BoardController boardController=new BoardController();
    private BoardController(){};
    public static BoardController getInstance(){
        return boardController;
    }
    // 게시물 등록 제어 함수
    public boolean boardWrite(String content, String writer, int password) {
        // 유효성 검사
        if (writer.length() > 16 || password > 9999) { // 작성자 길이 16이하, 비밀번호 4자리 이하면 통과
            return false;
        }

        // 통과했으면 데이터를 하나의 객체로 만들기
        BoardDto boardDto = new BoardDto(content, writer, password);

        // 객체 저장하고 응답 보내기
        return BoardDao.getInstance().boardWrite(boardDto);
    } // boardWrite end

    // 게시물 출력 제어 함수
    public ArrayList<BoardDto> boardPrint() {
        // 유효성 검사
        if (BoardDao.getInstance().boardPrint().isEmpty()) { // 목록이 비었을 때
            return null;
        }
        return BoardDao.getInstance().boardPrint();
    } // boardPrint end
} // class end
