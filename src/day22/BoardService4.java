package day22;

import java.util.Scanner;

// 가변길이 배열 직접 만들기
public class BoardService4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        Board[] boardList= null;

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
                
                // 새로운 배열 생성
                size++;
                Board[] newBoardList=new Board[size];
                
                // 배열 복사
                if(size!=1){
                    for (int i=0; i<boardList.length; i++){
                        newBoardList[i]=boardList[i];
                    }
                }

                // 마지막 인덱스에 새로운 객체 등록하기
                newBoardList[size-1]=board;

                // 새로운 배열을 기존 배열에 대입
                boardList=newBoardList;

            } // if end
            else if (choose == 2) { // 존재하는 게시물 모두 출력
                for(int i=0; i<boardList.length; i++){

                        System.out.printf("작성자: %s 내용: %s\n", boardList[i].writer,boardList[i].content);

                } // for end
            } //else if end
        } // while end
    } // main end
} // class end
