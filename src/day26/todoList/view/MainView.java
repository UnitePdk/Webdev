package day26.todoList.view;
import day26.todoList.controller.ListController;
import day26.todoList.model.ListDto;

import java.util.ArrayList;
import java.util.Scanner;

public class MainView {

    private static MainView mainView = new MainView();
    private MainView(){}
    public static MainView getInstance(){
        return mainView;
    }

    Scanner scan = new Scanner(System.in);

    public void mainPage(){
        while (true) {
            System.out.println("1. 할 일 쓰기 2. 할 일 보기 : ");
            int choose = scan.nextInt();
            scan.nextLine();
            if (choose == 1) {
                listWrite();
            } else if (choose == 2) {
                listPrint();
            }
        }
    }//m
    public void listWrite() {
        System.out.print("할 일 : ");
        String content = scan.nextLine();
        System.out.print("마감일 : ");
        String deadLine = scan.nextLine();

        boolean result = ListController.getInstance().listWrite(content, deadLine);

        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

        public void listPrint() {
            ArrayList<ListDto> result = ListController.getInstance().listPrint();
            for(int i = 0; i <= result.size() - 1; i++) {
                System.out.printf("----%d번째 할 일----%n", i + 1);
                System.out.println("할 일 내용: " + result.get(i).getContent());
                System.out.println("할 일 마감 날짜: " + result.get(i).getDeadLine());
                System.out.print("할 일 상태: ");
                if(result.get(i).isFinished()){
                    System.out.println("완료");
                }
                else{
                    System.out.println("미완");
                }

            }
    }
} //c


