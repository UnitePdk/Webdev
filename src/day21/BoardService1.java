package day21;

/*
 내용과 작성자로 구성된 게시물 3개까지 저장하는 서비스
 조건: main 함수 1개, 변수 6개, 반복문 사용
 구축: 게시물 쓰기와 게시물 출력 기능 구현
*/

import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) {
        // 입력 객체
        Scanner scan = new Scanner(System.in);

        String content1 = null;
        String content2 = null;
        String content3 = null;
        String writer1 = null;
        String writer2 = null;
        String writer3 = null;

        while (true) {
            System.out.println("1. 게시물쓰기 2. 게시물출력 선택: ");
            int choose = scan.nextInt();
            if (choose == 1) { // 게시물쓰기 구현
                // 입력 받기
                System.out.println("새로운 게시물 내용: ");
                String content=scan.next();
                System.out.println("새로운 게시물 작성자: ");
                String writer=scan.next();

                if(content1==null){ // 게시물을 작성할 공간이 있는지 체크 - null, ""
                    content1=content;
                    writer1=writer;
                } // if end
                else if (content2==null) {
                    content2=content;
                    writer2=writer;
                } // else if end
                else if (content3==null) {
                    content3=content;
                    writer3=writer;
                } // else if end
                else{
                    System.out.println("빈 공간이 없습니다.");
                } // else end
            } // if end
            else if (choose == 2) { // 게시물 출력 구현
                if(content1!=null){
                    System.out.printf("작성자: %s, 내용: %s%n", writer1, content1);
                }
                if(content2!=null){
                    System.out.printf("작성자: %s, 내용: %s%n", writer2, content2);
                }
                if(content3!=null){
                    System.out.printf("작성자: %s, 내용: %s%n", writer3, content3);
                }
            } // if end
            else{ // 반복 종료
                break;
            } // else end
        } // while end
    } // main end
} // class end
