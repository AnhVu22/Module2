package ss04_class_java.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    long getStartTime() {
        return this.startTime;
    }
    long setStartTime() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }
    long getEndTime() {
        return this.endTime;
    }
    void start() {
        this.startTime = System.currentTimeMillis();
    }
    void end() {
        this.endTime = System.currentTimeMillis();
    }
    long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
