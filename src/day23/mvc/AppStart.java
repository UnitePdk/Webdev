package day23.mvc;

import day23.mvc.view.BoardView;

public class AppStart {
    public static void main(String[] args) {
        // 메인 뷰 요청
        // 다른 클래스에 존재하는 함수를 호출하는 방법 1
        BoardView view=new BoardView();
        view.mainPage();
    }
}
