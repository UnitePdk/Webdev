package day26.todoList.model;

public class ListDto {
    private String content;
    private String deadLine;
    private boolean isFinished;

    public ListDto(String content, String deadLine) {
        this.content = content;
        this.deadLine = deadLine;
        isFinished = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDate(String deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    @Override
    public String toString() {
        return "ListDto{" +
                "content='" + content + '\'' +
                ", deadLine=" + deadLine +
                ", isFinished=" + isFinished +
                '}';
    }
}
