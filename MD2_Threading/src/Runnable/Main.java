package Runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running: ");
        RunnableEx runnableEx = new RunnableEx("Thread-1-HR-Database");
        runnableEx.start();
        RunnableEx runnableEx1 = new RunnableEx("Thread-2-Send-Email");
//        runnableEx1.start();
        System.out.println("stop");

    }
}
