package MemberServiceMvc.controller;

import MemberServiceMvc.model.MemberDao;
import MemberServiceMvc.model.MemberDto;

import java.util.ArrayList;

public class MemberController {
    private static MemberController memCon= new MemberController();
    MemberController(){}

    public static MemberController getInstance(){
        return memCon;
    }

    // 회원가입 제어 함수
    public boolean signUp(String id, String password){
        // 객체 생성
        MemberDto memDto=new MemberDto(id, password);

        // 객체를 dao에 전달 후 결과를 반환
        return MemberDao.getInstance().signUp(memDto);
    } // signUp end

    // 로그인 제어 함수
    public ArrayList<MemberDto> signIn(){
        // dao에게 회원 정보를 요청해서 결과를 받는다
        ArrayList<MemberDto> result = MemberDao.getInstance().signIn();
        // 통과 시 회원정보를 반환
        return result;
    }
} // class end
