package MemberServiceMvc;

import MemberServiceMvc.view.BoardView;
import MemberServiceMvc.view.MemberView;

public class App {
    public static void main(String[] args) {
        if(MemberView.getInstance().loginPage()){
            BoardView.getInstance().mainPage();
        }
    }
}
