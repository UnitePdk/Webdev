package day25_assign.model;

import java.io.*;
import java.util.ArrayList;

public class BoardDao {

    // 싱글톤
    private static BoardDao boardDao = new BoardDao();

    private BoardDao() {
    }

    public static BoardDao getInstance() {
        return boardDao;
    }

    // 여러개 게시물 저장하는 리스트
    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 게시물 등록 접근 함수
    public boolean boardWrite(BoardDto boardDto) {
        boardDB.add(boardDto);
        fileSave();
        return true;
    } // boardWrite end

    // 게시물 출력 접근 함수
    public ArrayList<BoardDto> boardPrint() {
        fileLoad();
        return boardDB;
    } // boardPrint end

    // 게시물을 파일에 저장
    public void fileSave() {
        // 배열을 하나의 문자열로 표현

        //임의의 문자열 변수 선언
        String outStr = "";
        // 반복문을 이용하여 모든 게시물 순회
        for (int i = 0; i < boardDB.size(); i++) {
            BoardDto boardDto = boardDB.get(i);

            // 객체의 필드 값 출력 후 사이에 ,쉼표로 구분하여 csv 파일로 변환
            outStr += boardDto.getContent() + "," + boardDto.getWriter() + "," + boardDto.getPwd() + "\n";
        }
        System.out.println(outStr);

        // - try{}catch(){} : try{} 에서 예상치 못한 예외가 발생 했을때 지정된 catch 코드로 흐름을 이동하는 문법
        try {
            // 파일 출력 객체 생성
            FileOutputStream outputStream = new FileOutputStream("./src/day25_assign/data.txt");

            // 파일 출력 객체를 이용한 바이트 쓰기/내보내기
            outputStream.write(outStr.getBytes()); // 위에서 객체들을 모두 CSV 형식으로 변환된 문자열를 바이트로 변환

            System.out.println("[파일 저장 성공]");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } // try end
    } // fileSave end

    // 파일의 게시물을 가져오는 함수
    public void fileLoad() {
        try {
            // 입력 객체 생성
            FileInputStream inputStream = new FileInputStream("./src/day25_assign/data.txt");

            // 파일 용량만큼 바이트 배열 선언
            File file = new File("./src/day25_assign/data.txt");
            byte[] bytes = new byte[(int) file.length()];

            // 파일 입력 객체를 이용하여 파일 읽어서 바이트 배열 저장
            inputStream.read(bytes);

            // 읽어온 바이트 배열을 문자열로 변환
            String inStr = new String(bytes);
            System.out.println(inStr);

            // 활용과제 : 파일로 부터 읽어온 문자열의 게시물 정보들을 다시 ArrayList<BoardDto> boardDB 에 저장하시오.

            // 한 줄씩 나눠서 문자열 배열로 변환
            String[] row = inStr.split("\n");

            // 임시로 저장할 게시물 리스트 배열 선언
            ArrayList<BoardDto> list = new ArrayList<>();

            for(int i=0 ; i<row.length; i++){
                // 각 줄을 ,쉼표 단위로 나눠서 데이터의 배열로 변환
                String[] arr = row[i].split(",");
                // 한 줄의 데이터들로 임시 객체 생성
                BoardDto board= new BoardDto(arr[0],arr[1],Integer.parseInt(arr[2]));
                // 객체를 임시 배열에 저장
                list.add(board);
            } // for end

            // 데이터베이스에 임시 배열을 대입
            boardDB=list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } // try end
    } // fileLoad end
} // class end