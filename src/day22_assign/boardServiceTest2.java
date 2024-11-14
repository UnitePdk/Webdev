package day22_assign;

import day23.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class boardServiceTest2 {
    public static void main(String[] args) {
        // 입력 객체
        Scanner scan = new Scanner(System.in);

        // ArrayList로 리스트 생성
        ArrayList<Board> boardList = new ArrayList<>();


        while (true) {
            System.out.print("1. 게시물쓰기 2. 게시물출력 선택: ");
            int choose = scan.nextInt();
            if (choose == 1) { // 게시물쓰기 구현

                // 데이터 입력 받기
                scan.nextLine();
                System.out.println("새로운 게시물 내용 등록: ");
                String content = scan.nextLine();
                System.out.println("작성자 등록: ");
                String writer = scan.next();
                System.out.println("비밀번호 등록: ");
                int password = scan.nextInt();

                // 생성자를 통해 객체 생성
                Board board = new Board(content, writer, password);

                // 리스트에 객체 추가
                boardList.add(board);

            } // if end
            else if (choose == 2) { // 게시물 출력 구현
                for (int i = 0; i < boardList.size(); i++) {
                    System.out.printf("작성자: %s, 내용: %s\n", boardList.get(i).getWriter(), boardList.get(i).getContent());
                } // for end
            } // else if end
            else { // 프로그램 종료
                break;
            } // else end
        } // while end
    } // main end
} // class end
