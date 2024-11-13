package day22;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList로 수정
public class BoardService5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ArrayList
        ArrayList<Board> boardList = new ArrayList<>();

        while (true) {
            System.out.print("1. 글쓰기 2. 글출력: ");
            int choose = scan.nextInt();

            if (choose == 1) { // 게시물 등록

                scan.nextLine(); // 의미 없는 nextLine() 하나 추가
                System.out.print("내용: ");
                String content = scan.nextLine();
                // nextLine() 사용시 주의: nextLine() 앞에 또다른 next--()가 존재하면 엔터 인식해서 씹힘

                System.out.print("작성자: ");
                String writer = scan.next();

                System.out.print("비밀번호: ");
                int pwd = scan.nextInt();

                // 객체 생성
                Board board = new Board();
                board.content = content;
                board.writer = writer;
                board.pwd = pwd;

                boardList.add(board);

            } // if end
            else if (choose == 2) { // 존재하는 게시물 모두 출력
                for (int i = 0; i < boardList.size(); i++) {
                    System.out.printf("작성자: %s 내용: %s\n", boardList.get(i).writer, boardList.get(i).content);
                } // for end
            } //else if end
        } // while end
    } // main end
} // class end
