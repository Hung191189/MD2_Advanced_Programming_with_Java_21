package Ung_Dung_Dem_So;

public class CountNumber implements Runnable{
    private Thread myThread;
    public CountNumber(){
        myThread = new Thread(this,"My thread");
        myThread.start();
    }
    public Thread getMyThread(){
        return myThread;
    }

    @Override
    public void run() {
        try {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
                Thread.sleep(1000);
            }
            }catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
