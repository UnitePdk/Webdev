package day22_assign;

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

    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", password=" + password +
                '}';
    }
}
