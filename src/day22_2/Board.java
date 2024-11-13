package day22_2;

public class Board {
    private String content;
    private String writer;
    private int password;

    public Board() {}

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

}
