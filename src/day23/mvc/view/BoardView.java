package day23.mvc.view;

import day23.mvc.controller.BoardController;
import day23.mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

// view의 역할: 입력과 출력만
public class BoardView {

    //---싱글톤
    private static BoardView boardView=new BoardView();
    private BoardView(){}; // 외부 생성 차단
    public static BoardView getInstance(){
        return boardView;
    }
    //

    Scanner scan = new Scanner(System.in);

    public void mainPage() {
        while (true) {
            System.out.print("1. 게시물등록 2. 게시물 출력:");
            int choose = scan.nextInt();
            scan.nextLine();
            if (choose == 1) {

                boardWrite();

            } else if (choose == 2) {

                boardPrint();

            } // if end
        } //while end
    } // mainPage end

    void boardWrite() {
        // 데이터 입력
        System.out.println("새로운 게시물 내용 등록: ");
        String content = scan.nextLine();
        System.out.println("작성자 등록: ");
        String writer = scan.next();
        System.out.println("비밀번호 등록: ");
        int password = scan.nextInt();

        // 입력받은 값을 컨트롤러에게 전달
        boolean result = BoardController.getInstance().boardWrite(content, writer, password);

        // 컨트롤러에게 전달 후 결과를 받아옴
        if (result) {
            System.out.println("게시물 등록 성공");
        } else {
            System.out.println("게시물 등록 실패");
        } // if end

    } // boardWrite end

    void boardPrint() {
        // 컨트롤러에게 모든 게시물 정보를 요청
        ArrayList<BoardDto> boardList = BoardController.getInstance().boardPrint();

        // 리스트가 비었을 때
        if (boardList == null) {
            System.out.println("게시물이 존재하지 않습니다.");
            return;
        }
        // 결과를 출력
        for (int i = 0; i < boardList.size(); i++) {
            System.out.printf("작성자: %s, 내용: %s\n", boardList.get(i).getWriter(), boardList.get(i).getContent());
        } // for end
    } // boardPrint end
} // class end
