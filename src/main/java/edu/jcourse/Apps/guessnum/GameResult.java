package edu.jcourse.Apps.guessnum;

public class GameResult {
    private String name;
    private Integer triesCount;
    private long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Integer getTriesCount() {
        return triesCount;
    }

    public void setTriesCount(Integer triesCount) {
        this.triesCount = triesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
