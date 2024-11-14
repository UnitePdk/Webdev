package day21;

import java.util.Scanner;

public class boardServiceTest1 {
    public static void main(String[] args) {
        // 입력 객체
        Scanner scan = new Scanner(System.in);

        Board[] boards=new Board[100];


        while (true) {
            System.out.print("1. 게시물쓰기 2. 게시물출력 선택: ");
            int choose = scan.nextInt();
            if (choose == 1) { // 게시물쓰기 구현

                // 입력 받기
                System.out.println("새로운 게시물 내용 등록: ");
                String content = scan.next();
                System.out.println("작성자 등록: ");
                String writer = scan.next();
                System.out.println("비밀번호 등록: ");
                int password = scan.nextInt();

                // 스위치 변수
                boolean save=false;

                for (int i = 0; i < boards.length; i++) {
                    if (boards[i] == null) {
                        boards[i] = new Board(content,writer,password);
                        save=true;
                        System.out.println("게시물이 저장되었습니다.");
                        break;
                    }
                } // for end

                if (!save){
                    System.out.println("빈 공간이 없습니다.");
                } // if end

            } // if end
            else if (choose == 2) { // 게시물 출력 구현
                for (int i=0; i< boards.length; i++) {
                    if (boards[i] != null) {
                        System.out.printf("작성자: %s, 내용: %s\n", boards[i].getWriter(), boards[i].getContent());
                    }
                } // for end
            } // if end
            else { // 프로그램 종료
                break;
            } // else end
        } // while end
    } // main end
} // class end
