package app.model;

public class Timer {

    private final Long nanoTime;

    public Timer() {
        this.nanoTime = System.nanoTime();
    }

    public Long getTime() {
        return nanoTime;
    }
}