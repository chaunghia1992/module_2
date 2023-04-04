package com.codegym.stopwach;

public class stopwatch {
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
    stopwatch stopwatch = new stopwatch();

        Thread thread = null;
        thread.sleep(5000);
    stopwatch.start();
    thread.sleep(2000);
    stopwatch.stop();
        System.out.println(stopwatch.getStartTime());
    }
}
