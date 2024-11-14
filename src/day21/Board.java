package day21;

public class Board {
    private final String content;
    private final String writer;
    private final int password;

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
}