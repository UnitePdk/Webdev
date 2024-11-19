package day25_assign.model;

public class BoardDto {
    private String content;
    private String writer;
    private int pwd;

    public BoardDto(String content, String writer, int pwd) {
        this.content = content;
        this.writer = writer;
        this.pwd = pwd;
    }

    public String getContent() {return content;}
    public String getWriter() {return writer;}
    public int getPwd() {return pwd;}

    public void setContent(String content) {this.content = content;}
    public void setWriter(String writer) {this.writer = writer;}
    public void setPwd(int pwd) {this.pwd = pwd;}

    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}