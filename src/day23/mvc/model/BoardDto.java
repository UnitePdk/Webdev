package day23.mvc.model;

public class BoardDto {
    private String content;
    private String writer;
    private int password;

    public BoardDto(String content, String writer, int password) {
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

}
