package com.codegym.StopWach;

public class StopWatch {
    private long startTime;
    private long endTime;

public void Stopwatch(){
    this.startTime = System.currentTimeMillis();

}
public void start(){
    this.startTime = System.currentTimeMillis();
}
public  void stop(){
    this.endTime = System.currentTimeMillis();
}
public long getStartTime(){
    return this.endTime - this.startTime;

}
    public static void  main (String[] args) throws InterruptedException{
    StopWatch stopwatch = new StopWatch();

        Thread thread = null;
        thread.sleep(5000);
    stopwatch.start();
    thread.sleep(2000);
    stopwatch.stop();
        System.out.println(stopwatch.getStartTime());
    }
}
