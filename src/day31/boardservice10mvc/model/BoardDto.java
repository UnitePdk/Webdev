package day31.boardservice10mvc.model;

public class BoardDto {
    // [1] 필드
    private int num ; // 게시물 번호
    private String content; // 게시물 내용
    private String writer; // 게시물 작성자
    private int pwd; // 게시물 비밀번호

    // [2] 생성자
    // (1) 게시물 쓰기 , content , writer , pwd
    public BoardDto(String content, String writer, int pwd) {
        this.content = content; this.writer = writer;  this.pwd = pwd;
    }
    // (2) 게시물 출력 , num , content , writer
    public BoardDto(int num, String content, String writer) {
        this.num = num;  this.content = content;  this.writer = writer;
    }

    // [3] 메소드 , DTO
    public int getNum() { return num;  }
    public void setNum(int num) {  this.num = num;  }
    public String getContent() {    return content;    }
    public void setContent(String content) {  this.content = content;    }
    public String getWriter() {  return writer;   }
    public void setWriter(String writer) {    this.writer = writer;  }
    public int getPwd() {   return pwd;   }
    public void setPwd(int pwd) {  this.pwd = pwd; }

    @Override
    public String toString() {
        return "BoardDto{" +
                "num=" + num +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
} // class end