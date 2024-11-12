/*
 내용과 작성자로 구성된 게시물 100개까지 저장하는 서비스
 조건: main 함수 1개, 배열 최대 2개, 반복문 사용
 구축: 게시물 쓰기와 게시물 출력 기능 구현
*/
package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService2 {
    public static void main(String[] args) {
        // 입력 객체
        Scanner scan = new Scanner(System.in);

        String[] contents = new String[100];
        String[] writers = new String[100];

        while (true) {
            System.out.print("1. 게시물쓰기 2. 게시물출력 선택: ");
            int choose = scan.nextInt();
            if (choose == 1) { // 게시물쓰기 구현
                // 입력 받기
                System.out.println("새로운 게시물 내용: ");
                String content = scan.next();
                System.out.println("새로운 게시물 작성자: ");
                String writer = scan.next();

                // 스위치 변수
                boolean save=false;

                for (int i = 0; i < contents.length; i++) {
                    if (contents[i] == null) {
                        contents[i] = content;
                        writers[i] = writer;
                        save=true;
                        break;
                    }
                } // for end

                if (!save){
                    System.out.println("빈 공간이 없습니다.");
                } // if end

            } // if end
            else if (choose == 2) { // 게시물 출력 구현
                for (int i = 0; i < contents.length; i++) {
                    if (contents[i] != null) {
                        System.out.printf("작성자: %s, 내용: %s\n", writers[i], contents[i]);
                    }
                } // for end
            } // if end
            else { // 반복 종료
                break;
            } // else end
        } // while end
    } // main end
} // class end
