package day23.mvc.view;

import day23.mvc.contorller.BoardController;

import java.util.Scanner;

// view의 역할: 입력과 출력만
public class BoardView {
    Scanner scan=new Scanner(System.in);
    
    public void mainPage(){
        while(true){
            System.out.print("1. 게시물등록 2. 게시물 출력:");
            int choose=scan.nextInt();
            if(choose==1){
                
            } else if (choose==2) {
                
            } // if end
        } //while end
    } // mainPage end
    void boardWrite(){
        // 데이터 입력
        System.out.println("새로운 게시물 내용 등록: ");
        String content = scan.nextLine();
        System.out.println("작성자 등록: ");
        String writer = scan.next();
        System.out.println("비밀번호 등록: ");
        int password = scan.nextInt();

        // 입력받은 값을 컨트롤러에게 전달
        BoardController boardController=new BoardController();
        boolean result=boardController.boardWrite(content,writer,password);

        // 컨트롤러에게 전달 후 결과를 받아옴
        if(result) {
            System.out.println("게시물 등록 성공");
        }else {
            System.out.println("게시물 등록 실패");
        } // if end

    } // boardWrite end
    void boardPrint(){
        // 컨트롤러에게 모든 게시물 정보를 요청

        // 결과를 출력
    } // boardPrint end
}// class end
