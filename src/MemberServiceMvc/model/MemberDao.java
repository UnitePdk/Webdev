package MemberServiceMvc.model;

import java.util.ArrayList;

public class MemberDao {
    private static MemberDao memDao=new MemberDao();
    private MemberDao(){}

    public static MemberDao getInstance(){
        return memDao;
    }

    // 회원 리스트
    ArrayList<MemberDto> memDB=new ArrayList<>();

    // 회원가입 접근 함수
    public boolean signUp(MemberDto memDto){
        memDB.add(memDto);
        return true;
    } // signUp end

    // 로그인 접근 함수
    public ArrayList<MemberDto> signIn(){
        return memDB;
    } // signIn end
}
