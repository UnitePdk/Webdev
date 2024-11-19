package day25_assign.view;

import day25_assign.controller.BoardController;
import day25_assign.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    private static BoardView boardView = new BoardView();
    private BoardView(){}

    public static BoardView getInstance(){
        return boardView;
    }

    Scanner scan = new Scanner( System.in);

    public void mainPage() {
        while (true) {
            System.out.print("1.게시물등록 2.게시물출력 : ");
            int choose = scan.nextInt();
            if (choose == 1) {
                boardWrite();
            } else if (choose == 2) {
                boardPrint();
            } else {
                return;
            } // if end
        } // while end
    } // main end

    // 게시물 등록 함수
    void boardWrite(){
        // 입력
        scan.nextLine();
        System.out.print("게시물 내용: "); String content = scan.nextLine();
        System.out.print("게시물 작성자: "); String writer = scan.next();
        System.out.print("게시물 비밀번호: "); int pwd = scan.nextInt();

        // 입력받은 값을 컨트롤러에게 전달
        boolean result = BoardController.getInstance().boardWrite( content , writer , pwd );

        // 컨트롤러에게 전달후 결과를 받아 출력하기.
        if(result){System.out.println("게시물 등록 성공"); }
        else{System.out.println("게시물 등록 실패"); }
    } // boardWrite end

    // 게시물 출력 함수
    void boardPrint(){
        // 컨트롤러에게 모든 게시물정보를 요청한다.
        ArrayList<BoardDto> result  = BoardController.getInstance().boardPrint();
        // 출력
        for( int index = 0 ; index<= result.size()-1 ; index++ ){
            System.out.print(" 게시물내용: " + result.get( index ).getContent() );
            System.out.println(" 작성자: " + result.get( index ).getWriter() );
        } // for end
    } // boardPrint end
} // class end