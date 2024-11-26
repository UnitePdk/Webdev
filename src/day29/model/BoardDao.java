package day29.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao {
    // JDBC 라이브러리 설치 - mySQL Connector/J .jar 파일을 라이브러리 추가
    // DAO에 DB연동 객체 만들기
    private Connection conn;

    // 싱글톤
    private static BoardDao boardDao = new BoardDao();

    private BoardDao() {
        //DB 연동
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1125","root", "1234");
            System.out.println("DB와 연결됨");
        } catch (ClassNotFoundException e) {
            e.getException();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static BoardDao getInstance() {
        return boardDao;
    }

    // 여러개 게시물 저장하는 리스트
    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 게시물 등록 접근 함수
    public boolean boardWrite(BoardDto boardDto) {
        boardDB.add(boardDto);
        // SQL 서명 준비 함수
        PreparedStatement ps= null;
        try {
            // SQL 작성
            ps = conn.prepareStatement("insert into board(bcontent, writer, pwd) values ('여기는 자바', '유재석', '1234')");
            // 서명한 SQL 실행
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    } // boardWrite end

    // 게시물 출력 접근 함수
    public ArrayList<BoardDto> boardPrint() {
        return boardDB;
    } // boardPrint end

} // class end