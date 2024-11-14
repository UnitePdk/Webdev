package day23;

public class Board {
    private String content;
    private String writer;
    private int password;

    public Board(String content, String writer, int password) {
        this.content = content;
        this.writer = writer;
        this.password = password;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public int getPassword() {
        return password;
    }

    public void setter(String content,String writer,int password) {
        this.content = content;
        this.writer = writer;
        this.password = password;
    }

    @Override // 함수 재정의 - 상위클래스(Object에 이미 있는 함수를 재정의)
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", password=" + password +
                '}';
    }
}
