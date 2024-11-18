package MemberServiceMvc.view;

import MemberServiceMvc.controller.MemberController;
import MemberServiceMvc.model.MemberDto;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MemberView {
    private static MemberView memView=new MemberView();
    private MemberView(){}

    public static MemberView getInstance(){
        return memView;
    }

    Scanner scan=new Scanner(System.in);
    
    // 로그인 판정 변수
    boolean login=false;

    public boolean loginPage(){
        while(!login){
            System.out.println("1. 회원가입 2. 로그인");
            int choose=scan.nextInt();
            scan.nextLine();

            if(choose==1){

                signUp();

            }
            else if(choose==2){

                signIn();

            } // if end
        } // while end
        // 로그인 성공 시 App으로 true를 반환함
        return true;
    } // main end

    // 회원가입 함수
    void signUp(){
        // 아이디 비밀번호 입력
        System.out.println("아이디 등록: ");
        String id=scan.nextLine();
        System.out.println("비밀번호 등록: ");
        String password=scan.nextLine();

        // 컨트롤러에게 전달
        boolean result= MemberController.getInstance().signUp(id,password);

        // 결과에 따라 안내 출력
        if(result) {
            System.out.println("회원가입 성공");
        }
        else{
            System.out.println("회원가입 실패");
        } // if end
    } // signUp end

    // 로그인 함수
    void signIn(){
        // 로그인 정보 입력
        System.out.println("아이디 입력: ");
        String id=scan.nextLine();
        System.out.println("비밀번호 입력: ");
        String password=scan.nextLine();

        // 컨트롤러에게 회원 정보를 요청
        ArrayList<MemberDto> list=MemberController.getInstance().signIn();

        // 로그인 판정 변수
        boolean idCheck=false;
        boolean pwCheck=false;

        // 아이디 비밀번호 비교
        for(int i=0; i<list.size(); i++){
            if(Objects.equals(id, list.get(i).getId())){
                idCheck=true;
            }
            if(Objects.equals(password, list.get(i).getPassword())){
                pwCheck=true;
            }
        } // for end

        // 로그인 판정
        if(idCheck&&pwCheck){
            login=true;
            System.out.println("로그인 성공");
        } else if (!idCheck) {
            System.out.println("아이디를 찾을 수 없습니다.");
        } else if (!pwCheck) {
            System.out.println("비밀번호가 일치하지 않습니다.");
        } // if end
    } // signIn end
} // class end
